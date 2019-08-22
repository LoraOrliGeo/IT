package lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int firstDigit = num / 1000;
        int fourthDigit = num % 10;

        int firstNum = Integer.parseInt(firstDigit + "" + fourthDigit);

        int secondDigit = (num / 100) % 10;
        int thirdDigit = (num / 10) % 10;

        int secondNum = Integer.parseInt(secondDigit + "" + thirdDigit);

        if (firstNum < secondNum) {
            System.out.println("less (" + firstNum + " < " + secondNum + ")");
        } else if (firstNum > secondNum){
            System.out.println("bigger (" + firstNum + " > " + secondNum + ")");
        } else {
            System.out.println("equal (" + firstNum + " = " + secondNum + ")");
        }
    }
}
