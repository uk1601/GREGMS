/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.Admin;
import Business.Person.Person;
import Business.Profiles.Profile;


/**
 *
 * @author Mukul
 */
public class AdminProfile extends Profile{
    Person person;
    
    public AdminProfile(Person p) {
        super(p);
        this.person = p;
    }

    @Override
    public String getRole() {
        return "Admin";
    }
    
    public String toString(){
        return String.valueOf(person.getPersonId());
    }

}
