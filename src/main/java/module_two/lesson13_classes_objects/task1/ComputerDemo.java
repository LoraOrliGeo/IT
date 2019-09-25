package module_two.lesson13_classes_objects.task1;

public class ComputerDemo {
    public static void main(String[] args) {

        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        comp1.year = 2016;
        comp1.price = 850;
        comp1.hardDiskMemory = 8;
        comp1.freeMemory = 5;
        comp1.operationSystem = "Linux";

        comp2.year = 2018;
        comp2.price = 1250.99;
        comp2.hardDiskMemory = 500;
        comp2.freeMemory = 250;
        comp2.operationSystem = "Windows";
        comp2.isNotebook = true;

        comp1.changeOperationSystem("Ubuntu");
        comp2.useMemory(100);

        System.out.println(comp1.toString());
        System.out.println(comp2.toString());
    }
}
