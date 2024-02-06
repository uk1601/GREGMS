/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class TechnologyProviderCatalog {
    private Map<UUID, TechnologyProvider> inventoryMap;

    public TechnologyProviderCatalog() {
        inventoryMap = new HashMap<>();
    }

    public void addTechnologyInventory(TechnologyProvider inventory) {
        inventoryMap.put(inventory.getInventoryID(), inventory);
    }

    public TechnologyProvider findTechnologyInventoryById(UUID id) {
        return inventoryMap.get(id);
    }

    public void removeTechnologyInventory(UUID id) {
        inventoryMap.remove(id);
    }

    // Additional methods as needed
}