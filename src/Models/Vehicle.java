package Models;

public class Vehicle extends BaseModel{

    String vehicleNumber;

    String ownerName;

    VehicleType vehicleType;

    public Vehicle(){}

    public Vehicle(String number, String owner, VehicleType type){
        this.vehicleNumber = number;
        this.ownerName = owner;
        this.vehicleType = type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}