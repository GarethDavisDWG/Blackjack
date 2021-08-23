package sample;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }
public void addCard(Card c){
        this.hand.add(c);
}
public void removeCard(Card c){
        this.hand.remove(c);
}

    public ArrayList<Integer> currentScores(){
        ArrayList<Integer> values = new ArrayList<Integer>();
        int value = 0;
        boolean hasAnAce = false;
        for(Card c:hand){
            if(c.getValue()==Value.ACE){
                hasAnAce = true;
            }
            value += c.getValue().getValue();
        }
        values.add(value);
        if (hasAnAce){
            values.add(value+11);
        }
        return values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Card c:hand){
            sb.append(c+System.lineSeparator());
        }

        return sb.toString();
    }
}
