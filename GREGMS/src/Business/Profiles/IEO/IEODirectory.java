/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.IEO;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class IEODirectory {
    ArrayList<IEOProfile> IEOlist;

    public IEODirectory() {

     IEOlist = new ArrayList();

    }

    public ArrayList<IEOProfile> getIEOlist() {
        return IEOlist;
    }

    public IEOProfile newIEOProfile(Person p) {

        IEOProfile sp = new IEOProfile(p);
        IEOlist.add(sp);
        return sp;
    }

    public IEOProfile findIEO(int id) {

        for (IEOProfile sp : IEOlist) {
            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
   
}
