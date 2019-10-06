package module_two.lesson17_inheritance.Task1;

public class Employee extends Person {
    private static final double WORKING_HOURS_PER_DAY = 8;

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
        }

        double salaryPerHour = this.daySalary / WORKING_HOURS_PER_DAY;
        this.overtimeSalary = salaryPerHour * 1.5 * hours;
        this.daySalary += this.overtimeSalary;
        return this.overtimeSalary;
    }

    public void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println(String.format("Salary:%n" +
                        "   Daily Salary: %.2f%n" +
                        "   Overtime: %.2f%n" +
                        "   Total: %.2f%n",
                this.daySalary,
                this.overtimeSalary,
                this.daySalary + this.overtimeSalary));
    }
}
