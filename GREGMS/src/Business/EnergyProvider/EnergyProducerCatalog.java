/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnergyProvider;

import Business.EnergyProvider.EnergyProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class EnergyProducerCatalog {
    private Map<UUID, EnergyProducer> producerMap;

    public EnergyProducerCatalog() {
        this.producerMap = new HashMap<>();
    }

    // Add a new EnergyProducer to the catalog
    public EnergyProducer addEnergyProducer(String name, String location) {
        EnergyProducer ep = new EnergyProducer(name, location);
        producerMap.put(ep.getProducerID(), ep);
        return ep;
    }

    // Find an EnergyProducer by their UUID
    public EnergyProducer findEnergyProducerById(UUID producerID) {
        return producerMap.get(producerID);
    }

    // Remove an EnergyProducer from the catalog
    public void removeEnergyProducer(UUID producerID) {
        producerMap.remove(producerID);
    }

    // You might also want to add methods to update an EnergyProducer,
    // to list all EnergyProducers, or to find them by certain criteria (e.g., by name or location).

    // Getters and Setters
    public Map<UUID, EnergyProducer> getProducerMap() {
        return producerMap;
    }
    
    public List<EnergyProducer> getAllProducers(){
        return new ArrayList<>(producerMap.values());
    }

    public EnergyProducer findEnergyProducerByLicenseId(UUID licenseId) {
    for (EnergyProducer ep : producerMap.values()) {
        if (ep.getLicenceID() != null && ep.getLicenceID().equals(licenseId)) {
            return ep;
        }
    }
    return null; // Return null if no match is found
}

}
