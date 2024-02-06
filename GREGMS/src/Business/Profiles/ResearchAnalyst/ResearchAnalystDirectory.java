/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.ResearchAnalyst;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class ResearchAnalystDirectory {
    ArrayList<ResearchAnalystProfile> ResearchAnalystlist;

    public ResearchAnalystDirectory() {

     ResearchAnalystlist = new ArrayList();

    }

    public ArrayList<ResearchAnalystProfile> getResearchAnalystlist() {
        return ResearchAnalystlist;
    }

    public ResearchAnalystProfile newResearchAnalystProfile(Person p) {

        ResearchAnalystProfile sp = new ResearchAnalystProfile(p);
        ResearchAnalystlist.add(sp);
        return sp;
    }

    public ResearchAnalystProfile findResearchAnalyst(int id) {

        for (ResearchAnalystProfile sp : ResearchAnalystlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
   
}
