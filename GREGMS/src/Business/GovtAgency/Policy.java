/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovtAgency;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class Policy {
    private UUID policyID;
    private String policyName;
    private LocalDate effectiveDate;
    private LocalDate endDate;
    private String status;
    private String description;

    public Policy(String policyName, LocalDate effectiveDate, LocalDate endDate, String status, String description) {
        this.policyID = UUID.randomUUID();
        this.policyName = policyName;
        this.effectiveDate = effectiveDate;
        this.endDate = endDate;
        this.status = status;
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }

    // Getters and Setters
    public void setDescription(String description) {    
        this.description = description;
    }

    public UUID getPolicyID() {
        return policyID;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return policyID.toString();
    }
}

