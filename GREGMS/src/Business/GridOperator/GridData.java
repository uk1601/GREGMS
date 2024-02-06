/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.GridOperator;

import Business.Utils.NotificationCatalog;
import Business.Utils.Transaction;
import Business.Utils.TransactionCatalog;
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
public class GridData {
    private UUID dataID;
    private double gridLoad;
    private MaintenanceCatalog maintenanceScheduleList;
    private NotificationCatalog nc;// Could be a complex object if needed
    private TransactionCatalog tc;
    private List<ConsumerTransaction> ct;

    // Constructor
    public GridData(int dataID, double gridLoad) {
        this.dataID = UUID.randomUUID();
        this.gridLoad = gridLoad;
        this.maintenanceScheduleList = new MaintenanceCatalog();
        this.nc = new NotificationCatalog();
        this.tc = new TransactionCatalog();
        this.ct = new ArrayList();
    }
    
    public GridData(){
        this.maintenanceScheduleList = new MaintenanceCatalog();
        this.nc = new NotificationCatalog();
        this.tc = new TransactionCatalog();
        this.ct = new ArrayList();
    }

    public List<ConsumerTransaction> getCt() {
        return ct;
    }

    public void setCt(List<ConsumerTransaction> ct) {
        this.ct = ct;
    }
    

    public NotificationCatalog getNc() {
        return nc;
    }

    public TransactionCatalog getTc() {
        return tc;
    }

    public void setTc(TransactionCatalog tc) {
        this.tc = tc;
    }

    
    public void setNc(NotificationCatalog nc) {
        this.nc = nc;
    }


    public UUID getDataID() {
        return dataID;
    }

    public void setDataID(UUID dataID) {
        this.dataID = dataID;
    }

    public double getGridLoad() {
        return gridLoad;
    }

    public void setGridLoad(double gridLoad) {
        this.gridLoad = gridLoad;
    }

    public MaintenanceCatalog getMaintenanceScheduleList() {
        return maintenanceScheduleList;
    }

    public void setMaintenanceScheduleList(MaintenanceCatalog maintenanceScheduleList) {
        this.maintenanceScheduleList = maintenanceScheduleList;
    }

    public double calculateTotalEnergyProcured() {
        double totalEnergy = 0.0;
        for (Transaction transaction : tc.getAllTransactions()) {
            totalEnergy += transaction.getAmountSold();
        }
        return totalEnergy;
    }
    
    public double calculateTotalEnergyConsumered() {
        double totalEnergy = 0.0;
        for (ConsumerTransaction transaction : ct) {
            totalEnergy += transaction.getQuantityOfEnergy();
        }
        return totalEnergy;
    }
    
    public void addCt(ConsumerTransaction c){
        ct.add(c);
    }
    
    public double findTotalConsumptionByConsumerId( UUID consumerId) {
        double totalConsumption = 0;

        for (ConsumerTransaction transaction : this.ct) {
            if (transaction.getConsumerId().equals(consumerId)) {
                totalConsumption += transaction.getQuantityOfEnergy();
            }
        }

        return totalConsumption;
    }
    
    public double findTotalAmountByConsumerId( UUID consumerId) {
        double totalConsumption = 0;

        for (ConsumerTransaction transaction : this.ct) {
            if (transaction.getConsumerId().equals(consumerId)) {
                totalConsumption += transaction.getPrice();
            }
        }

        return totalConsumption;
    }
    
    public int findTotalConsumers(){
        
        Map<UUID, ConsumerTransaction> m = new HashMap<>();
        for (ConsumerTransaction transaction : this.ct) {
            m.put(transaction.getConsumerId(), transaction);
        }
        
        return m.size();
    }
    
    public Map<String, Double> aggregateAmountSoldByEnergySource() {
        Map<String, Double> amountSoldBySource = new HashMap<>();

        for (Transaction transaction : this.tc.getAllTransactions()) {
            String source = transaction.getEnergySource();
            double amount = transaction.getAmountSold();

            amountSoldBySource.merge(source, amount, Double::sum);
        }

        return amountSoldBySource;
    }
    
    
}

