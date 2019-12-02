package ch.hslu.edu.enapp.webshop.dto;

public class Customer {

    private String loginName;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String dynNavCustNo;

    public Customer(String loginName, String firstName, String lastName, String address, String email, String dynNavCustNo) {
        this.loginName = loginName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.dynNavCustNo = dynNavCustNo;
    }

    public Customer(String loginName, String firstName, String lastName, String address, String email) {
        this.loginName = loginName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public Customer() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDynNavCustNo() {
        return dynNavCustNo;
    }

    public void setDynNavCustNo(String dynNavCustNo) {
        this.dynNavCustNo = dynNavCustNo;
    }
}
