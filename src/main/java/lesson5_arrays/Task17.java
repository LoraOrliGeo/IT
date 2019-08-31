package lesson5_arrays;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isZigZagGrow = true;

        for (int i = 1; i <= arr.length - 2; i++) {
            if (i % 2 != 0){
                if (arr[i] >= arr[i - 1] && arr[i] <= arr[i + 1]){
                    isZigZagGrow = false;
                    break;
                }
            } else {
                if (arr[i] <= arr[i - 1] && arr[i] >=  arr[i + 1]){
                    isZigZagGrow = false;
                }
            }
        }

        if (isZigZagGrow){
            System.out.println("The sequence of numbers is zig-zag");
        } else {
            System.out.println("It's not zig-zag");
        }
    }
}
