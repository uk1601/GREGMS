/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Person.Person;
import Business.Profiles.Profile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Base64;



/**
 *
 * @author kal bugrara
 */
public class UserAccount {
    
    private Profile profile;
    
    private String username;
    
    private String password;
    
    private boolean enabled;
  
    private String salt;
    
    private ArrayList<String> oldPasses;
    
        public UserAccount (Profile profile, String un, String pw){
        this.salt = generateSalt();
        this.oldPasses = new ArrayList();
        this.username = un;
        this.password = hashPassword(pw, this.salt);
        this.oldPasses.add(this.password);
        this.profile = profile; 
        this.enabled= true;
    }

    public int getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }
    
    public boolean isMatch(int id){
        return profile.getPerson().isMatch(id);
    }
    
    public boolean checkPassword(String username, String plainPassword) {
        String hashedPassword = hashPassword(plainPassword, this.salt);
        return hashedPassword.equals(this.password)&& username.equalsIgnoreCase(this.username);
    }
    
    public String getRole(){
        return profile.getRole();
    }
        
    public Profile getAssociatedPersonProfile(){
        return profile;
    }
    
    private String generateSalt() {
        SecureRandom random = new SecureRandom();
        byte[] saltBytes = new byte[16];
        random.nextBytes(saltBytes);
        return Base64.getEncoder().encodeToString(saltBytes);
    }
    
    public static String hashPassword(String password, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(Base64.getDecoder().decode(salt));
            byte[] bytes = md.digest(password.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 algorithm not available.");
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = hashPassword(password, this.salt);
        this.oldPasses.add(this.password);     
    }

    public ArrayList<String> getOldPasses() {
        return oldPasses;
    }

    public String getSalt() {
        return salt;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
     public Person getPerson(){
        return this.profile.getPerson();
     }   
    @Override
    public String toString(){ 
        return getUserLoginName();
    }
        
}

