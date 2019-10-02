package module_two.lesson13_classes_objects.lecture;

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car("BMW", false, "black");
        Person person = new Person("Lori", 1234567890, false);

        Car car2 = new Car("Moskvich", false, "pink");

        car.setPrice(1250.63);
        car2.setPrice(253.05);
        System.out.println(car.isMoreExpensive(car2));

        System.out.println("Price for scrap: " + car.calculateCarPriceForScrap(22.50));

        person.setMoney(1500);
        person.buyCar(car);
        System.out.println(String.format("Money after sold car: %.2f%n", person.sellCarForScrap()));
    }
}
