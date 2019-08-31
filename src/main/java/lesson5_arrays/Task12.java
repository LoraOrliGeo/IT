package lesson5_arrays;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];

        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //swap first and second elements using third variable
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        //swap third and fourth elements using addition
        int sum = arr[2] + arr[3];
        arr[2] = sum - arr[2];
        arr[3] = sum - arr[3];

        //swap fifth and sixth elements using multiplication
        int product = arr[4] * arr[5];
        arr[4] = product / arr[4];
        arr[5] = product / arr[5];

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
