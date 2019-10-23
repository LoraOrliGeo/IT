package test_two_exercise.sweetshop.clients;

import test_two_exercise.sweetshop.cakes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Client extends Person {
    private String address;
    private double spentMoney;

    public Client(String name, String number, String address) {
        super(name, number);
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void spendMoney(double money) {
        this.spentMoney += money;
    }

    public double getSpentMoney() {
        return this.spentMoney;
    }

    public abstract void makeOrder();

    protected abstract int getRandomNumberOfCakes();

    List<Cake> chooseCakes() {
        List<Cake> cakes = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < getRandomNumberOfCakes(); i++) {
            Cake cake = null;
            int chance = r.nextInt(4);

            double price = 15.50 + (26.99 - 15.50) * r.nextDouble(); // cake price - between 15.50 and 26.99
            int pieces = r.nextInt(11) + 1; // pieces numbers - between 1 and 10

            switch (chance) {
                case 0:
                    // how to get cake's types???
                    String[] standardTypes = {"biscuit", "eclair", "fruit", "chocolate"};
                    cake = new StandardCake("StandardCake", "descr", price,
                            pieces, standardTypes[r.nextInt(standardTypes.length)], r.nextBoolean());
                    break;
                case 1:
                    String[] weddingTypes = {"big", "small", "middle"};
                    int floors = r.nextInt(5) + 1; // floors - between 1 and 5
                    cake = new WeddingCake("WeddingCake", "descr", price,
                            pieces, weddingTypes[r.nextInt(weddingTypes.length)], floors);
                    break;
                case 2:
                    String[] specialTypes = {"anniversary", "company", "commercial"};
                    cake = new SpecialCake("SpecialCake", "descr", price,
                            pieces, specialTypes[r.nextInt(specialTypes.length)], "EventName");
                    break;
                case 3:
                    String[] childrenTypes = {"birthday", "christening", "purveyor"};
                    cake = new ChildrenCake("ChildrenCake", "descr", price,
                            pieces, childrenTypes[r.nextInt(childrenTypes.length)], "KidName");
                    break;
            }

            cakes.add(cake);
        }
        return cakes;
    }

    public abstract double getPercentTip();

    @Override
    public String toString() {
        return String.format("%s - spent money: %.2f", this.getName(), this.getSpentMoney());
    }
}
