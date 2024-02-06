/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.time.LocalDateTime;

/**
 *
 * @author Mukul
 */
public class Recomendations {
    private String from;
    private String title;
    private String description;
    private LocalDateTime date;

    public Recomendations(String from, String title, String description) {
        this.from = from;
        this.title = title;
        this.description = description;
        this.date = LocalDateTime.now();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
            
    
}
