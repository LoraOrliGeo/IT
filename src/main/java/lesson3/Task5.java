package lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert first number:");
        int a = sc.nextInt();

        System.out.println("Insert second number:");
        int b = sc.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
