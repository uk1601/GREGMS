/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnergyProvider;


/**
 *
 * @author Mukul
 */
import java.time.LocalDateTime;
import java.util.UUID;

public class EnergyData {
    private UUID recordID;
    private UUID producerID; // Assuming each EnergyData is linked to a specific EnergyProducer
    private LocalDateTime timestamp; // The timestamp when the data was recorded
    private double energyOutput; // The amount of energy produced, measured in MWh
    private LocalDateTime lastUpdated; // The timestamp for the last update to this record
    private String sourceOfEnergy;
    private String comments; 
    private String productionLocation;

    // Constructor
    public EnergyData(UUID producerID, LocalDateTime timestamp, double energyOutput, 
                      String sourceOfEnergy, String productionLocation, String comments) {
        this.recordID = UUID.randomUUID();
        this.producerID = producerID;
        this.timestamp = timestamp;
        this.energyOutput = energyOutput;
        this.lastUpdated = LocalDateTime.now(); // Set to now at creation
        this.sourceOfEnergy = sourceOfEnergy;
        this.productionLocation = productionLocation;
        this.comments = comments;
    }
    
    
    public String getProductionLocation() {
        return productionLocation;
    }

    public void setProductionLocation(String productionLocation) {
        this.productionLocation = productionLocation;
    }

    public UUID getRecordID() {
        return recordID;
    }

    public String getSourceOfEnergy() {
        return sourceOfEnergy;
    }

    public void setSourceOfEnergy(String sourceOfEnergy) {
        this.sourceOfEnergy = sourceOfEnergy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public UUID getProducerID() {
        return producerID;
    }

    public void setProducerID(UUID producerID) {
        this.producerID = producerID;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public double getEnergyOutput() {
        return energyOutput;
    }

    public void setEnergyOutput(double energyOutput) {
        this.energyOutput = energyOutput;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    public String toString(){
        return recordID.toString();
    }
}
