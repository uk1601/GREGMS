/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class RegulatoryCompliance {
    private UUID complianceID;
    private String regulations; // This could be a more complex structure
    private String auditReports; // Could be a list of reports

    // Constructor
    public RegulatoryCompliance(int complianceID, String regulations, String auditReports) {
        this.complianceID = UUID.randomUUID();
        this.regulations = regulations;
        this.auditReports = auditReports;
    }

    
    // Other methods
    // ... (Additional methods as required)

    public UUID getComplianceID() {
        return complianceID;
    }

    public void setComplianceID(UUID complianceID) {
        this.complianceID = complianceID;
    }

    public String getRegulations() {
        return regulations;
    }

    public void setRegulations(String regulations) {
        this.regulations = regulations;
    }

    public String getAuditReports() {
        return auditReports;
    }

    public void setAuditReports(String auditReports) {
        this.auditReports = auditReports;
    }
}
