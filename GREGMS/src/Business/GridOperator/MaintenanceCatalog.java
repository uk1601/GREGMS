/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GridOperator;

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
public class MaintenanceCatalog {
    private Map<UUID, Maintenance> maintenanceRecords;

    public MaintenanceCatalog() {
        maintenanceRecords = new HashMap<>();
    }

    public Maintenance addMaintenanceRecord(LocalDate dateForMaintenance, String comments) {
        Maintenance newRecord = new Maintenance(dateForMaintenance, comments);
        maintenanceRecords.put(newRecord.getMaintenanceId(), newRecord);
        return newRecord;
    }

    public Maintenance findMaintenanceById(UUID id) {
        return maintenanceRecords.get(id);
    }

    public void removeMaintenanceRecord(UUID id) {
        maintenanceRecords.remove(id);
    }

    public List<Maintenance> getAllMaintenanceRecords() {
        return new ArrayList<>(maintenanceRecords.values());
    }
    
}