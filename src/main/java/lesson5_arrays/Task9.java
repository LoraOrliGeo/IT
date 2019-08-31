package lesson5_arrays;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter VALID size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] oppositeArr = new int[size];

        System.out.println("Enter elements for the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            oppositeArr[oppositeArr.length - i - 1 ] = arr[i];
        }

        for (int i = 0; i < oppositeArr.length; i++){
            System.out.print(oppositeArr[i] + " ");
        }
    }
}
