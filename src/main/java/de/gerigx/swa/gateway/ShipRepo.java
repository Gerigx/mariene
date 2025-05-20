package de.gerigx.swa.gateway;

import java.util.List;

import de.gerigx.swa.entity.PirateShip;
import de.gerigx.swa.entity.ShipCatalog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShipRepo implements PanacheRepository<PirateShip>, ShipCatalog  {

    @Override
    public PirateShip getShip(long ID) {
        return findById(ID);

    }

    @Override
    public List<PirateShip> getAllShips() {

        return listAll();
    }

    @Override
    public PirateShip createShip(PirateShip pirateShip) {
        PirateShip newPirateShip = new PirateShip();
        newPirateShip.setName(pirateShip.getName());
        newPirateShip.setCrewMembers(pirateShip.getCrewMembers());
        newPirateShip.setBounty(pirateShip.getBounty());
        newPirateShip.setShiptype(pirateShip.getShiptype());

        this.persist(newPirateShip);
        return newPirateShip;
    }

    @Override
    public PirateShip updateShip(long ID, PirateShip pirateShip) {
        PirateShip newPirateShip = findById(ID);
        newPirateShip.setName(pirateShip.getName());
        newPirateShip.setCrewMembers(pirateShip.getCrewMembers());
        newPirateShip.setBounty(pirateShip.getBounty());
        newPirateShip.setShiptype(pirateShip.getShiptype());

        this.persist(newPirateShip);

        return newPirateShip;


    }

    @Override
    public PirateShip deleteShip(long ID) {
        PirateShip newPirateShip = findById(ID);
        this.delete(newPirateShip);
        return newPirateShip;
    }

}
