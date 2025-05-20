package de.gerigx.swa.controller;

import java.util.List;

import de.gerigx.swa.entity.Pirate;

public interface PirateController {



    public Pirate getPirate(long id);
    public List<Pirate> getAllPirates();

    public Pirate createPirate(Pirate pirate);

    public Pirate updatePirate(long id, Pirate pirate);

    public Pirate deletePirate(long id);

    // add to crew
    public Pirate addPirateToCrew(Long shipID, long pirateID);
    
    public Pirate removePirateFromCrew(Long shipdID, long PirateID);

}
