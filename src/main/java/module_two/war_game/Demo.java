package module_two.war_game;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        CardDeck deck = new CardDeck();
        Player lori = new Player("Lori");
        Player grigor = new Player("Grigor");
        deck.dealingCards(lori, grigor);
        System.out.println(Arrays.toString(lori.getInitCards()));
        System.out.println(Arrays.toString(grigor.getInitCards()));

//        System.out.println("Lori        Grigor");
////        for (int i = 0; i < 26; i++) {
////            System.out.println(lori.getTopCard() + "    " + grigor.getTopCard());
////        }

        Game.war(lori, grigor);
    }
}
