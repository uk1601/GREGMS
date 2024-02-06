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
public class RegulatoryComplianceCatalog {
    private Map<UUID, RegulatoryCompliance> complianceMap;

    public RegulatoryComplianceCatalog() {
        complianceMap = new HashMap<>();
    }

    public void addRegulatoryCompliance(RegulatoryCompliance compliance) {
        complianceMap.put(compliance.getComplianceID(), compliance);
    }

    public RegulatoryCompliance findRegulatoryComplianceById(UUID id) {
        return complianceMap.get(id);
    }

    public void removeRegulatoryCompliance(UUID id) {
        complianceMap.remove(id);
    }

    // Additional methods as needed
}
