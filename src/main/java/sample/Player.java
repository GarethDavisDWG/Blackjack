package sample;

import java.util.ArrayList;
import java.util.Collections;

public class Player {

    private ArrayList<Hand> hands = new ArrayList<Hand>();
    private double balance;
    private String name;

    public Player(){
        this("Leon");
    }
    public Player(String name){
        this(name,100);
    }

    public Player(String name, double balance){
        this.balance = balance;
        this.name = name;
        hands.add(new Hand());
    }
    public void splitCards(Hand hand, Card c, Card d){
        Hand splitHand = new Hand();
        splitHand.addCard(hand.getHand().get(1));
        hand.removeCard(hand.getHand().get(1));
        hand.addCard(c);
        splitHand.addCard(d);
        this.hands.add(splitHand);

    }


    public ArrayList<Hand> getHands() {
        return hands;
    }

    public void setHands(ArrayList<Hand> hands) {
        this.hands = hands;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( name+" in your hand you have ");
                for(Hand h:hands){
                    sb.append("Hand "+hands.indexOf(h)+System.lineSeparator());
                    sb.append(h);
                    if(h.currentScores().get(h.currentScores().indexOf(Collections.min(h.currentScores())))<22) {
                        sb.append("You are currently scoring:" + h.currentScores()+System.lineSeparator());
                    }
                }
                return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
