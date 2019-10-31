package test_two_exercise.vignettes.vehicles;

import test_two_exercise.vignettes.VehicleType;

public class Truck extends Vehicle {
    public Truck(int yearManufacture) {
        super(VehicleType.TRUCK, yearManufacture);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.TRUCK;
    }
}
