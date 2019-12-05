package ch.hslu.edu.enapp.webshop.jsf;


import ch.hslu.edu.enapp.webshop.dto.Customer;
import ch.hslu.edu.enapp.webshop.services.CustomerServiceLocal;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Named
@SessionScoped
public class UpdateAccountAdminJSF implements Serializable {


    @Inject
    CustomerServiceLocal customerService;

    @Inject
    UserSessionJSF user;

    private Customer customer;
    private String password;


    public UpdateAccountAdminJSF() {
    }

    public String update(){
        String userS = user.getUsername();
        Customer customer = customerService.getCustomerByLoginName(user.getUsername());
        this.customer = customer;
        this.password = "";
        return "/settings";
    }

    public void updateAccount() {
        try {
            customerService.updateCustomer(customer, encryptThisString(password));
        }catch (Exception e){
            showErrorMessage("Changes could not be accepted.");
        }

        showOKMessage("Changes were saved successfully.");
    }

    private String encryptThisString(String input) {
        try {
            // getInstance() method is called with algorithm SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // digest() method is called
            // to calculate message digest of the input string
            // returned as array of byte
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation

            return byteArrayToHexString(messageDigest);
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private String byteArrayToHexString(byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void showErrorMessage(String message) {
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, message, "");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }


    private void showOKMessage(String message) {
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, message, "");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }

}
