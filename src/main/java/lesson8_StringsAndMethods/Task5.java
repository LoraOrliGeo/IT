package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two words:");
        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();

        char[][] matrix = new char[firstWord.length()][secondWord.length()];

        int minLength = firstWord.length();

        if (secondWord.length() < firstWord.length()) {
            minLength = secondWord.length();
        }

        boolean haveCrossingPoint = false;
        int firstCol = 0;
        int secondRow = 0;

        for (int i = 0; i < minLength; i++) {
            if (firstWord.charAt(i) == secondWord.charAt(i)) {
                haveCrossingPoint = true;
                firstCol = i;
                secondRow = i;
                break;
            }
        }

        if (haveCrossingPoint) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][firstCol] = firstWord.charAt(i);
            }

            matrix[secondRow] = secondWord.toCharArray();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == '\u0000') {
                        System.out.print(" ");
                    }
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("The words don't have crossing point");
        }
    }
}
