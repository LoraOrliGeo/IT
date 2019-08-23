package main.java.lesson2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Day:");
        int day = sc.nextInt();
        System.out.println("Month:");
        int month = sc.nextInt();
        System.out.println("Year");
        int year = sc.nextInt();

        int[] daysInMonths = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean isLeapYear = false;

        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            if (month == 2) {
                day++;
                System.out.println("Next date is: " + day + ", " + month + ", " + year);
            } else {
                increaseDate(daysInMonths, day, month, year);
            }
        } else {
            increaseDate(daysInMonths, day, month, year);
        }
    }

    static void increaseDate(int[] daysInMonths, int day, int month, int year) {
        if (day < daysInMonths[month - 1]) {
            day++;
        } else {
            day = 1;

            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }

        System.out.println("Next date is: " + day + ", " + month + ", " + year);
    }
}
