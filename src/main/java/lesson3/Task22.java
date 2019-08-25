package lesson3;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 0;

        while (count < 10) {
            num += 1;

            if (isDivisibleByTwoThreeOrFive(num)) {
                count++;
                System.out.println(String.format("%d:%d", count, num));
            }
        }
    }

    private static boolean isDivisibleByTwoThreeOrFive(int num) {
        return num % 2 == 0 || num % 3 == 0 || num % 5 == 0;
    }
}
