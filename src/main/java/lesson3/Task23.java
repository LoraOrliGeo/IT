package lesson3;

public class Task23 {
    public static void main(String[] args) {

        int firstMultiplier = 1;

        while (firstMultiplier < 10) {
            int secondMultiplier = firstMultiplier;

            while (secondMultiplier < 10) {
                System.out.print(String.format("%d*%d ", firstMultiplier, secondMultiplier));
                secondMultiplier++;
            }

            System.out.println();
            firstMultiplier++;
        }
    }
}
