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

}
