package lesson3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sumToCheck = sc.nextInt();

        if (sumToCheck < 2 || sumToCheck > 27) {
            System.out.println("There is not a three-digit number that satisfies the condition!");
            return;
        }

        for (int i = 100; i < 1000; i++) {
            if (sumOfDigitsEqualsNumber(sumToCheck, i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean sumOfDigitsEqualsNumber(int sum, int number) {
        int dec = number % 10;
        int tens = (number / 10) % 10;
        int hund = (number / 100) % 10;

        return dec + tens + hund == sum;
    }
}
