package de.gerigx.swa.gateway;

import java.util.List;

import de.gerigx.swa.entity.Pirate;
import de.gerigx.swa.entity.PirateCatalog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PirateRepo implements PanacheRepository<Pirate>, PirateCatalog {

    @Override
    public Pirate getPirate(long id) {
        return findById(id);

    }

    @Override
    public List<Pirate> getAllPirates() {
        return listAll();
    }

    // maybe tiefe copy
    @Override
    public Pirate createPirate(Pirate pirate) {
        Pirate newPirate = pirate;
        this.persist(newPirate);
        return newPirate;
    }

    @Override
    public Pirate updatePirate(long id, Pirate pirate) {
        Pirate newPirate = findById(id);
        newPirate.setName(pirate.getName());
        newPirate.setRole(pirate.getRole());
        newPirate.setBounty(pirate.getBounty());
        newPirate.setStrength(pirate.getStrength());

        this.persist(newPirate);

        return newPirate;

    }

    @Override
    public Pirate deletePirate(long id) {

        Pirate pirate = findById(id);
        this.delete(pirate);

        return pirate;

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
