package test_two_exercise.sweetshop;

import test_two_exercise.sweetshop.cakes.Cake;
import test_two_exercise.sweetshop.clients.Client;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Client client;
    private double price;
    private String addressDelivery;
    private List<Cake> cakes;
    private LocalDateTime dateTimeDelivery;

    public Order(Client client, List<Cake> cakes) {
        this.client = client;
        this.cakes = cakes;
        this.addressDelivery = client.getAddress();
    }

    public void setDateTimeDelivery(LocalDateTime dateTimeDelivery) {
        this.dateTimeDelivery = dateTimeDelivery;
    }

    public void calculatePrice(double discount) {
        double price = 0;
        for (Cake cake : this.cakes) {
            price += cake.getPrice();
        }
        this.price = price - discount;
    }

    public double getPrice() {
        return this.price;
    }
}
