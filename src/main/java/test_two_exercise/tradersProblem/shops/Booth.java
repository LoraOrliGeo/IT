package test_two_exercise.tradersProblem.shops;

import java.util.Random;

public class Booth extends Shop {
    private static final int TAX = 50;

    public Booth(String address, String workTime) {
        super(address, workTime, Booth.TAX);
    }

    @Override
    protected int getRandomArea() {
        Random r = new Random();
        return r.nextInt(3) + 4;
    }

    @Override
    public String getShopType() {
        return "Booth";
    }
}
