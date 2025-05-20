package de.gerigx.swa.controller;

import java.util.List;

import de.gerigx.swa.entity.PirateShip;

public interface ShipController {
    public PirateShip getShip(long ID);
    public List<PirateShip> getAllShips();

    public PirateShip createShip(PirateShip pirateShip);

    public PirateShip updateShip(long ID, PirateShip pirateShip);

    public PirateShip deleteShip(long ID);

}
