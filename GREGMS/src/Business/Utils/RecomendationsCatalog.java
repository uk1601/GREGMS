/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.util.ArrayList;

/**
 *
 * @author Mukul
 */
public class RecomendationsCatalog {
    ArrayList<Recomendations> rs;

    public RecomendationsCatalog() {
        rs = new ArrayList<>();
    }

    public Recomendations addNewR(String from, String title, String description){
        Recomendations r = new Recomendations(from, title, description);
        rs.add(r);
        return r;
    }
    public ArrayList<Recomendations> getRs() {
        return rs;
    }

    public void setRs(ArrayList<Recomendations> rs) {
        this.rs = rs;
    }
    
}

