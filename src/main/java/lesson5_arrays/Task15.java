package lesson5_arrays;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size;

        do {
            System.out.println("Enter valid size of the array:");
            size = sc.nextInt();
        } while (size <= 0);

        double[] arr = new double[size];

        double[] absValuesArr = new double[size];

        double maxOne = Double.MIN_VALUE;
        double maxTwo = Double.MIN_VALUE;
        double maxThree = Double.MIN_VALUE;

        int indexOne = 0;
        int indexTwo = 0;
        int indexThree = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();

            if (arr[i] < 0){
                absValuesArr[i] = arr[i] * -1;
            } else {
                absValuesArr[i] = arr[i];
            }

            if (absValuesArr[i] > maxOne){
                maxOne = arr[i];
                indexOne = i;
            }

            if (absValuesArr[i] < maxOne && absValuesArr[i] > maxTwo){
                maxTwo = arr[i];
                indexTwo = i;
            }

            if (absValuesArr[i] < maxTwo && absValuesArr[i] > maxThree){
                maxThree = arr[i];
                indexThree = i;
            }
        }

        System.out.println(arr[indexOne] + "; " + arr[indexTwo] + "; " + arr[indexThree]);

    }
}
