package test_two_exercise.sweetshop;

import test_two_exercise.sweetshop.clients.Person;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Provider extends Person implements Comparable<Provider> {
    private Set<Order> orders;
    private double tip;
    private int completeOrders;

    public Provider(String name, String number) {
        super(name, number);
        this.orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void executeOrder(Order order, double tip) {
        order.setDateTimeDelivery(LocalDateTime.now());
        sweetshop.receiveMoney(order.getPrice());
        this.tip += order.getPrice() * tip;
        this.orders.remove(order);
        this.completeOrders++;
    }

    public double getTip() {
        return this.tip;
    }

    public int getCompleteOrders() {
        return this.completeOrders;
    }

    @Override
    public String toString() {
        return String.format("%s - Tip: %.2f", this.getName(), this.getTip());
    }

    @Override
    public int compareTo(Provider o) {
        return o.getCompleteOrders() - this.getCompleteOrders();
    }
}
