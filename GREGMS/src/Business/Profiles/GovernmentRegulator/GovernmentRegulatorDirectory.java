/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.GovernmentRegulator;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class GovernmentRegulatorDirectory {
    ArrayList<GovernmentRegulatorProfile> governmentRegulatorlist;

    public GovernmentRegulatorDirectory() {

        governmentRegulatorlist = new ArrayList();

    }

    public ArrayList<GovernmentRegulatorProfile> getGovernmentRegulatorlist() {
        return governmentRegulatorlist;
    }

    public GovernmentRegulatorProfile newGovernmentRegulatorProfile(Person p) {

        GovernmentRegulatorProfile sp = new GovernmentRegulatorProfile(p);
        governmentRegulatorlist.add(sp);
        return sp;
    }

    public GovernmentRegulatorProfile findGovernmentRegulator(int id) {

        for (GovernmentRegulatorProfile sp : governmentRegulatorlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
   
}
