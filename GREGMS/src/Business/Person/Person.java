/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.awt.Image;

/**
 *
 * @author Mukul
 */
public class Person {
    
    private static final int MIN_ID = 10000;
    private static final int MAX_ID = 99999;
    
    private static final java.util.Random RANDOM = new java.util.Random();
    
    private String name;
    
    private int personId;
    
    private String email;
    
    private long phone;
    
    private Image img;
    
    private boolean hidePh;
    
    public Person(String name) {
        this.name = name;
        this.personId = generateRandomId();
        this.hidePh = false;
    }

    private int generateRandomId() {
        return RANDOM.nextInt(MAX_ID - MIN_ID + 1) + MIN_ID;
    }
    
    public boolean isMatch(int id){
        if(getPersonId() == id){
            return true;
        }
        return false;
    }
    
    public boolean isMatchName(String name){
        if(getName().equals(name)){
            return true;
        }
        return false;
    }

    public boolean isHidePh() {
        return hidePh;
    }

    public void setHidePh(boolean hidePh) {
        this.hidePh = hidePh;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    
}
