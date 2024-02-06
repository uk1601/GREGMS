/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Consumer;

import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class ConsumerData {
    private UUID consumerID;
    private double energyUsage;
    private String feedback;
    private String name;

    // Constructor
    public ConsumerData(String name) {
        this.consumerID = UUID.randomUUID();
        this.name = name;
     
    }
    

    public String getName() {
        return name;
    }

    // Other methods
    public void setName(String name) {    
        this.name = name;
    }

    public UUID getConsumerID() {
        return consumerID;
    }


    public double getEnergyUsage() {
        return energyUsage;
    }

    public void setEnergyUsage(double energyUsage) {
        this.energyUsage = energyUsage;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    public String toString(){
        return this.name;
    }
}

