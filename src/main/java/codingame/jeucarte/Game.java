package codingame.jeucarte;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private int nb_player;
    private int nb_card;
    private Deck deck;
    private List<Player> players;

    public Game(int nb_player, int nb_card) {
        this.nb_player = nb_player;
        this.nb_card = nb_card;
        this.players = initPlayers(nb_player);
        this.deck = new Deck(nb_card);
    }

    public Game(int nb_player, Deck deck) {
        this.players = initPlayers(nb_player);
        this.deck = deck;
    }

//    private void initDeck(int nb_card) {
//        return this.deck.initDeck(nb_card);
//    }

    private List<Player> initPlayers(int nb_player) {
        List<Player> players = new ArrayList<Player>();
        for (int i=0; i< nb_player; i++){
            players.add( new Player("Player no : "+i));
        }
        return  players;
    }

    public Deck getDeck() {
        return deck;
    }

    List<Player> getPlayers() {
        return players;
    }

    public void startGame() {
        shuffleDeck();
        distributeDeck();
    }

    public void distributeDeck() {
        int compteur = 0;
        for (int i =0; i< players.size() ;i++){
            for( int j = compteur ; j< (deck.size()/players.size())*(i+1) ; j++){
                players.get(i).addCard( deck.getCards().get(j));
            }
            compteur += (deck.size()/players.size());
        }
    }

    public void shuffleDeck() {
        this.deck.shuffle();
    }

    public int getNb_player() {
        return nb_player;
    }

    public void setNb_player(int nb_player) {
        this.nb_player = nb_player;
    }

    public int getNb_card() {
        return nb_card;
    }

    public void setNb_card(int nb_card) {
        this.nb_card = nb_card;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
