package lesson5_arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many cells the arrays will have:");
        int size = sc.nextInt();

        int[] firstArray = new int[size];
        int[] secondArray = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = sc.nextInt();
        }

        for (int i = 0; i < firstArray.length/2; i++) {
                secondArray[i] = firstArray[i];
        }

        int secondArrInd = firstArray.length/2;

        for (int i = firstArray.length - 1; i >= firstArray.length/2 ; i--) {
            secondArray[secondArrInd] = firstArray[i];
            secondArrInd++;
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
