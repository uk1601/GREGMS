/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.TechnologyProvider;


import Business.Profiles.ConsumerRepresentativeProfile.ConsumerRepresentativeProfile;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class TechnologyProviderDirectory {
    ArrayList<TechnologyProviderProfile> technologyProviderlist;

    public TechnologyProviderDirectory() {

        technologyProviderlist = new ArrayList();

    }

    public ArrayList<TechnologyProviderProfile> getTechnologyProviderlist() {
        return technologyProviderlist;
    }

    public TechnologyProviderProfile newTechnologyProviderProfile(Person p) {

        TechnologyProviderProfile sp = new TechnologyProviderProfile(p);
        technologyProviderlist.add(sp);
        return sp;
    }

    public TechnologyProviderProfile findTechnologyProvider(int id) {

        for (TechnologyProviderProfile sp : technologyProviderlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
   
}
