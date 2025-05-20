package de.gerigx.swa.controller;

import java.util.List;

import com.arjuna.ats.arjuna.common.recoveryPropertyManager;

import de.gerigx.swa.entity.Pirate;
import de.gerigx.swa.entity.PirateShip;
import de.gerigx.swa.gateway.ShipRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ShipService implements ShipController {
    @Inject
    ShipRepo shipRepo;

    @Override
    public PirateShip getShip(long ID) {
        return shipRepo.getShip(ID);
    }

    @Override
    public List<PirateShip> getAllShips() {
        return shipRepo.getAllShips();

    }

    @Override
    public PirateShip createShip(PirateShip pirateShip) {
        // calc bountys
        pirateShip.setBounty(calcBountys(pirateShip.getId()));
        return shipRepo.createShip(pirateShip);
    }

    @Override
    public PirateShip updateShip(long ID, PirateShip pirateShip) {
        pirateShip.setBounty(calcBountys(pirateShip.getId()));
        return shipRepo.updateShip(ID, pirateShip);

    }

    @Override
    public PirateShip deleteShip(long ID) {
        return shipRepo.deleteShip(ID);
    }

    private long calcBountys(long shipID)
    {
        PirateShip pirateShip = shipRepo.getShip(shipID);
        List<Pirate> members = pirateShip.getCrewMembers();

        long newBounty = 0l;
        for (Pirate pirate : members) {
            newBounty += pirate.getBounty();
            
        }

        return newBounty;

    }

}
