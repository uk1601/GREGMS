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
public class ConsumerTransaction {
    private UUID transactionId;
    private UUID consumerId;
    private LocalDateTime date;
    private double quantityOfEnergy;
    private Double price;
    private String comments;

    public ConsumerTransaction(UUID consumerId, double quantityOfEnergy, Double price, String comments, LocalDateTime date) {
        this.transactionId = UUID.randomUUID(); // Generates a unique identifier for the transaction
        this.consumerId = consumerId; // This should be passed when creating a new transaction
        this.date = date; // Sets the current date and time for the transaction
        this.quantityOfEnergy = quantityOfEnergy;
        this.comments = comments;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    

    public UUID getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public UUID getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(UUID consumerId) {
        this.consumerId = consumerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getQuantityOfEnergy() {
        return quantityOfEnergy;
    }

    public void setQuantityOfEnergy(double quantityOfEnergy) {
        this.quantityOfEnergy = quantityOfEnergy;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
