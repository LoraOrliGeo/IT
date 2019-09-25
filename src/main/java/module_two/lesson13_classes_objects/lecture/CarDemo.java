package module_two.lesson13_classes_objects.lecture;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "red";
        car1.model = "Porsche";
        car1.currentGear = 1;
        car1.currentSpeed = 80;
        car1.maxSpeed = 300;

        Car car2 = new Car();
        car2.color = "white";
        car2.model = "Audi";
        car2.currentGear = 2;
        car2.currentSpeed = 245;
        car2.maxSpeed = 250;

        car1.currentGear = 3;
        car1.currentSpeed = 130;

        Person pesho = new Person();
        pesho.name = "Pesho Peshev";
        pesho.age = 21;

        car1.owner = pesho;

        System.out.println("Owner's name: " + car1.owner.name);
        System.out.println("Owner's age: " + car1.owner.age);

        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        car2.accelerate();
        System.out.println(car2.currentSpeed);

        car2.changeGearUp();
        System.out.println(car2.currentGear);

        car1.changeGearDown();
        System.out.println(car1.currentGear);

        car2.changeGear(3);
        System.out.println(car2.currentGear);

        car1.changeColor("yellow");
        System.out.println(car1.color);
    }
}
