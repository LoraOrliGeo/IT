package lesson3;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = Math.max(a, b); i >= Math.min(a, b) ; i--) {
            if (i % 50 == 0){
                System.out.println(i);
            }
        }
    }
}