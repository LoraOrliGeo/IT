package test_two_exercise.sweetshop.clients;

import test_two_exercise.sweetshop.Order;
import test_two_exercise.sweetshop.Provider;
import test_two_exercise.sweetshop.cakes.Cake;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrivateClient extends Client {
    private static final double PERCENTAGE_TIP = 0.02;

    private List<Integer> vouchers;

    public PrivateClient(String name, String number, String address) {
        super(name, number, address);
        this.vouchers = new ArrayList<>();
        generateVouchers();
    }

    private void generateVouchers() {
        Random r = new Random();
        int count = r.nextInt(4) + 1;
        for (int i = 0; i < count; i++) {
            this.vouchers.add(r.nextInt(21) + 10);
        }
    }

    @Override
    public void makeOrder() {
        // cakes (1-3) of different style and type
        List<Cake> cakes = chooseCakes();
        double percentDiscount = this.vouchers.stream().mapToInt(Integer::intValue).sum();
        sweetshop.registerOrder(this, cakes, percentDiscount);
    }

    @Override
    protected int getRandomNumberOfCakes() {
        return new Random().nextInt(3) + 1;
    }

    @Override
    public double getPercentTip() {
        return PERCENTAGE_TIP;
    }
}
