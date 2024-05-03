package Models;


public class Slot extends BaseModel {
    private int slotNumber;
    VehicleType vehicleType;
    SlotStatus parkingSlotStatus;
    Floor parkingFloor;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SlotStatus getParkingSLotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(SlotStatus parkingSLotStatus) {
        this.parkingSlotStatus = parkingSLotStatus;
    }

    public Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}