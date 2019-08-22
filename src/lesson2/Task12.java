package lesson2;

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

        boolean isLeapYear = false;

        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            if (day == 28 && month == 2) {
                day++;
            } else if (day < 31) {
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
        } else {
            if (day == 28 && month == 2) {
                day = 1;
                month++;
            } else if (day < 31) {
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
        }

        System.out.println("Next date is: " + day + ", " + month + ", " + year);
    }
}
