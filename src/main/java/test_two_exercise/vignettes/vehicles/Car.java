package test_two_exercise.vignettes.vehicles;

import test_two_exercise.vignettes.VehicleType;

public class Car extends Vehicle {
    public Car(int yearManufacture) {
        super(VehicleType.CAR, yearManufacture);
    }

    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }
}
