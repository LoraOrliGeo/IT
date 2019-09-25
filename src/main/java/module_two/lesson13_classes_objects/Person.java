package module_two.lesson13_classes_objects;

public class Person {
    String name;
    int age;
    Person friend;

    void eat() {
        System.out.println("Eating...");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void growUp() {
        age++;
    }

    void drinkWater(double liters) {
        if (liters > 1) {
            System.out.println("This is too much water!!!");
        } else if (liters < 0) {
            System.out.println("There is no water to drink!");
        } else {
            System.out.println(name + " is drinking " + liters + " water.");
        }
    }
}
