package lesson5_arrays;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = sum / 7.0;
        int closestValue = 0;

        for (int i = 0; i < arr.length; i++) {
            double diff = avg - arr[i];

            if (0 <= diff && diff < avg) {
                closestValue = arr[i];
            }
        }

        System.out.println("Average value: " + avg);
        System.out.println("Closest element to average value: " + closestValue);

    }
}
