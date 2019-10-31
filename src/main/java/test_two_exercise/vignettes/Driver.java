package test_two_exercise.vignettes;

import test_two_exercise.vignettes.vehicles.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {
    private String name;
    private List<Vehicle> vehicles;
    private double money;
    public static GasStation gasStation;

    public Driver(String name, double money) {
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicles() {
        return Collections.unmodifiableList(vehicles);
    }

    public double getMoney() {
        return money;
    }

    public void addVehicles(List<Vehicle> vehicles) {
        if (vehicles != null) {
            this.vehicles.addAll(vehicles);
        }
    }

    public void buyVignettes() {
        // buy vignettes for all vehicles
        if (this.money == 0) {
            System.out.println(this.getName() + " does't have money to buy vignettes!");
            return;
        }

        Random r = new Random();
        if (this.vehicles != null && !this.vehicles.isEmpty()) {
            for (Vehicle vehicle : this.vehicles) {
                PeriodType period = PeriodType.values()[r.nextInt(PeriodType.values().length)];
                Vignette vignette = gasStation.sellVignette(vehicle, period);
                if (vignette != null) {
                    if (this.money - vignette.getPrice() >= 0) {
                        this.money -= vignette.getPrice();
                        vehicle.setVignette(vignette);
                    } else {
                        System.out.println(this.getName() + " does't have money to buy vignettes!");
                        return;
                    }
                }
            }
        }
    }

    public void buyVignette(int number, PeriodType period) {
        if (this.money == 0) {
            System.out.println(this.getName() + " does't have money to buy vignettes!");
            return;
        }

        Vehicle vehicle = this.vehicles.get(number);
        Vignette vignette = gasStation.sellVignette(vehicle, period);

        if (vignette != null) {
            if (this.money - vignette.getPrice() >= 0) {
                this.money -= vignette.getPrice();
                vehicle.setVignette(vignette);
            } else {
                System.out.println(this.getName() + " does't have money to buy vignettes!");
                this.money = 0;
            }
        }
    }

    public List<Vehicle> getVehiclesWithExpireVignette(LocalDate currentDate) {
        List<Vehicle> vehiclesWithExpireVignette = new ArrayList<>();

        if (this.vehicles != null) {
            for (Vehicle vehicle : this.vehicles) {
                if (vehicle.getVignette() != null) {
                    LocalDate dateOfExpire = vehicle.getVignette().getDateOfExpire();
                    if (dateOfExpire.isAfter(currentDate)) {
                        vehiclesWithExpireVignette.add(vehicle);
                    }
                }
            }
        }

        return vehiclesWithExpireVignette;
    }

    public void printInfo() {
        System.out.println(String.format("%s has %s cars, number of expire vignettes: %d, money: %.2f",
                this.getName(),
                this.getCarCount(),
                this.getVehiclesWithExpireVignette(LocalDate.now()).size(),
                this.getMoney()));
    }

    private int getCarCount() {
        int cars = 0;
        for (Vehicle vehicle : this.vehicles) {
            if (vehicle.getType().equals(VehicleType.CAR)) {
                cars++;
            }
        }
        return cars;
    }
}
