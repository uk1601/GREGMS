/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.ConsumerRepresentativeProfile;

import Business.Consumer.ConsumerData;
import Business.EnergyProvider.EnergyProducer;
import Business.Person.Person;
import Business.Profiles.Profile;

/**
 *
 * @author Mukul
 */
public class ConsumerRepresentativeProfile extends Profile{
    Person person;
    ConsumerData cd;
    public ConsumerRepresentativeProfile(Person p, ConsumerData cd) {
        super(p);
        this.person = p;
        this.cd = cd;
    }

    @Override
    public String getRole() {
        return "Consumer";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ConsumerData getCd() {
        return cd;
    }

    public void setCd(ConsumerData cd) {
        this.cd = cd;
    }
    
    @Override
    public String toString(){
        return String.valueOf(person.getPersonId());
    }

}

