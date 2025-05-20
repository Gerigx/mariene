package de.gerigx.swa.entity;

import java.util.List;

public interface PirateCatalog {
    public Pirate getPirate(long id);
    public List<Pirate> getAllPirates();

    public Pirate createPirate(Pirate pirate);

    public Pirate updatePirate(long id, Pirate pirate);

    public Pirate deletePirate(long id);

    // add to crew
    public Pirate addPirateToCrew(Long shipID, long pirateID);
    
    public Pirate removePirateFromCrew(Long shipdID, long PirateID);

}
