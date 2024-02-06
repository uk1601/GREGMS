/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class NotificationCatalog {
    private List<Notification> notificationList;

    public NotificationCatalog() {
        notificationList = new ArrayList<>();
    }
    
    public Notification addNotification(String message) {
        Notification newNotification = new Notification(message);
        notificationList.add(newNotification);
        return newNotification;
    }
    
    public void removeNotification(UUID notificationId) {
        notificationList.removeIf(notification -> notification.getNotificationId().equals(notificationId));
    }
    
    public List<Notification> getNotificationList() {
        return notificationList;
    }
    
    // Additional methods to handle notifications could be added here
}
