package test_two_exercise.sweetshop.cakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChildrenCake extends Cake {
    private String kidName;

    public ChildrenCake(String name, String description, double price, int pieces, String type, String kidName) {
        super(name, description, price, pieces, type);
        this.kidName = kidName;
    }

    @Override
    public CakeStyle getCakeStyle() {
        return CakeStyle.CHILDREN;
    }

    @Override
    public int compareTo(Cake o) {
        return Integer.compare(this.getPieces(), o.getPieces());
    }
}
