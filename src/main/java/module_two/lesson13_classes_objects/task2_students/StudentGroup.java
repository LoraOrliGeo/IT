package module_two.lesson13_classes_objects.task2_students;

public class StudentGroup {
    private static final int STUDENTS_IN_GROUP = 5;
    private String groupSubject;
    private Student[] students;
    private int freeSpaces;

    public StudentGroup() {
        this.students = new Student[STUDENTS_IN_GROUP];
        this.freeSpaces = STUDENTS_IN_GROUP;
    }

    public StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    public void addStudent(Student s) {
        if (s != null) {
            boolean hasSameSubject = this.groupSubject.equals(s.getSubject());
            boolean haveFreeSpaces = this.freeSpaces <= this.students.length && this.freeSpaces > 0;
            if (hasSameSubject && haveFreeSpaces) {
                this.students[this.students.length - freeSpaces] = s;
                this.freeSpaces--;
            } else {
                if (!hasSameSubject) {
                    System.out.println("Sorry, you can not join to group - you have different subject!");
                }
                if (!haveFreeSpaces) {
                    System.out.println("Sorry, there are no more free spaces in the group!");
                }
            }
        }
    }

    public void emptyGroup() {
        this.students = new Student[STUDENTS_IN_GROUP];
        this.freeSpaces = STUDENTS_IN_GROUP;
    }

    public String theBestStudent() {
        Student bestStudent = null;
        double bestGrade = this.students[0].getGrade();

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null) {
                double currentGrade = students[i].getGrade();
                if (currentGrade > bestGrade) {
                    bestGrade = currentGrade;
                    bestStudent = students[i];
                }
            }
        }

        if (bestStudent != null) {
            return bestStudent.getName();
        } else {
            return "Error!";
        }
    }

    public void printStudentsInGroup() {
        System.out.println("Group subject: " + this.groupSubject);
        for (Student student : this.students) {
            if (student != null) {
                System.out.println(student.toString());
            }
        }
    }
}
