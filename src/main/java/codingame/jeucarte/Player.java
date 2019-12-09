package codingame.jeucarte;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Card> cards;
    private String name;

    public Player(String name) {
        this.cards = new ArrayList<Card>();
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCard( Card card){
        cards.add(card);
    }
}
