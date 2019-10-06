package module_two.war_game;

public final class Game {

    private Game() {
    }

    static void war(Player player1, Player player2) {
        int round = 1;
        while (player1.getInitCards()[0] != 0 || player2.getInitCards()[0] != 0) {
            System.out.print(round + " ");
            int player1Card = player1.getTopCard();
            int player2Card = player2.getTopCard();

            if (player1Card > player2Card) {
                System.out.println(String.format("%s takes this hand!", player1.getName()));
                player1.addWonCard(player1Card);
                player1.addWonCard(player2Card);
            } else if (player2Card > player1Card) {
                System.out.println(String.format("%s takes this hand!", player2.getName()));
                player2.addWonCard(player2Card);
                player2.addWonCard(player1Card);
            } else {
                //war
                System.out.println("WAR!");
            }
            round++;
        }
    }
}
