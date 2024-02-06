/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TechnologyProvider;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mukul
 */
public class TechnologyProviderData {
    
    private List<HelpRequest> helpRequests;

    public TechnologyProviderData() {
        helpRequests = new ArrayList();
    }

    public List<HelpRequest> getHelpRequests() {
        return helpRequests;
    }

    public void setHelpRequests(List<HelpRequest> helpRequests) {
        this.helpRequests = helpRequests;
    }
    
    public HelpRequest add(String Description, String RaisedBy){
        HelpRequest h = new HelpRequest(Description, RaisedBy);
        this.helpRequests.add(h);
        return h;
    }
    
    
}
