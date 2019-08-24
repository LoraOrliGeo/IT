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
        String color = cardColors.get(n % 4); // ??? -1 what if n % 4 == 0

        int indexOfValue = cardValues.indexOf(value);

        for (int j = cardColors.indexOf(color) - 1; j < cardColors.size(); j++) {
            System.out.println(getCardName(indexOfValue) + " " + cardColors.get(j));
        }

        for (int i = cardValues.indexOf(value) + 1; i < cardValues.size(); i++) {
            for (int j = 0; j < cardColors.size(); j++) {
                System.out.println(getCardName(i) + " " + cardColors.get(j));
            }
        }
    }

    static String getCardName(int index) {
        String cardName = "";

        switch (index) {
            case 9:
                cardName = "Jack";
                break;
            case 10:
                cardName = "Queen";
                break;
            case 11:
                cardName = "King";
                break;
            case 12:
                cardName = "Ace";
                break;
            default:
                cardName = index + 2 + "";
        }

        return cardName;
    }
}
