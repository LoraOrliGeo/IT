package BookProblems;

import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1
//        int num;
//        do {
//            System.out.println("Enter 3-digit number:");
//            num = sc.nextInt();
//        } while (num < 100 || num > 999);
//        task1CheckIfNumIsDivisibleByItsDigits(num);

        //2
//        System.out.println("Enter three numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.print("Numbers in descending order: ");
//        task2PrintNumbersInDescendingOrder(a, b, c);

        //3
//        System.out.println("Enter degrees in Celsius:");
//        int degrees = sc.nextInt();
//        System.out.println(task3GetMessageAccordingToDegrees(degrees));

        //4
//        int num;
//        do {
//            System.out.println("Enter 3-digit number:");
//            num = sc.nextInt();
//        } while (num < 100 || num > 999);
//        task4(num);

        //5

    }

    private static void task1CheckIfNumIsDivisibleByItsDigits(int num) {
        int numInitValue = num;
        int hundreds = num / 100;
        num %= 100;
        int tens = num / 10;
        int ones = num % 10;

        if (hundreds == 0 || tens == 0 || ones == 0) {
            System.out.println("The number contains 0!");
        } else {
            if (numInitValue % hundreds == 0 && numInitValue % tens == 0 && numInitValue % ones == 0) {
                System.out.println("The number is divisible by its 3 digits :)");
            } else {
                System.out.println("The number is NOT divisible by its 3 digits :(");
            }
        }
    }

    private static void task2PrintNumbersInDescendingOrder(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            System.out.println("The three numbers are not different!");
            return;
        }

        if (a < b && a < c) {
            if (b < c) {
                print(c, b, a);
            } else {
                print(b, c, a);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                print(c, a, b);
            } else {
                print(a, c, b);
            }
        } else {
            if (a < b) {
                print(b, a, c);
            } else {
                print(a, b, c);
            }
        }
    }

    private static void print(int first, int second, int third) {
        System.out.println(String.format("%d %d %d", first, second, third));
    }

    private static String task3GetMessageAccordingToDegrees(int degrees) {
        String output;

        if (degrees < -20){
            output = "freezing cold";
        } else if (degrees <= -1){
            output = "cold";
        } else if (degrees <= 14){
            output = "cool";
        } else if (degrees <= 25){
            output = "warm";
        } else {
            output = "hot";
        }

        return output;
    }

    private static void task4(int num) {
        int hundreds = num / 100;
        num %= 100;
        int tens = num / 10;
        int ones = num % 10;

        if (hundreds == tens && tens == ones){
            System.out.println("The digits are equal.");
        } else if (hundreds > tens && tens > ones){
            System.out.println("The digits are in ascending order.");
        } else if (hundreds < tens && tens < ones){
            System.out.println("The digits are in descending order.");
        } else {
            System.out.println("The digits are unordered.");
        }
    }
}
