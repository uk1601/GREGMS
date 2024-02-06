/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.EnergyProvider;

import Business.EnergyProvider.EnergyOffer;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class EnergyOfferCatalog {
    private Map<UUID, EnergyOffer> offerMap;

    public EnergyOfferCatalog() {
        this.offerMap = new HashMap<>();
    }
    

    public EnergyOffer addEnergyOffer(UUID producerId,  LocalDateTime lastUpdated,String energySource, double quantity, double price, String comments) {
        EnergyOffer offer = new EnergyOffer(producerId, lastUpdated, energySource, quantity, price, comments);
        offerMap.put(offer.getOfferId(), offer);
        return offer;
    }

    public EnergyOffer findEnergyOfferById(UUID offerId) {
        return offerMap.get(offerId);
    }
    
    public void removeEnergyOffer(UUID offerId) {
        offerMap.remove(offerId);
    }

    public List<EnergyOffer> getAllOffers() {
        return new ArrayList<>(offerMap.values());
    }

    // Methods to update offer status...

    public Map<UUID, EnergyOffer> getOfferMap() {
        return offerMap;
    }

    public void setOfferMap(Map<UUID, EnergyOffer> offerMap) {
        this.offerMap = offerMap;
    }

    
}
