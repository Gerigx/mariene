package de.gerigx.swa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table()
public class Pirate {
    @Id 
    @GeneratedValue
    private long id;
    private String name;
    private Role role;
    private long bounty;
    private int strength;



    
    public Pirate() {
    }

    
    public Pirate(String name, Role role, long bounty, int strength) {
        this.name = name;
        this.role = role;
        this.bounty = bounty;
        this.strength = strength;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public long getBounty() {
        return bounty;
    }
    public void setBounty(long bounty) {
        this.bounty = bounty;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public long getId() {
        return id;
    }

    
}
