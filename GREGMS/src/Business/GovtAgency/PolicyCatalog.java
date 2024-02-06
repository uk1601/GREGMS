/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GovtAgency;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class PolicyCatalog {
    private Map<UUID, Policy> policies;

    public PolicyCatalog() {
        policies = new HashMap<>();
    }

    public Policy addPolicy(String policyName, LocalDate effectiveDate, LocalDate endDate, String status, String des) {
        Policy newPolicy = new Policy(policyName, effectiveDate, endDate, status, des);
        policies.put(newPolicy.getPolicyID(), newPolicy);
        return newPolicy;
    }

    public Policy findPolicyById(UUID id) {
        return policies.get(id);
    }

    public void removePolicy(UUID id) {
        policies.remove(id);
    }

    
    // Additional methods to retrieve and update policies can be added here


    public void setPolicies(Map<UUID, Policy> policies) {
        this.policies = policies;
    }
    
    public List<Policy> getAllPolicies() {
        return new ArrayList<>(policies.values());
    }
}