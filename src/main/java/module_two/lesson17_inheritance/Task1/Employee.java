package module_two.lesson17_inheritance.Task1;

import java.util.Objects;

public class Employee extends Person {
    private double daySalary;
    private double overtimeSalary;

    public Employee(String name, int age, boolean isMale, double daySalary) {
        super(name, age, isMale);
        this.setDaySalary(daySalary);
    }

    private void setDaySalary(double daySalary) {
        if (daySalary > 0) {
            this.daySalary = daySalary;
        }
    }

    public double calculateOvertime(double hours) {
        if (this.getAge() < 18) {
            return 0;
        } else {
            double salaryPerHour = hours > 0 ? this.daySalary / hours : 0;
            this.overtimeSalary = salaryPerHour * 1.5;
            this.daySalary += this.overtimeSalary;
            return this.overtimeSalary;
        }
    }

    public String showEmployeeInfo() {
        return super.showPersonInfo() + String.format("Salary:%n" +
                        "   Daily Salary: %.2f%n" +
                        "   Overtime: %.2f%n" +
                        "   Total: %.2f%n",
                this.daySalary,
                this.overtimeSalary,
                this.daySalary + this.overtimeSalary);
    }
}
