package lesson5_arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many cells the arrays will have:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int minNumDivisibleBy3 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 3 == 0 && arr[i] < minNumDivisibleBy3) {
                minNumDivisibleBy3 = arr[i];
            }
        }

        System.out.println("The smallest number divisible by 3 is " + minNumDivisibleBy3);
    }
}
