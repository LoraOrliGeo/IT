package lesson2;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();

        if (4 <= hour && hour < 9) {
            System.out.println("Good morning!");
        }

        if (9 <= hour && hour < 18) {
            System.out.println("Good day!");
        }

        if (18 <= hour && hour <= 24 || 0 <= hour && hour < 4) {
            System.out.println("Good evening!");
        }
    }
}