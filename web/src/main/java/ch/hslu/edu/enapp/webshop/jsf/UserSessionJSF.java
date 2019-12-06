package ch.hslu.edu.enapp.webshop.jsf;

import ch.hslu.edu.enapp.webshop.dto.Customer;
import ch.hslu.edu.enapp.webshop.services.CustomerServiceLocal;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;
@Named
@SessionScoped
public class UserSessionJSF implements Serializable {
    private static final long serialVersionUID = 1492259801008765070L;
    private String username;
    private String userRole;

    @Inject
    CustomerServiceLocal customerService;

    public String getUsername() {
        if (null == username) {
            try {
                final FacesContext facesContext =
                        FacesContext.getCurrentInstance();
                username =
                        facesContext.getExternalContext().getUserPrincipal().getName();
            } catch (NullPointerException ex) {
                username = null;
            }
        }
        return username;
    }

    public String getUserRole(){
        if (null == userRole) {
            try {
                final FacesContext facesContext =
                        FacesContext.getCurrentInstance();
                username =
                        facesContext.getExternalContext().getUserPrincipal().getName();

                this.userRole = customerService.getRoleByCustomerName(username);
            } catch (NullPointerException ex) {
                userRole = null;
            }
        }
        return userRole;
    }

    public String logout() throws IOException {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().invalidateSession();
        return "/index?faces-redirect=true";
    }
}