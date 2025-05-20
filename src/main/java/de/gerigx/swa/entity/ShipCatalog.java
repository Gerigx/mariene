package de.gerigx.swa.entity;

import java.util.List;

public interface ShipCatalog {
    public PirateShip getShip(long ID);
    public List<PirateShip> getAllShips();

    public PirateShip createShip(PirateShip pirateShip);

    public PirateShip updateShip(long ID, PirateShip pirateShip);

    public PirateShip deleteShip(long ID);

}
