/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GridOperator;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class ProcuredEnergyCatalog {
    private Map<UUID, ProcuredEnergy> procuredEnergyMap;

    public ProcuredEnergyCatalog() {
        this.procuredEnergyMap = new HashMap<>();
    }

    public ProcuredEnergy addProcuredEnergy(UUID producerId, String energySource, double quantity, LocalDateTime transactionDate) {
        ProcuredEnergy newTransaction = new ProcuredEnergy(producerId, energySource, quantity, transactionDate);
        procuredEnergyMap.put(newTransaction.getTransactionId(), newTransaction);
        return newTransaction;
    }

    // Other methods such as find, remove, and getters for the map
    public ProcuredEnergy findProcuredEnergyById(UUID transactionId) {
        return procuredEnergyMap.get(transactionId);
    }

    public void removeProcuredEnergy(UUID transactionId) {
        procuredEnergyMap.remove(transactionId);
    }

    public Map<UUID, ProcuredEnergy> getProcuredEnergyMap() {
        return procuredEnergyMap;
    }
}
