package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words separated by space:");
        String[] words = sc.nextLine().split(" ");

        int count = 0;
        int maxLength = words[0].length();

        for (int i = 0; i < words.length; i++) {
            count++;
            int currLength = words[i].length();

            if (currLength > maxLength) {
                maxLength = currLength;
            }
        }

        System.out.println(count + " words, longest word has " + maxLength + " symbols");
    }
}
