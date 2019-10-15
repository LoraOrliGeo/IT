package test_two_exercise.real_estates.real_estates_types;

public class House extends Apartment {
    private int parkingSlots;
    private double yardArea;

    public House(String description, String address, double price, String type,
                 double area, String constructionType, int parkingSlots, double yardArea) {
        super(description, address, price, type, area, constructionType);
        setParkingSlots(parkingSlots);
        setYardArea(yardArea);
    }

    private void setParkingSlots(int parkingSlots) {
        if (parkingSlots > 0) {
            this.parkingSlots = parkingSlots;
        }
    }

    private void setYardArea(double yardArea) {
        if (yardArea > 0) {
            this.yardArea = yardArea;
        }
    }
}
