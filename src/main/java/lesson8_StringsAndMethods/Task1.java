package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter two strings with total length less than 40 symbols:");
            input = sc.nextLine();
        } while (input.length() >= 40);

        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].toUpperCase() + " ");
            System.out.print(words[i].toLowerCase() + " ");
        }

    }
}
