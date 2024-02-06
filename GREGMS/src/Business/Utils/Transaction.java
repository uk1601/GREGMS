/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class Transaction {
    private UUID transactionId;
    private UUID offerId;
    private LocalDateTime transactionDate;
    private String energySource;
    private double amountSold;
    private double transactionPrice;
    private UUID producerId;

    public Transaction(UUID offerId, double amountSold, double transactionPrice, String energySource, UUID producerId) {
        this.transactionId = UUID.randomUUID();
        this.offerId = offerId;
        this.producerId = producerId;
        this.transactionDate = LocalDateTime.now();
        this.amountSold = amountSold;
        this.energySource = energySource;
        this.transactionPrice = transactionPrice;
    }

    public UUID getProducerId() {
        return producerId;
    }

    public void setProducerId(UUID producerId) {
        this.producerId = producerId;
    }

    
    public UUID getTransactionId() {
        return transactionId;
    }

    public String getEnergySource() {
        return energySource;
    }

    public void setEnergySource(String energySource) {
        this.energySource = energySource;
    }

    public void setTransactionId(UUID transactionId) {
        this.transactionId = transactionId;
    }

    public UUID getOfferId() {
        return offerId;
    }

    public void setOfferId(UUID offerId) {
        this.offerId = offerId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(double amountSold) {
        this.amountSold = amountSold;
    }

    public double getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(double transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    
}
