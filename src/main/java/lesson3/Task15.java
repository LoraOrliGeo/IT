package lesson3;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;

        do{
            sum += num;
            num--;
        } while (num > 0);

        System.out.println(sum);
    }
}
