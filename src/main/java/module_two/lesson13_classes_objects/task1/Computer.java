package module_two.lesson13_classes_objects.task1;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    int freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }

    void useMemory(int memory) {
        if (freeMemory >= memory) {
            freeMemory -= memory;
        } else {
            System.out.println("Not enough free memory!");
        }
    }

    @Override
    public String toString() {
        return String.format("Year: %d%nPrice: %.2f%n" +
                        "Notebook: %b%nHard Disk Memory: %d%n" +
                        "Free Memory: %d%nOperation System: %s",
                year, price, isNotebook, hardDiskMemory, freeMemory, operationSystem);
    }
}
