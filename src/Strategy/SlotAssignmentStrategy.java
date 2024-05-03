package Strategy;

import Models.Gate;
import Models.Slot;
import Models.Vehicle;
import Models.VehicleType;

public interface SlotAssignmentStrategy {
    Slot getSlots(VehicleType type, Gate g);
}
