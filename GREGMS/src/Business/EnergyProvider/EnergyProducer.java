/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnergyProvider;

import Business.Utils.NotificationCatalog;
import Business.Utils.TransactionCatalog;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class EnergyProducer {
    private UUID producerID;
    private String name;
    private String location;
    private UUID licenceID;
    private EnergyOfferCatalog eoc;
    private EnergyDataCatalog edc;
    private NotificationCatalog nc;
    // Other attributes related to the energy producer

    // Constructor
    public EnergyProducer(String name, String location) {
        this.producerID = UUID.randomUUID();
        this.licenceID = UUID.randomUUID();
        this.name = name;
        this.location = location;
        this.eoc = new EnergyOfferCatalog();
        this.edc = new EnergyDataCatalog();
        this.nc = new NotificationCatalog();
        // Initialize other attributes
    }

    public NotificationCatalog getNc() {
        return nc;
    }
    
    // Getters and Setters
    public void setNc(NotificationCatalog nc) {
        this.nc = nc;
    }

    public EnergyOfferCatalog getEoc() {
        return eoc;
    }

    public UUID getLicenceID() {
        return licenceID;
    }

    public EnergyDataCatalog getEdc() {
        return edc;
    }

    public void setEdc(EnergyDataCatalog edc) {
        this.edc = edc;
    }

    public void setEoc(EnergyOfferCatalog eoc) {
        this.eoc = eoc;
    }
    
    
    public UUID getProducerID() {
        return producerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

