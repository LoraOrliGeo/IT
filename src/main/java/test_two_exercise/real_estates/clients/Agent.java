package test_two_exercise.real_estates.clients;

import test_two_exercise.real_estates.View;

public class Agent extends Client {
    private Seller[] sellers;
    private Buyer[] buyers;
    private View[] views;

    public Agent(String name, String phone) {
        super(name, phone);
        this.buyers = new Buyer[50];
        this.sellers = new Seller[50];
        this.views = new View[50];
    }
}
