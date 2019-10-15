package test_two_exercise.real_estates.real_estates_types;

import test_two_exercise.real_estates.clients.Agent;

public abstract class RealEstate {
    private String description;
    private String address;
    private double price;
    private String type;
    private double area;
    private Agent agent;

    public RealEstate(String description, String address, double price, String type, double area) {
        this.description = description;
        this.address = address;
        this.price = price;
        this.type = type;
        this.area = area;
    }

    protected abstract String[] getRealEstateTypes();
}
