package lesson3;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String symbol = sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (isFirstOrLastCol(i, n)) {
                printFirstOrLastRow(n);
            } else {
                printInternalRows(n, symbol);
            }
            System.out.println();
        }
    }

    private static void printFirstOrLastRow(int times) {
        for (int j = 0; j < times; j++) {
            System.out.print("*");
        }
    }

    private static boolean isFirstOrLastCol(int col, int times) {
        return col == 0 || col == times - 1;
    }

    private static void printInternalRows(int times, String symbol) {
        for (int j = 0; j < times; j++) {
            if (isFirstOrLastCol(j, times)) {
                System.out.print("*");
            } else {
                System.out.print(symbol);
            }
        }
    }
}
