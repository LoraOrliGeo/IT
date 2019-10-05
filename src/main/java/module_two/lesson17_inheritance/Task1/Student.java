package module_two.lesson17_inheritance.Task1;

public class Student extends Person {
    private static final double MIN_SCORE = 2.0;
    private static final double MAX_SCORE = 6.0;

    private double score;

    public Student(String name, int age, boolean isMale, double score) {
        super(name, age, isMale);
        this.setScore(score);
    }

    private void setScore(double score) {
        if (MIN_SCORE <= score && score <= MAX_SCORE) {
            this.score = score;
        } else {
            this.score = MIN_SCORE;
        }
    }

    public String showStudentInfo() {
        return super.showPersonInfo() + String.format("Score: %.2f%n", this.score);
    }
}
