package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> cardValues = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
                                                                            //J,  Q,  K,  A
        List<String> cardColors = Arrays.asList("clubs", "diamonds", "hearts", "spades");

        int value = cardValues.get(n / 4);
        String color = cardColors.get((n - 1) % 4);

        int indexOfValue = cardValues.indexOf(value);

        for (int j = cardColors.indexOf(color); j < cardColors.size(); j++) {
            printCard(getCardName(indexOfValue), cardColors.get(j));
        }

        for (int i = cardValues.indexOf(value) + 1; i < cardValues.size(); i++) {
            for (String cardColor : cardColors) {
                printCard(getCardName(i), cardColor);
            }
        }
    }

    private static String getCardName(int index) {
        switch (index) {
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                return String.format("%d", index + 2);
        }
    }

    private static void printCard(String cardName, String cardColor) {
        System.out.println(String.format("%s %s", cardName, cardColor));
    }
}
