/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

/**
 *
 * @author Mukul
 */
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

// Your custom Authenticator class
class MyAuthenticator extends Authenticator {
    private PasswordAuthentication passwordAuthentication;

    public MyAuthenticator(String username, String password) {
        passwordAuthentication = new PasswordAuthentication(username, password);
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return passwordAuthentication;
    }
}


