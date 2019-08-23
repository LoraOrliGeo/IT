package lesson3;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = 1; i <= num1 ; i++) {
            for (int j = 1; j <= num2; j++) {
                int res = i * j;
                System.out.println(i + " * " + j + " = " + res);
            }
        }

    }
}
