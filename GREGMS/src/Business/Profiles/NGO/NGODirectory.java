/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.NGO;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class NGODirectory {
    ArrayList<NGOProfile> ResearchAnalystlist;

    public NGODirectory() {

     ResearchAnalystlist = new ArrayList();

    }

    public ArrayList<NGOProfile> getNGOlist() {
        return ResearchAnalystlist;
    }

    public NGOProfile newNGOProfile(Person p) {

        NGOProfile sp = new NGOProfile(p);
        ResearchAnalystlist.add(sp);
        return sp;
    }

    public NGOProfile findNGO(int id) {

        for (NGOProfile sp : ResearchAnalystlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
   
}
