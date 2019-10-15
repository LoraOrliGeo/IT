package test_two_exercise.real_estates.clients;

import test_two_exercise.real_estates.View;

public class Buyer extends Client {
    private double budget;
    private View[] views;

    public Buyer(String name, String phone, double budget) {
        super(name, phone);
        setBudget(budget);
        this.views = new View[5];
    }

    private void setBudget(double budget) {
        if (budget > 0){
            this.budget = budget;
        }
    }


}
