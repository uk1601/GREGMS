/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class Notification {
    private UUID notificationId;
    private String message;
    private LocalDateTime dateTime;
    
    public Notification(String msg) {
        // Generate a random UUID for each notification
        this.notificationId = UUID.randomUUID();
        this.message = msg;
        this.dateTime = LocalDateTime.now();
    }

    // Getters and setters
    public UUID getNotificationId() {
        return notificationId;
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    
    @Override
    public String toString(){
        return this.notificationId.toString();
    }
}
