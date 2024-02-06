/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import Business.Business;
import Business.Consumer.ConsumerData;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EnergyProducer.EnergyProducerProfile;
import Business.Profiles.EnergyProducer.EnergyProducerProfileDirectory;
import Business.Users.UserAccountDirectory;
import Business.EnergyProvider.EnergyDataCatalog;
import Business.EnergyProvider.EnergyOffer;
import Business.EnergyProvider.EnergyOfferCatalog;
import Business.EnergyProvider.EnergyProducer;
import Business.EnergyProvider.EnergyProducerCatalog;
import Business.GovtAgency.GovernmentAgencyData;
import Business.GridOperator.ConsumerTransaction;
import Business.Profiles.ConsumerRepresentativeProfile.ConsumerRepresentativeProfile;
import Business.Profiles.GovernmentRegulator.GovernmentRegulatorProfile;
import Business.Profiles.GridOperator.GridOperatorProfile;
import Business.Profiles.IEO.IEOProfile;
import Business.Profiles.NGO.NGOProfile;
import Business.Profiles.ResearchAnalyst.ResearchAnalystProfile;
import Business.Profiles.TechnologyProvider.TechnologyProviderProfile;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

/**
 *
 * @author Mukul
 */
public class ConfigureBusiness {
    
    static Business initialize() {
        Business business = new Business();
        LocalDateTime now = LocalDateTime.now();
        Random random = new Random();

        // Initialize directories and catalogs
        UserAccountDirectory userAccounts = business.getUserAcconts();
        EnergyProducerProfileDirectory energyProducerProfiles = business.getEnergyProducerProfiles();
        EnergyProducerCatalog energyProducers = business.getEnergyProducers();
        PersonDirectory personDirectory = business.getPersonDirectory();
        GovernmentAgencyData govtAgencyCatalog = business.getGac();

        // Realistic names for energy producers
        String[] producerNames = {"GreenFlow Energy", "Sunrise Power", "WindSail Renewables", "AquaStream Hydropower", "EcoBright Solar"};
        String[] locations = {"Boston", "New York", "San Francisco", "Chicago", "Los Angeles"};
        String[][] energySources = {
            {"Hydro", "Solar", "Wind"},
            {"Solar", "Wind"},
            {"Wind", "Hydro", "Biomass"},
            {"Hydro"},
            {"Solar", "Wind"}
        };

        for (int i = 0; i < producerNames.length; i++) {
            Person epPerson = personDirectory.newPerson("ep" + (i + 1));
            EnergyProducer ep = energyProducers.addEnergyProducer(producerNames[i], locations[i]);
            EnergyProducerProfile pp = energyProducerProfiles.newEmployerProfile(epPerson, ep);
            userAccounts.newUserAccount(pp, "ep" + (i + 1), "pass" + (i + 1));

            EnergyDataCatalog energyDataRecords = ep.getEdc();
            for (String energySource : energySources[i]) {
                for (int day = 0; day < 10; day++) {
                    int energyProduced = 100000 + random.nextInt(500000);
                    energyDataRecords.addEnergyData(ep.getProducerID(), now.minusDays(day), energyProduced, energySource, locations[i], "Generated data");
                }
            }

            EnergyOfferCatalog energyoffers = ep.getEoc();
            for (String energySource : energySources[i]) {
                for (int day = 0; day < 10; day++) {
                    double price = 5000 + random.nextDouble() * 5000;
                    int quantity = 50000 + random.nextInt(200000);
                    EnergyOffer eo = energyoffers.addEnergyOffer(ep.getProducerID(), now.minusDays(day), energySource, price, quantity, "Generated Data");
                    business.getGridData().getTc().recordTransaction(eo.getOfferId(), 2000, 300000, eo.getEnergySource(), ep.getProducerID());
                }
            }

            govtAgencyCatalog.addComplianceToCatalog(ep.getLicenceID(), "Compliant", ep.getName(), "No Comments");
        }

        // Add multiple realistic policies
        String[] policyNames = {"Renewable Energy Incentive", "Carbon Emission Reduction", "Clean Energy Subsidy", "Sustainable Urban Development"};
        String[] policyStatuses = {"Active", "Pending", "Under Review"};
        String[] policyDescriptions = {
            "Incentives for companies investing in renewable energy sources.",
            "Regulations aimed at reducing carbon emissions in industrial sectors.",
            "Subsidies provided for the development and use of clean energy solutions.",
            "Policies to promote sustainable urban development and green spaces."
        };

        for (int i = 0; i < policyNames.length; i++) {
            govtAgencyCatalog.addPolicyToCatalog(policyNames[i], LocalDate.EPOCH, LocalDate.of(2120+i, 12, 12), policyStatuses[i % policyStatuses.length], policyDescriptions[i]);
        }

        // Realistic names for consumers
        String[] consumerNames = {"John Doe", "Emma Johnson", "Michael Smith", "Olivia Williams", "David Brown"};
        int[] consumerUsagePatterns = {100, 150, 200, 250, 300};

        for (int i = 0; i < consumerNames.length; i++) {
            Person consumerPerson = personDirectory.newPerson("cr" + (i + 1));
            ConsumerData cd = business.getConsumerDataCatalog().addConsumerData(consumerNames[i]);
            ConsumerRepresentativeProfile crp = business.getCrp().newConsumerRepresentativeProfile(consumerPerson, cd);
            userAccounts.newUserAccount(crp, "cr" + (i + 1), "pass" + (i + 1));
            
            for (int j = 0; j < 30; j++) {
                double amount = consumerUsagePatterns[i] * (0.8 + Math.random() * 0.4);
                business.getGridData().addCt(new ConsumerTransaction(cd.getConsumerID(), consumerUsagePatterns[i], amount, "AutoGenerated", now.minusDays(j)));
            }
        }
        
        Person tpPerson = personDirectory.newPerson("tp1");
        TechnologyProviderProfile tpp = business.getTp().newTechnologyProviderProfile(tpPerson);
        userAccounts.newUserAccount(tpp, "tp", "tp");
        
        
        Person raPerson = personDirectory.newPerson("ra");
        Person ieoPerson = personDirectory.newPerson("ieo");
        Person ngoPerson = personDirectory.newPerson("ngo");
        
        ResearchAnalystProfile rap = business.getRad().newResearchAnalystProfile(raPerson);
        NGOProfile ngop = business.getNgod().newNGOProfile(ngoPerson);
        IEOProfile ieop = business.getIeod().newIEOProfile(ieoPerson);
        
        userAccounts.newUserAccount(rap, "ra", "ra");
        userAccounts.newUserAccount(ngop, "ngo", "ngo");
        userAccounts.newUserAccount(ieop, "ieo", "ieo");
        
        Person goPerson = personDirectory.newPerson("go1");
        GridOperatorProfile go = business.getGridOperatorProfiles().newGridOperatorProfile(goPerson);
        userAccounts.newUserAccount(go, "go", "go");
        
        Person gaPerson = personDirectory.newPerson("ga1");
        GovernmentRegulatorProfile gp = business.getGovtReg().newGovernmentRegulatorProfile(gaPerson);
        userAccounts.newUserAccount(gp, "ga", "ga");

        return business;
    }
}