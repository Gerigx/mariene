package de.gerigx.swa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PirateShip {
    @Id 
    @GeneratedValue
    private long id;
    private String name;
    private Shiptype shiptype;
    private long bounty;
    private List<Pirate> crewMembers;

    

    public PirateShip(String name, Shiptype shiptype, List<Pirate> crewMembers) {
        this.name = name;
        this.shiptype = shiptype;
        this.crewMembers = crewMembers;
    }
    public PirateShip() {
        crewMembers = new ArrayList<Pirate>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Shiptype getShiptype() {
        return shiptype;
    }
    public void setShiptype(Shiptype shiptype) {
        this.shiptype = shiptype;
    }
    public long getBounty() {
        return bounty;
    }
    public void setBounty(long bounty) {
        this.bounty = bounty;
    }
    public List<Pirate> getCrewMembers() {
        return crewMembers;
    }
    public void setCrewMembers(List<Pirate> crewMembers) {
        this.crewMembers = crewMembers;
    }
    public long getId() {
        return id;
    }

    
    

}
