package BookProblems;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1
//        int first = sc.nextInt();
//        int second = sc.nextInt();
//        task1PrintNumsFromSmellerToBiggest(first, second);

        //2
//        int x;
//        do {
//            x = sc.nextInt();
//        } while (x <= 0);
//        task2PrintFirstXNumDivByThree(x);

        //3
        int num;
        do {
            System.out.println("Enter 4-digit number:");
            num = sc.nextInt();
        } while (num < 1000 || num > 9999);
        task3CheckIfTheNumIsPalindrome(num);
    }

    private static void task1PrintNumsFromSmellerToBiggest(int first, int second) {
        int min = first;
        int max = second;

        if (second < first) {
            min = second;
            max = first;
        }

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }

    private static void task2PrintFirstXNumDivByThree(int x) {
        int num = 3;
        for (int i = 1; i <= x; i++) {
            System.out.print(num + " ");
            num += 3;
        }
    }

    private static void task3CheckIfTheNumIsPalindrome(int num) {
        int thousands = num / 1000;
        num %= 1000;
        int hundreds = num / 100;
        num %= 100;
    }
}
