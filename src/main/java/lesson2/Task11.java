package lesson2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int decimals = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;

        if (numberIsDivisibleByItsDigits(number, decimals, tens, hundreds)) {
            System.out.println("The number is divisible by its three digits");
        } else {
            System.out.println("The number is NOT divisible by its three digits");
        }
    }

    static boolean numberIsDivisibleByItsDigits(int num, int d, int t, int h) {
        if (num % d == 0 && num % t == 0 && num % h == 0) {
            return true;
        } else {
            return false;
        }
    }
}
