/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.TechnologyProvider;

import Business.Person.Person;
import Business.Profiles.Profile;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mukul
 */
public class TechnologyProviderProfile extends Profile{
    Person person;
    
    public TechnologyProviderProfile(Person p) {
        super(p);
        this.person = p;
    }

    @Override
    public String getRole() {
        return "Technology Provider";
    }
    
    @Override
    public String toString(){
        return String.valueOf(person.getPersonId());
    }

}

