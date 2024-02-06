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
public class ResearchDataCatalog {
    private Map<UUID, ResearchData> researchDataMap;

    public ResearchDataCatalog() {
        researchDataMap = new HashMap<>();
    }

    public void addResearchData(ResearchData data) {
        researchDataMap.put(data.getResearchID(), data);
    }

    public ResearchData findResearchDataById(UUID id) {
        return researchDataMap.get(id);
    }

    public void removeResearchData(UUID id) {
        researchDataMap.remove(id);
    }

    // Additional methods as needed
}
