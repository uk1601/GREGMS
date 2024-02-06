/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnergyProvider;

import Business.EnergyProvider.EnergyData;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 *
 * @author Mukul
 */
public class EnergyDataCatalog {
    private Map<UUID, EnergyData> energyDataMap;

    public EnergyDataCatalog() {
        energyDataMap = new HashMap<>();
    }

    public EnergyData addEnergyData(UUID producerID, LocalDateTime timestamp, double energyOutput, 
                      String sourceOfEnergy, String productionLocation, String comments) {
        EnergyData ed = new EnergyData(producerID, timestamp, energyOutput, sourceOfEnergy, productionLocation, comments);
        energyDataMap.put(ed.getRecordID(), ed);
        return ed;
    }

    public EnergyData findEnergyDataById(UUID id) {
        return energyDataMap.get(id);
    }
    
    public void removeEnergyData(UUID id) {
        energyDataMap.remove(id);
    }

    
    public List<EnergyData> getEnergyDataByProducerId(UUID producerId) {
        return energyDataMap.values().stream()
                            .filter(data -> producerId.equals(data.getProducerID()))
                            .collect(Collectors.toList());
    }

    public Map<UUID, EnergyData> getEnergyDataMap() {
        return energyDataMap;
    }
    
    public List<EnergyData> getEnergyDataList() {
        return new ArrayList<>(energyDataMap.values());
    }

    public void setEnergyDataMap(Map<UUID, EnergyData> energyDataMap) {
        this.energyDataMap = energyDataMap;
    }
}