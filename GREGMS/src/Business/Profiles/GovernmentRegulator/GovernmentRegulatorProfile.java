/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.GovernmentRegulator;

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
public class GovernmentRegulatorProfile extends Profile{
    Person person;
    
    public GovernmentRegulatorProfile(Person p) {
        super(p);
        this.person = p;
    }

    @Override
    public String getRole() {
        return "Govt Reg";
    }
    
    @Override
    public String toString(){
        return String.valueOf(person.getPersonId());
    }

}

