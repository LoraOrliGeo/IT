package main.java.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstRow = sc.nextInt();
        int firstCol = sc.nextInt();

        int secondRow = sc.nextInt();
        int secondCol = sc.nextInt();

        // if the row is a odd number (1,3,5,7) -> the black cells are those with odd col position
        // if the row is an even number (2,4,6,8) -> the black cells are those with even col position

        if (firstRow % 2 != 0 && secondRow % 2 != 0) {
            if (cellsHaveSameColor(firstCol, secondCol)) {
                System.out.println("The positions are with same color!");
            } else {
                System.out.println("The positions are with different color!");
            }
        } else if (firstRow % 2 == 0 && secondRow % 2 == 0) {
            if (cellsHaveSameColor(firstCol, secondCol)) {
                System.out.println("The positions are with same color!");
            } else {
                System.out.println("The positions are with different color!");
            }
        } else {
            if (firstRow % 2 != 0 && firstCol % 2 != 0 && secondRow % 2 == 0 && secondCol % 2 == 0) {
                System.out.println("The positions are with same color!");
            } else {
                System.out.println("The positions are with different color!");
            }
        }
    }

    static boolean cellsHaveSameColor(int firstCol, int secondCol) {
        if ((firstCol % 2 != 0 && secondCol % 2 != 0) || (firstCol % 2 == 0 && secondCol % 2 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
