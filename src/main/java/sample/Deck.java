package sample;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckOfCards = new ArrayList<>();


    public Deck(){
        this.deckInitialiser();
    }



    private void deckInitialiser(){
        Suit currentSuit = Suit.SPADES;
        Value currentValue = Value.ACE;
        for(int i=0;i<4;i++){
            switch (i) {
                case 0 -> currentSuit = Suit.SPADES;
                case 1 -> currentSuit = Suit.DIAMONDS;
                case 2 -> currentSuit = Suit.CLUBS;
                case 3 -> currentSuit = Suit.HEARTS;
            }

            for(int j=0;j<13;j++){
                switch (j) {
                    case 0 -> currentValue = Value.ACE;
                    case 1 -> currentValue = Value.TWO;
                    case 2 -> currentValue = Value.THREE;
                    case 3 -> currentValue = Value.FOUR;
                    case 4 -> currentValue = Value.FIVE;
                    case 5 -> currentValue = Value.SIX;
                    case 6 -> currentValue = Value.SEVEN;
                    case 7 -> currentValue = Value.EIGHT;
                    case 8 -> currentValue = Value.NINE;
                    case 9 -> currentValue = Value.TEN;
                    case 10 -> currentValue = Value.JACK;
                    case 11 -> currentValue = Value.QUEEN;
                    case 12 -> currentValue = Value.KING;
                }
                deckOfCards.add(new Card(currentSuit,currentValue));
            }
        }
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public void addExtraDeck(){
        this.deckOfCards.addAll(new Deck().getDeckOfCards());
    }
    public Card getCard(int index){
        return this.deckOfCards.get(index);
    }
    public void removeCardFromDeck(int index){
        this.deckOfCards.remove(index);
}


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for(Card c: this.deckOfCards){
            sb.append(c+System.lineSeparator());
        }
        return sb.toString();
    }
}
