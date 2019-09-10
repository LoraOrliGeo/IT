package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();

        System.out.println(firstWord.length() == secondWord.length() ?
                "The words have same length." : "The words have different length");

        int minLength = firstWord.length();

        if (firstWord.length() > secondWord.length()){
            minLength = secondWord.length();
        }

        int count = 0;

        for (int i = 0; i < minLength; i++) {
            char firstChar = firstWord.charAt(i);
            char secondChar = secondWord.charAt(i);
            if (firstChar != secondChar) {
                if (count == 0){
                    System.out.println("Difference by positions:");
                }
                count++;
                System.out.printf("%d %c-%c%n", i + 1, firstChar, secondChar);
            }
        }

    }
}
