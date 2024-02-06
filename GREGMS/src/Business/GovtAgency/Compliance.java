/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovtAgency;

import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class Compliance {
    UUID licenseID;
    String compliance;
    String energyProducer;
    String comments;

    public Compliance(UUID licenseID, String compliance, String energyProducer, String comments) {
        this.licenseID = licenseID;
        this.compliance = compliance;
        this.energyProducer = energyProducer;
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public UUID getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(UUID licenseID) {
        this.licenseID = licenseID;
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }

    public String getEnergyProducer() {
        return energyProducer;
    }

    public void setEnergyProducer(String energyProducer) {
        this.energyProducer = energyProducer;
    }
    
    @Override
    public String toString(){
        return this.licenseID.toString();
    }
}
