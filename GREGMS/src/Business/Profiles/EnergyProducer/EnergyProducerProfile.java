/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.EnergyProducer;

import Business.Person.Person;
import Business.Profiles.Profile;
import Business.EnergyProvider.EnergyProducer;

/**
 *
 * @author Mukul
 */
public class EnergyProducerProfile extends Profile{
    Person person;
    
    EnergyProducer energyProducer;
    
    public EnergyProducerProfile(Person person, EnergyProducer energyProducer) {
        super(person);
        this.person = person;
        this.energyProducer = energyProducer;
    }
    
    public EnergyProducer getEnergyProducer() {
        return energyProducer;
    }

    @Override
    public String getRole() {
        return "Energy Producer";
    }
}
