package test_two_exercise.vignettes;

import java.time.LocalDate;

public class Vignette {
    private static final int CAR_DAY_PRICE = 5;
    private static final int BUS_DAY_PRICE = 9;
    private static final int TRUCK_DAY_PRICE = 7;

    private LocalDate date;
    private VehicleType type;
    private PeriodType period;
    private int price;
    private LocalDate dateOfExpire;

    public Vignette(VehicleType type, PeriodType period) {
        this.type = type;
        this.period = period;
        this.price = setPrice(type, period);
    }

    public int getPrice() {
        return this.price;
    }

    private int setPrice(VehicleType type, PeriodType period) {
        int price = 0;

        switch (type) {
            case CAR:
                if (period.equals(PeriodType.DAY)) {
                    price = CAR_DAY_PRICE;
                } else if (period.equals(PeriodType.MONTH)) {
                    price = CAR_DAY_PRICE * 10;
                } else if (period.equals(PeriodType.YEAR)) {
                    price = CAR_DAY_PRICE * 60;
                }
                break;
            case BUS:
                if (period.equals(PeriodType.DAY)) {
                    price = BUS_DAY_PRICE;
                } else if (period.equals(PeriodType.MONTH)) {
                    price = BUS_DAY_PRICE * 10;
                } else if (period.equals(PeriodType.YEAR)) {
                    price = BUS_DAY_PRICE * 60;
                }
                break;
            case TRUCK:
                if (period.equals(PeriodType.DAY)) {
                    price = TRUCK_DAY_PRICE;
                } else if (period.equals(PeriodType.MONTH)) {
                    price = TRUCK_DAY_PRICE * 10;
                } else if (period.equals(PeriodType.YEAR)) {
                    price = TRUCK_DAY_PRICE * 60;
                }
                break;
        }

        return price;
    }

    public VehicleType getType() {
        return this.type;
    }

    public PeriodType getPeriod() {
        return this.period;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDateOfExpire() {
        return dateOfExpire;
    }

    public void setDateOfExpire(PeriodType period) {
        if (PeriodType.DAY.equals(period)) {
            this.dateOfExpire = this.date.plusDays(1);
        } else if (PeriodType.MONTH.equals(period)) {
            this.dateOfExpire = this.date.plusMonths(1);
        } else if (PeriodType.YEAR.equals(period)) {
            this.dateOfExpire = this.date.plusYears(1);
        }
    }

    public int stick() {
        if (this.type != null) {
            if (VehicleType.CAR.equals(this.type)) {
                return 5;
            } else if (VehicleType.BUS.equals(this.type)) {
                return 20;
            } else if (VehicleType.TRUCK.equals(this.type)) {
                return 10;
            }
        }
        System.out.println("You don't have a vignette to stick!");
        return 0;
    }
}
