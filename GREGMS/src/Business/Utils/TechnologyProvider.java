/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class TechnologyProvider {
    private UUID inventoryID;
    private Map<String, Integer> technologyItems; // Key: Item name, Value: Quantity
    private String supplierDetails; // Could be a complex object for detailed information

    // Constructor
    public TechnologyProvider(int inventoryID, Map<String, Integer> technologyItems, String supplierDetails) {
        this.inventoryID = UUID.randomUUID();
        this.technologyItems = technologyItems;
        this.supplierDetails = supplierDetails;
    }

    public Map<String, Integer> getTechnologyItems() {    
        return technologyItems;
    }

    // Other methods
    // ... (Additional methods as required)
    public void setTechnologyItems(Map<String, Integer> technologyItems) {
        this.technologyItems = technologyItems;
    }

    public UUID getInventoryID() {
        return inventoryID;
    }

    public String getSupplierDetails() {
        return supplierDetails;
    }

    public void setSupplierDetails(String supplierDetails) {
        this.supplierDetails = supplierDetails;
    }
}

