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
public class ResearchData {
    private UUID researchID;
    private String studyResults;
    private String collaborativeProjects; // Could be a collection of project objects

    // Constructor
    public ResearchData(int researchID, String studyResults, String collaborativeProjects) {
        this.researchID = UUID.randomUUID();
        this.studyResults = studyResults;
        this.collaborativeProjects = collaborativeProjects;
    }

    
    // Other methods
    // ... (Additional methods as required)

    public UUID getResearchID() {
        return researchID;
    }

    public void setResearchID(UUID researchID) {
        this.researchID = researchID;
    }

    public String getStudyResults() {
        return studyResults;
    }

    public void setStudyResults(String studyResults) {
        this.studyResults = studyResults;
    }

    public String getCollaborativeProjects() {
        return collaborativeProjects;
    }

    public void setCollaborativeProjects(String collaborativeProjects) {
        this.collaborativeProjects = collaborativeProjects;
    }
}
