package test_two_exercise.vignettes;

import test_two_exercise.vignettes.vehicles.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GasStation {
    private static final int NUMBER_OF_VIGNETTES = 10000;

    private double dailyProfit;
    private List<Vignette> vignettes;

    public GasStation() {
        this.vignettes = generateVignettes();
    }

    public double getDailyProfit() {
        return this.dailyProfit;
    }

    private List<Vignette> generateVignettes() {
        List<Vignette> vignettes = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < NUMBER_OF_VIGNETTES; i++) {
            VehicleType type = VehicleType.values()[r.nextInt(VehicleType.values().length)];
            PeriodType period = PeriodType.values()[r.nextInt(PeriodType.values().length)];

            Vignette vignette = new Vignette(type, period);
            vignettes.add(vignette);
        }

        vignettes.sort((v1, v2) -> Integer.compare(v1.getPrice(), v2.getPrice()));
        return vignettes;
    }

    public Vignette sellVignette(Vehicle vehicle, PeriodType period) {
        Vignette vignette = null;

        if (vehicle != null && period != null && this.vignettes != null && !this.vignettes.isEmpty()) {
            VehicleType type = vehicle.getType();
            for (Vignette v : this.vignettes) {
                if (v.getPeriod().equals(period) && v.getType().equals(type)) {
                    vignette = v;
                    vignette.setDate(LocalDate.now());
                    vignette.setDateOfExpire(period);
                    this.dailyProfit += vignette.getPrice();
                    break;
                }
            }

            this.vignettes.remove(vignette);
        }

        return vignette;
    }

    public void printVignettes() {
        System.out.println(this.vignettes.size());
//        for (Vignette vignette : this.vignettes) {
//            System.out.println(vignette.getType() + " - " +
//                    vignette.getType().getColor() + " - " +
//                    vignette.getPrice());
//        }
    }
}
