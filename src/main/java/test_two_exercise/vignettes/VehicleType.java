package test_two_exercise.vignettes;

public enum VehicleType {
    CAR("red"), BUS("green"), TRUCK("blue");

    private String color;

    VehicleType(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
