package module_two.abstraction.task_employee;

public class Demo {
    public static void main(String[] args) {

        AllWork allWork = new AllWork();
        allWork.addTask(new Task("Task1", 8));
        allWork.addTask(new Task("Task2", 10));
        allWork.addTask(new Task("Task3", 12));

        Employee.setAllWork(allWork);

        Employee[] employees = new Employee[]{
                new Employee("AZ"),
                new Employee("KLJHFOSH")};

        for (int i = 1; i <= 2; i++) {
            System.out.println("DAY " + i);
            startWorkingDay(employees);
            work(employees);
            System.out.println();
        }

        allWork.showTasks();
    }

    private static void startWorkingDay(Employee[] employees) {
        for (Employee employee : employees) {
            employee.startWorkingDay();
        }
    }

    private static void work(Employee[] employees) {
        for (Employee employee : employees) {
            employee.work();
        }
    }
}
