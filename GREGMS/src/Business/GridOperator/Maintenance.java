/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GridOperator;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class Maintenance {
    private UUID maintenanceId;
    private LocalDate dateForMaintenance;
    private String comments;

    public Maintenance(LocalDate dateForMaintenance, String comments) {
        this.maintenanceId = UUID.randomUUID(); // Generate a unique identifier
        this.dateForMaintenance = dateForMaintenance;
        this.comments = comments;
    }

    // Getters and setters
    public UUID getMaintenanceId() {
        return maintenanceId;
    }

    public LocalDate getDateForMaintenance() {
        return dateForMaintenance;
    }

    public void setDateForMaintenance(LocalDate dateForMaintenance) {
        this.dateForMaintenance = dateForMaintenance;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    @Override
    public String toString(){
        return this.maintenanceId.toString();
    }
}
