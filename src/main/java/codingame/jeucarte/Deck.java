package codingame.jeucarte;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck (int nb_cards) {
        cards= new ArrayList<Card>();

        int nb_card_distribute = 0;
        while (nb_card_distribute < nb_cards)
            for (Color c : Color.values()) {
                if (nb_card_distribute >= nb_cards) {
                    break;
                }
                for (Value v : Value.values()) {
                    if (nb_card_distribute >= nb_cards) {
                        break;
                    }
                    cards.add(new Card(c, v));
                    nb_card_distribute++;
                }
            }
    }

    public int size() {
        return cards.size();
    }

    public Collection<Card> displayDeck() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> getCards() {
        return cards;
    }
}
