package sample;

import java.util.ArrayList;
import java.util.Stack;

//change to a singleton class
public class Game {

    private ArrayList<Player> players = new ArrayList<Player>();
    private Stack<Card> shuffledDecks;
    public Game(){
              //demo settings
        players.add(new Player());
        players.add(new Dealer());
        shuffledDecks = Shuffle.shuffle(6);
    }

    public void deal(int cardsToDeal){
        for(int i = 0;i<cardsToDeal;i++){
            for(Player p :players){
                for(Hand h:p.getHands()){
                    h.addCard(shuffledDecks.pop());
                }
            }
        }
    }

    public Card dealACard(){
        return shuffledDecks.pop();
    }


    public String gameToString(){
        StringBuilder sb = new StringBuilder();
        for(Player p:this.players) {
            sb.append(p.toString());
        }

        return sb.toString();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Stack<Card> getShuffledDecks() {
        return shuffledDecks;
    }

    public void setShuffledDecks(Stack<Card> shuffledDecks) {
        this.shuffledDecks = shuffledDecks;
    }
}
