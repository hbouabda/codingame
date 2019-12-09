package codingame.jeucarte;

import java.util.Scanner;

public class JeuxCarte {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        int NbreCads = in.nextInt();
        int NbrePlayers = in.nextInt();

        Game game = new Game(NbrePlayers,NbreCads);
        game.startGame();

        for(Player player :game.getPlayers()){
            System.out.println("Player  -> "+ player.getName());
            for (Card card : player.getCards()){
                System.out.println("Card Color -> "+ card.getColor());
                System.out.println("Card Value -> "+ card.getValue());
            }
        }
    }
}
