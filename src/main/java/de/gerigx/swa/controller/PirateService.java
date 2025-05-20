package de.gerigx.swa.controller;

import java.util.List;

import de.gerigx.swa.entity.Pirate;
import de.gerigx.swa.gateway.PirateRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PirateService implements PirateController {

    @Inject
    PirateRepo pirateRepo;

    @Override
    public Pirate getPirate(long id) {
        return pirateRepo.getPirate(id);

    }

    @Override
    public List<Pirate> getAllPirates() {
        return pirateRepo.getAllPirates();

    }

    @Override
    public Pirate createPirate(Pirate pirate) {
        return pirateRepo.createPirate(pirate);
    }

    @Override
    public Pirate updatePirate(long id, Pirate pirate) {
        return pirateRepo.updatePirate(id, pirate);

    }

    @Override
    public Pirate deletePirate(long id) {
        return pirateRepo.deletePirate(id);

    }

    @Override
    public Pirate addPirateToCrew(Long shipID, long pirateID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPirateToCrew'");
    }

    @Override
    public Pirate removePirateFromCrew(Long shipdID, long PirateID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePirateFromCrew'");
    }

}
