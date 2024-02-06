/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles.GridOperator;

import Business.Person.Person;
import java.util.ArrayList;


/**
 *
 * @author Mukul
 */
public class GridOperatorDirectory {
    ArrayList<GridOperatorProfile> gridOperatorlist;

    public GridOperatorDirectory() {

        gridOperatorlist = new ArrayList();

    }

    public ArrayList<GridOperatorProfile> getGridOperatorlist() {
        return gridOperatorlist;
    }

    public GridOperatorProfile newGridOperatorProfile(Person p) {

        GridOperatorProfile pp = new GridOperatorProfile(p);
        gridOperatorlist.add(pp);
        return pp;
    }

    public GridOperatorProfile findGridOperator(int id) {

        for (GridOperatorProfile pp : gridOperatorlist) {
            if (pp.isMatch(id)) {
                return pp;
            }
        }
        return null; //not found after going through the whole list
    }
}
