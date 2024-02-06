/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Consumer.ConsumerDataCatalog;
import Business.Person.PersonDirectory;
import Business.Profiles.EnergyProducer.EnergyProducerProfileDirectory;
import Business.Users.UserAccountDirectory;
import Business.EnergyProvider.EnergyDataCatalog;
import Business.EnergyProvider.EnergyProducerCatalog;
import Business.GovtAgency.GovernmentAgencyData;
import Business.Profiles.GovernmentRegulator.GovernmentRegulatorDirectory;
import Business.Profiles.GridOperator.GridOperatorDirectory;
import Business.GridOperator.GridData;
import Business.Profiles.ConsumerRepresentativeProfile.ConsumerRepresentativeDirectory;
import Business.Profiles.IEO.IEODirectory;
import Business.Profiles.NGO.NGODirectory;
import Business.Profiles.ResearchAnalyst.ResearchAnalystDirectory;
import Business.Profiles.TechnologyProvider.TechnologyProviderDirectory;
import Business.TechnologyProvider.TechnologyProviderData;
import Business.Utils.TechnologyProviderCatalog;

/**
 *
 * @author Mukul
 */
public class Business {
    
    UserAccountDirectory userAcconts;
    
    EnergyProducerProfileDirectory energyProducerProfiles;
    
    EnergyProducerCatalog energyProducers;
    
    EnergyDataCatalog energyDataRecords;
    
    PersonDirectory personDirectory;
    
    GovernmentRegulatorDirectory govtReg;
    
    GovernmentAgencyData gac;
    
    GridOperatorDirectory gridOperatorProfiles;
    
    GridData gridData;
    
    ConsumerRepresentativeDirectory crp;
    
    ConsumerDataCatalog consumerDataCatalog;
    
    TechnologyProviderDirectory tp;
    
    TechnologyProviderData tpd;
    
    ResearchAnalystDirectory rad;
    
    NGODirectory ngod;
    
    IEODirectory ieod;
    
    
    public Business() {
        this.userAcconts = new UserAccountDirectory();
        this.energyProducerProfiles = new EnergyProducerProfileDirectory();
        this.energyProducers = new EnergyProducerCatalog();
        this.energyDataRecords = new EnergyDataCatalog();
        this.personDirectory = new PersonDirectory();
        this.govtReg = new GovernmentRegulatorDirectory();
        this.gac = new GovernmentAgencyData();
        this.gridOperatorProfiles = new GridOperatorDirectory();
        this.gridData = new GridData();
        this.crp = new ConsumerRepresentativeDirectory();
        this.consumerDataCatalog = new ConsumerDataCatalog();
        this.tp = new TechnologyProviderDirectory();
        this.tpd = new TechnologyProviderData();
        this.ieod = new IEODirectory();
        this.rad = new ResearchAnalystDirectory();
        this.ngod = new NGODirectory();
    }

    public ResearchAnalystDirectory getRad() {
        return rad;
    }

    public void setRad(ResearchAnalystDirectory rad) {
        this.rad = rad;
    }

    public NGODirectory getNgod() {
        return ngod;
    }

    public void setNgod(NGODirectory ngod) {
        this.ngod = ngod;
    }

    public IEODirectory getIeod() {
        return ieod;
    }

    public void setIeod(IEODirectory ieod) {
        this.ieod = ieod;
    }

  

    public TechnologyProviderData getTpd() {
        return tpd;
    }

    public void setTpd(TechnologyProviderData tpd) {
        this.tpd = tpd;
    }

    public TechnologyProviderDirectory getTp() {
        return tp;
    }

    public void setTp(TechnologyProviderDirectory tp) {
        this.tp = tp;
    }

  

    public GridOperatorDirectory getGridOperatorProfiles() {
        return gridOperatorProfiles;
    }

    public void setGridOperatorProfiles(GridOperatorDirectory gridOperatorProfiles) {
        this.gridOperatorProfiles = gridOperatorProfiles;
    }

    public ConsumerDataCatalog getConsumerDataCatalog() {
        return consumerDataCatalog;
    }

    public void setConsumerDataCatalog(ConsumerDataCatalog consumerDataCatalog) {
        this.consumerDataCatalog = consumerDataCatalog;
    }

    public ConsumerRepresentativeDirectory getCrp() {
        return crp;
    }

    public void setCrp(ConsumerRepresentativeDirectory crp) {
        this.crp = crp;
    }

    public GridData getGridData() {
        return gridData;
    }

    public void setGridData(GridData gridData) {
        this.gridData = gridData;
    }
    
    
    public GovernmentAgencyData getGac() {
        return gac;
    }

    public void setGac(GovernmentAgencyData gac) {
        this.gac = gac;
    }
    
    public GovernmentRegulatorDirectory getGovtReg() {
        return govtReg;
    }

    public void setGovtReg(GovernmentRegulatorDirectory govtReg) {
        this.govtReg = govtReg;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public EnergyProducerProfileDirectory getEnergyProducerProfiles() {
        return energyProducerProfiles;
    }

    public void setEnergyProducerProfiles(EnergyProducerProfileDirectory EnergyProducerProfiles) {
        this.energyProducerProfiles = EnergyProducerProfiles;
    }

    public EnergyProducerCatalog getEnergyProducers() {
        return energyProducers;
    }

    public void setEnergyProducers(EnergyProducerCatalog EnergyProducers) {
        this.energyProducers = EnergyProducers;
    }

    public UserAccountDirectory getUserAcconts() {
        return userAcconts;
    }

    public void setUserAcconts(UserAccountDirectory UserAcconts) {
        this.userAcconts = UserAcconts;
    }

    public EnergyDataCatalog getEnergyDataRecords() {
        return energyDataRecords;
    }

    public void setEnergyDataRecords(EnergyDataCatalog energyDataRecords) {
        this.energyDataRecords = energyDataRecords;
    }

    
    
}
