/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.ConsumerRepresentativeProfile;


import Business.Consumer.ConsumerData;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class ConsumerRepresentativeDirectory {
    ArrayList<ConsumerRepresentativeProfile> consumerRepresentativelist;

    public ConsumerRepresentativeDirectory() {

        consumerRepresentativelist = new ArrayList();

    }

    public ArrayList<ConsumerRepresentativeProfile> getConsumerRepresentativelist() {
        return consumerRepresentativelist;
    }

    public ConsumerRepresentativeProfile newConsumerRepresentativeProfile(Person p, ConsumerData cd) {

        ConsumerRepresentativeProfile sp = new ConsumerRepresentativeProfile(p, cd  );
        consumerRepresentativelist.add(sp);
        return sp;
    }

    public ConsumerRepresentativeProfile findConsumerRepresentative(int id) {

        for (ConsumerRepresentativeProfile sp : consumerRepresentativelist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
   
}
