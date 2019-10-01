package module_two.lesson13_classes_objects.task2_students;

public class Student {
    private String name;
    private String subject;
    private double grade;
    private int yearInCollege;
    private int age;
    private boolean isDegree;
    private double money;

    private Student() {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0;
    }

    public Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSubject() {
        return this.subject;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void upYear() {
        if (!this.isDegree) {
            this.yearInCollege++;
            if (this.yearInCollege == 4) {
                isDegree = true;
            }
        } else {
            System.out.println(String.format("Congratulations! You got a degree in %s!", this.getSubject()));
        }
    }

    public double receiveScholarship(double min, double amount) {
        if (this.grade >= min && this.age < 30) {
            this.money += amount;
        }
        return this.money;
    }

    @Override
    public String toString() {
        return String.format("Name: %s%n" +
                        "Grade: %.2f%n" +
                        "Age: %d%n" +
                        "Year in college: %d%n" +
                        "Degree: %s%n" +
                        "Money: %.2f",
                this.getName(),
                this.getGrade(),
                this.age,
                this.yearInCollege,
                this.isDegree ? "yes" : "no",
                this.money);
    }
}
