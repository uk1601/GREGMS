/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovtAgency;

import Business.Utils.NotificationCatalog;
import Business.Utils.RecomendationsCatalog;
import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class GovernmentAgencyData {
    private PolicyCatalog policyCatalog;
    private ComplianceCatalog complianceCatalog;
    private RecomendationsCatalog rc;
    private NotificationCatalog nc;

    public GovernmentAgencyData() {
        policyCatalog = new PolicyCatalog();
        complianceCatalog = new ComplianceCatalog();
        rc= new RecomendationsCatalog();
        nc = new NotificationCatalog();
    }

    public RecomendationsCatalog getRc() {
        return rc;
    }

    public void setRc(RecomendationsCatalog rc) {
        this.rc = rc;
    }

    
    // Method to add a new policy to the catalog
    public Policy addPolicyToCatalog(String policyName, LocalDate effectiveDate, LocalDate endDate, String status, String des) {
        return policyCatalog.addPolicy(policyName, effectiveDate, endDate, status, des);
    }
    
     // Method to add a new compliance to the catalog
    public Compliance addComplianceToCatalog(UUID license, String compliance, String energyProducer, String comments) {
        return complianceCatalog.addCompliance(license, compliance, energyProducer, comments);
    }

    // Getters and Setters
    public PolicyCatalog getPolicyCatalog() {
        return policyCatalog;
    }

    public void setPolicyCatalog(PolicyCatalog policyCatalog) {
        this.policyCatalog = policyCatalog;
    }

    public ComplianceCatalog getComplianceCatalog() {
        return complianceCatalog;
    }

    public void setComplianceCatalog(ComplianceCatalog complianceCatalog) {
        this.complianceCatalog = complianceCatalog;
    }

    public NotificationCatalog getNc() {
        return nc;
    }

    public void setNc(NotificationCatalog nc) {
        this.nc = nc;
    }
    
    
}
