package lesson3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            printCharachterNTimes(" ", n - i - 1);

            printCharachterNTimes("*", 2 * i + 1);

            System.out.println();
        }

        // empty triangle:

        for (int i = 0; i < n; i++) {
            printCharachterNTimes(" ", n - i - 1);
            printCharachterNTimes("*", 1);

            if (i != n - 1) {
                if (i != 0) {
                    printCharachterNTimes(" ", 2 * i - 1);
                    printCharachterNTimes("*", 1);
                }
            } else {
                printCharachterNTimes("*", 2 * i);
            }

            System.out.println();
        }

    }

    private static void printCharachterNTimes(String symbol, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(symbol);
        }
    }
}
