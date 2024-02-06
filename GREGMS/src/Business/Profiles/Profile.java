/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Person.Person;

/**
 *
 * @author Mukul
 */
public abstract class Profile {
    Person person;
     public Profile(Person p){
        person = p;
        
    }
    
     public abstract String getRole();
    
    public Person getPerson(){
        return person;
    }
     

    public boolean isMatch(int id) {
        return person.isMatch(id);
    }
}
