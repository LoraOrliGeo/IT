package test_two_exercise.vignettes;

import test_two_exercise.vignettes.vehicles.Vehicle;

import java.time.LocalDate;
import java.util.*;

public class GasStation {
    private static final int NUMBER_OF_VIGNETTES = 10000;

    private double dailyProfit;
    private Map<VehicleType, Map<PeriodType, List<Vignette>>> vignettes;

    public GasStation() {
        this.vignettes = generateVignettes();
    }

    public double getDailyProfit() {
        return this.dailyProfit;
    }

    private Map<VehicleType, Map<PeriodType, List<Vignette>>> generateVignettes() {
        Map<VehicleType, Map<PeriodType, List<Vignette>>> vignettes = new HashMap<>();
        Random r = new Random();

        for (int i = 0; i < NUMBER_OF_VIGNETTES; i++) {
            VehicleType type = VehicleType.values()[r.nextInt(VehicleType.values().length)];
            PeriodType period = PeriodType.values()[r.nextInt(PeriodType.values().length)];

            Vignette vignette = new Vignette(type, period);

            vignettes.putIfAbsent(vignette.getType(), new HashMap<>());
            vignettes.get(type).putIfAbsent(period, new ArrayList<>());
            vignettes.get(type).get(period).add(vignette);

            vignettes.get(type).get(period).sort((v1, v2) -> Integer.compare(v1.getPrice(), v2.getPrice()));
        }

        return vignettes;
    }

    public Vignette sellVignette(Vehicle vehicle, PeriodType period) {
        Vignette vignette = null;

        if (vehicle != null && period != null && this.vignettes != null && !this.vignettes.isEmpty()) {
            VehicleType type = vehicle.getType();
            for (Map.Entry<VehicleType, Map<PeriodType, List<Vignette>>> v : this.vignettes.entrySet()) {
                if (v.getKey().equals(type)) {
                    Map<PeriodType, List<Vignette>> innerMap = v.getValue();
                    for (Map.Entry<PeriodType, List<Vignette>> e : innerMap.entrySet()) {
                        if (e.getKey().equals(period)) {
                            vignette = e.getValue().get(0);
                            vignette.setDate(LocalDate.now());
                            vignette.setDateOfExpire(period);
                            this.dailyProfit += vignette.getPrice();
                            this.vignettes.get(v.getKey()).get(e.getKey()).remove(vignette);
                            break;
                        }
                    }
                }
            }
        }

        return vignette;
    }

    public void printVignettes() {
        int sum = 0;
        for (Map.Entry<VehicleType, Map<PeriodType, List<Vignette>>> entry : this.vignettes.entrySet()) {
            Map<PeriodType, List<Vignette>> innerMap = entry.getValue();
            for (Map.Entry<PeriodType, List<Vignette>> e : innerMap.entrySet()) {
                sum += e.getValue().size();
            }
        }
        System.out.println(sum);
//        for (Vignette vignette : this.vignettes) {
//            System.out.println(vignette.getType() + " - " +
//                    vignette.getType().getColor() + " - " +
//                    vignette.getPrice());
//        }
    }
}
