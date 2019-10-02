package module_two.lesson13_classes_objects.task_employee;

public class Task {
    private String name;
    private int workingHours; // how many hours left to finish the task

    Task(String name, int workingHours) {
        this.setName(name);
        this.setWorkingHours(workingHours);
    }

    String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    int getWorkingHours() {
        return this.workingHours;
    }

    void setWorkingHours(int workingHours) {
        if (workingHours >= 0) {
            this.workingHours = workingHours;
        }
    }
}
