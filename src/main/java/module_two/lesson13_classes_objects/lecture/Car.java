package module_two.lesson13_classes_objects.lecture;

public class Car {
    String model;
    int maxSpeed;
    int currentSpeed;
    String color;
    int currentGear;
    Person owner;

    void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed++;
        } else {
            System.out.println("You've already reach max speed! Cannot accelerate more!");
        }
    }

    void changeGearUp() {
        if (1 <= currentGear && currentGear < 5) {
            currentGear++;
        }
    }

    void changeGearDown() {
        if (1 < currentGear && currentGear <= 5) {
            currentGear--;
        } else {
            System.out.println("You are now on 1st gear! Cannot change gear down!");
        }
    }

    void changeGear(int nextGear) {
        if (currentGear != nextGear && 1 <= nextGear && nextGear <= 5) {
            currentGear = nextGear;
        }
    }

    void changeColor(String newColor) {
        color = newColor;
    }

}
