package Services;

import Models.*;
import Repo.GateRepo;
import Repo.VehicleRepo;
import Strategy.GetSlotFactory;
import Strategy.SlotAssignmentStrategy;

import java.util.Date;
import java.util.InvalidPropertiesFormatException;
import java.util.Optional;

public class TokenService {

    private GateRepo gateRepo;
    private VehicleRepo vehicleRepo;

    TokenService(GateRepo gr) {
        this.gateRepo = gr;
    }

    public Ticket IssueTicket(String vehicleNumber,
                              String vehicleOwner,
                              int gateId,
                              VehicleType vehicleType) throws InvalidPropertiesFormatException {
        Ticket t = new Ticket();
        t.setEntryTime(new Date());

        Optional<Gate> gateOptional = gateRepo.findGateById(gateId);
        if(!gateOptional.isPresent()) {
            System.out.println("Gate is empty.....");
            return null;
        }
        Gate g = gateOptional.get();
        t.setGenratedGate(g);
        t.setVehicle(vehicleRepo.findOrCreateBy(vehicleNumber, vehicleOwner, vehicleType));

        SlotAssignmentStrategy strategy = GetSlotFactory.getSlotStrategy(g.getParkingLot().getSlotAssignmentStrategy());
        if(strategy == null) {
            throw new InvalidPropertiesFormatException("Strategy implementation missing...");
        }

        Slot s = strategy.getSlots(vehicleType, g);
        t.setParkingSlots(s);
        s.setParkingSlotStatus(SlotStatus.FILLED);

        return null;
    }
}
