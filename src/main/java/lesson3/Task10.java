package lesson3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("Number is prime!");
        } else {
            System.out.println("Number is not prime!");
        }
    }
}