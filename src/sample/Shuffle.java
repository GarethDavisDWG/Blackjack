package sample;

import java.util.Random;
import java.util.Stack;

public class Shuffle {

    public static Stack<Card> shuffle(int numberOfDecks){
        Deck deck = new Deck();
        Stack<Card> shuffledDeck = new Stack<Card>();
        for(int i =1;i<numberOfDecks;i++){
            deck.addExtraDeck();
        }
        while(deck.getDeckOfCards().size() != 0)
        {
            Random random = new Random();
            int index = random.nextInt(deck.getDeckOfCards().size());
            shuffledDeck.push(deck.getCard(index));
            deck.removeCardFromDeck(index);
        }
        return shuffledDeck;
    }

}
