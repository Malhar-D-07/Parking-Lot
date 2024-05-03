package Repo;

import Models.Vehicle;
import Models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepo {

    Map<String, Vehicle> vehicleMap = new HashMap<>();

    public Vehicle findOrCreateBy(String vehicleNumber, String owner, VehicleType type) {
        if(vehicleMap.containsKey(vehicleNumber)) {
            return vehicleMap.get(vehicleNumber);
        }
        Vehicle v = new Vehicle(vehicleNumber, owner, type);
        vehicleMap.put(vehicleNumber, v);
        return v;
    }
}

