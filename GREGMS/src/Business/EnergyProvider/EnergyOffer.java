/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnergyProvider;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class EnergyOffer {
    private UUID offerId;
    private UUID producerId;
    private LocalDateTime lastUpdated;
    private String energySource;
    private double quantity;
    private double price;
    private String comments;
    private String status; // e.g., "Available", "Sold", etc.

    public EnergyOffer(UUID producerId, LocalDateTime lastUpdated, String energySource, double quantity, double price, String comments) {
        this.offerId = UUID.randomUUID();
        this.producerId = producerId;
        this.energySource = energySource;
        this.quantity = quantity;
        this.price = price;
        this.comments = comments;
        this.lastUpdated = lastUpdated;
        this.status = "Available";
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public UUID getOfferId() {
        return offerId;
    }

    public void setOfferId(UUID offerId) {
        this.offerId = offerId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return offerId.toString();
    }
    
}
