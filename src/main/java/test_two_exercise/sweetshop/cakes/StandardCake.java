package test_two_exercise.sweetshop.cakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardCake extends Cake {
    boolean isSyrupy;

    public StandardCake(String name, String description, double price, int pieces, String type, boolean isSyrupy) {
        super(name, description, price, pieces, type);
        this.isSyrupy = isSyrupy;
    }

    @Override
    public CakeStyle getCakeStyle() {
        return CakeStyle.STANDARD;
    }

    @Override
    public int compareTo(Cake o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
