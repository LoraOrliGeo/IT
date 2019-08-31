package lesson5_arrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter elements for the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxCountOfRepeatNums = 1;
        int countOfRepeatNums = 1;
        int endIndex = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                countOfRepeatNums++;

                if (countOfRepeatNums >= maxCountOfRepeatNums) {
                    maxCountOfRepeatNums = countOfRepeatNums;
                    endIndex = i + 1;
                }
            } else {
                countOfRepeatNums = 1;
            }
        }

        int startIndex = endIndex - maxCountOfRepeatNums + 1;

        System.out.print("Longest sequence of equal numbers is: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
