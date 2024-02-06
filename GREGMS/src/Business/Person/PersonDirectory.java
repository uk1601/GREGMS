/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class PersonDirectory {
    
    ArrayList<Person> personlist ;
    
    public PersonDirectory (){        
        personlist = new ArrayList();    
    }
    
    public Person newPerson(String name) {
        Person p = new Person(name);
        personlist.add(p);
        return p;    
    }
    
    public Person findPersonWithId(int id) {
        for (Person p : personlist) {
            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
    
     public ArrayList<Person> findPersonWithName(String id) {
        ArrayList<Person> sameName = new ArrayList();
        for (Person p : personlist) {
            if (p.isMatchName(id)) {
                sameName.add(p);
            }
        }
        return sameName;
    }
    
}
