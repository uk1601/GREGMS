/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.EnergyProducer;

import Business.Person.Person;
import Business.EnergyProvider.EnergyProducer;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class EnergyProducerProfileDirectory {
    ArrayList<EnergyProducerProfile> energyProducerlist;

    public EnergyProducerProfileDirectory() {

        energyProducerlist = new ArrayList();

    }

    public EnergyProducerProfile newEmployerProfile(Person p, EnergyProducer ep) {

        EnergyProducerProfile epp = new EnergyProducerProfile(p, ep);
        energyProducerlist.add(epp);
        return epp;
    }

    public EnergyProducerProfile findEmployer(int id) {

        for (EnergyProducerProfile ep : energyProducerlist) {
            if (ep.isMatch(id)) {
                return ep;
            }
        }
        return null; //not found after going through the whole list
    }
}
