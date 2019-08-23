package lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] cardValues = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        List<String> cardColors = Arrays.asList("clubs", "diamonds", "hearts", "spades");

        int value = cardValues[n / 4 - 1];
        String color = cardColors.get(n % 4 - 1);

        for (int i = value; i < cardValues.length; i++) {
            String cardName = "";

            switch (i){
                case 9:
                    cardName = "Jack"; // J
                    break;
                case 10:
                    cardName = "Queen"; //Q
                    break;
                case 11:
                    cardName = "King"; // K
                    break;
                case 12:
                    cardName = "Ace"; // A
                    break;
                default:
                    cardName = i + "";
                    break;
            }

            String col = "";
            for (int j = cardColors.indexOf(color); j < cardColors.size(); j++) {
                col = cardColors.get(j);
            }

            System.out.println(cardName + " " + col);
        }

    }
}
