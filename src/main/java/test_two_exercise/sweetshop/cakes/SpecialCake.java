package test_two_exercise.sweetshop.cakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialCake extends Cake {
    private String eventName;

    public SpecialCake(String name, String description, double price, int pieces, String type, String eventName) {
        super(name, description, price, pieces, type);
        this.eventName = eventName;
    }

    @Override
    public CakeStyle getCakeStyle() {
        return CakeStyle.SPECIAL;
    }

    @Override
    public List<String> getCakeTypes() {
        return new ArrayList<>(Arrays.asList("anniversary", "company", "commercial"));
    }

    @Override
    public int compareTo(Cake o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
