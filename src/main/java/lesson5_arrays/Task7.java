package lesson5_arrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size;

        do {
            System.out.println("Enter valid size of the array:");
            size = sc.nextInt();
        } while (size <= 0);

        int[] firstArr = new int[size];
        int[] secondArr = new int[size];

        System.out.println("Enter values for array's elements:");
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = sc.nextInt();
        }

        secondArr[0] = firstArr[0];
        secondArr[firstArr.length - 1] = firstArr[firstArr.length - 1];

        int index = 1;
        for (int i = 0; i < firstArr.length; i++) {
            secondArr[index] = firstArr[i] + firstArr[i + 2];

            if (index == firstArr.length - 2) {
                break;
            }

            index++;
        }

        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
