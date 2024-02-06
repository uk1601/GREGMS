/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovtAgency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class ComplianceCatalog {
    private Map<UUID, Compliance> complianceMap;

    public ComplianceCatalog() {
        complianceMap = new HashMap<>();
    }

    public Compliance addCompliance(UUID licenseID, String compliance, String energyProducer, String comments) {
        Compliance newCompliance = new Compliance(licenseID, compliance, energyProducer, comments);
        complianceMap.put(licenseID, newCompliance);
        return newCompliance;
    }

    public Compliance findComplianceById(UUID id) {
        return complianceMap.get(id);
    }

    public void removeCompliance(UUID id) {
        complianceMap.remove(id);
    }

    public List<Compliance> getAllCompliances() {
        return new ArrayList<>(complianceMap.values());
    }

    public Map<UUID, Compliance> getComplianceMap() {
        return complianceMap;
    }

    public void setComplianceMap(Map<UUID, Compliance> complianceMap) {
        this.complianceMap = complianceMap;
    }
}
