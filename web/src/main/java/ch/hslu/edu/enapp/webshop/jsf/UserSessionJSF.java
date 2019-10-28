package ch.hslu.edu.enapp.webshop.jsf;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;
@Named
@SessionScoped
public class UserSessionJSF implements Serializable {
    private static final long serialVersionUID = 1492259801008765070L;
    private String username;
    public String getUsername() {
        if (null == username) {
            try {
                final FacesContext facesContext =
                        FacesContext.getCurrentInstance();
                username =
                        facesContext.getExternalContext().getUserPrincipal().getName();
                final FacesMessage message = new
                        FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Hello " + username, "");
                facesContext.addMessage(null, message);
                facesContext.getExternalContext().getFlash().setKeepMessages(true);
            } catch (NullPointerException ex) {
                username = null;
            }
        }
        return username;
    }
    public String logout() throws IOException {
        final FacesContext facesContext = FacesContext.getCurrentInstance();
        facesContext.getExternalContext().invalidateSession();
        final FacesMessage message = new
                FacesMessage(FacesMessage.SEVERITY_INFO,
                "Goodbye " + username, "");
        facesContext.addMessage(null, message);
        facesContext.getExternalContext().getFlash().setKeepMessages(true);
        return "/index?faces-redirect=true";
    }
}