package test_two_exercise.sweetshop.cakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WeddingCake extends Cake {
    private int floors;

    public WeddingCake(String name, String description, double price, int pieces, String type, int floors) {
        super(name, description, price, pieces, type);
        this.floors = floors;
    }

    @Override
    public CakeStyle getCakeStyle() {
        return CakeStyle.WEDDING;
    }

    @Override
    public List<String> getCakeTypes() {
        return new ArrayList<>(Arrays.asList("big", "small", "middle"));
    }

    @Override
    public int compareTo(Cake o) {
        return Integer.compare(this.getPieces(), o.getPieces());
    }
}
