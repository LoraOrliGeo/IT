package lesson8_StringsAndMethods;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input;

        do {
            System.out.println("Enter sequentially two words (length 10-20 symbols each)");
            input = sc.nextLine();
        } while (10 > input.length() || input.length() > 20);

        String[] words = input.split("\\s+");
        String firstWord = words[0];
        String secondWord = words[1];

        String firstOld = getFirstFiveSymbols(firstWord);
        String secondOld = getFirstFiveSymbols(secondWord);

        String firstNew = getFirstFiveSymbols(secondWord);
        String secondNew = getFirstFiveSymbols(firstWord);

        firstWord = firstWord.replace(firstOld, firstNew);
        secondWord = secondWord.replace(secondOld, secondNew);

        int maxLength = firstWord.length();

        if (secondWord.length() > firstWord.length()){
            maxLength = secondWord.length();
        }

        System.out.println("The length of longer word is " + maxLength);
        System.out.printf("Words after replacements: %s %s", firstWord, secondWord);
    }

    public static String getFirstFiveSymbols(String word){
        return String.valueOf(word.subSequence(0,5));
    }
}
