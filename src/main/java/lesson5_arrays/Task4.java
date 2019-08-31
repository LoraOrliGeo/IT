package lesson5_arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isMirror = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isMirror = false;
                break;
            }
        }

        if (isMirror) {
            System.out.println("The array is mirror");
        } else {
            System.out.println("The array is not mirror");
        }
    }
}
