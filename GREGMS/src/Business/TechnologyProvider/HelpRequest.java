/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TechnologyProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class HelpRequest {
    
    private UUID helpID;
    private String Description;
    private String Raisedby;
    private LocalDateTime date;

    public HelpRequest(String Description, String RaisedBy) {
        this.helpID = UUID.randomUUID();
        this.Description = Description;
        this.Raisedby = RaisedBy;
        this.date = LocalDateTime.now(); 
    }

    public String getRaisedby() {
        return Raisedby;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setRaisedby(String Raisedby) {
        this.Raisedby = Raisedby;
    }
    

    public UUID getHelpID() {
        return helpID;
    }

    public void setHelpID(UUID helpID) {
        this.helpID = helpID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    @Override
    public String toString(){
        return this.helpID.toString();
    }
    
}
