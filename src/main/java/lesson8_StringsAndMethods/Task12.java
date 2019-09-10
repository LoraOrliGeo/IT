package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Enter a number:");
            n = sc.nextInt();
        } while (n <= 0);

        int[] array = createArray(n);
        Task11.printArray(array);
    }

    private static int[] createArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        return arr;
    }
}
