package lesson2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert volume, l:");
        int volume = sc.nextInt();

        int numberOfBuckets = volume / 5;
        int litersFromFirstBucket = numberOfBuckets * 2;
        int litersFromSecondBucket = numberOfBuckets * 3;
        int total = litersFromFirstBucket + litersFromSecondBucket;

        System.out.println(numberOfBuckets + " times per 2 liters");
        System.out.println(numberOfBuckets + " times per 3 liters");

        if (volume > total){
            System.out.println("Additional bucket of " + (volume - total) + " liters");
        }
    }
}
