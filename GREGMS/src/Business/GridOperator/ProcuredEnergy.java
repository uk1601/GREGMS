/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GridOperator;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class ProcuredEnergy {
    private UUID transactionId;
    private UUID producerId;
    private String energySource;
    private double quantity;
    private LocalDateTime transactionDate;

    public ProcuredEnergy(UUID producerId, String energySource, double quantity, LocalDateTime transactionDate) {
        this.transactionId = UUID.randomUUID(); // Generate a unique ID for the transaction
        this.producerId = producerId;
        this.energySource = energySource;
        this.quantity = quantity;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public UUID getProducerId() {
        return producerId;
    }

    public void setProducerId(UUID producerId) {
        this.producerId = producerId;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
    
}

