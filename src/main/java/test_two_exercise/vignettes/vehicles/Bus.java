package test_two_exercise.vignettes.vehicles;

import test_two_exercise.vignettes.VehicleType;

public class Bus extends Vehicle {
    public Bus(int yearManufacture) {
        super(VehicleType.BUS, yearManufacture);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.BUS;
    }
}
