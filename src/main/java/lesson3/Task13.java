package lesson3;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();

        for (int i = 100; i < 1000; i++) {
            int dec = i % 10;
            int tens = (i / 10) % 10;
            int hund = (i / 100) % 10;

            if (dec + tens + hund == sum){
                System.out.println(i);
            }
        }

    }
}
