/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class ConsumerDataCatalog {
    private Map<UUID, ConsumerData> consumerDataMap;

    public ConsumerDataCatalog() {
        consumerDataMap = new HashMap<>();
    }

    public ConsumerData addConsumerData(String n) {
        ConsumerData cd = new ConsumerData(n);
        consumerDataMap.put(cd.getConsumerID(), cd);
        return cd;
    }

    public ConsumerData findConsumerDataById(UUID id) {
        return consumerDataMap.get(id);
    }

    public void removeConsumerData(UUID id) {
        consumerDataMap.remove(id);
    }

    // Additional methods as needed

    public List<ConsumerData> getConsumerData() {
        return new ArrayList<>(this.consumerDataMap.values());
    }
}
