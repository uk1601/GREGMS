/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.Admin;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class AdminDirectory {
    private ArrayList<AdminProfile> admins;
    
    
    public AdminDirectory() {

     admins = new ArrayList();

    }

    public AdminProfile newAdminProfile(Person p) {

        AdminProfile ap = new AdminProfile(p);
        admins.add(ap);
        return ap;
    }

    public AdminProfile findAdmin(int id) {

        for (AdminProfile ap : admins) {
            if (ap.isMatch(id)) {
                return ap;
            }
        }
        return null; //not found after going through the whole list
    }
}
