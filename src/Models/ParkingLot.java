package Models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<Floor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> allowedVehicles;
    int capacity;
    private ParkingLotStatus status;
    private SlotAssignmentStrategyEnum slotAssignmentStrategy;
    String name;
    String address;

    public SlotAssignmentStrategyEnum getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategyEnum slotAssignmentStrategy) {
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }

    public List<Floor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<Floor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
}

