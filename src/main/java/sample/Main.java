package sample;

import java.util.HashMap;
import java.util.Scanner;

public class Main //extends Application
{

   public static void main(String[] args) {
        //Card card = new Card(Suit.SPADES,Value.ACE);
        //Deck deck = new Deck();
        System.out.print(Shuffle.shuffle(3));
        Game game = new Game();
        game.deal(2);
        System.out.print(game.gameToString());
        //
       for(Player p: game.getPlayers()){
           playTurn(game,game.getPlayers().indexOf(p),0);
       }

        //game.getPlayers().get(0).splitCards(game.getPlayers().get(0).getHands().get(0),game.dealACard(),game.dealACard());
        System.out.print(game.gameToString());

    }

    public static void playTurn(Game g,int player, int hand){
        //add niceness for bust and blackjack
        System.out.println("Player " + g.getPlayers().get(player).getName() +System.lineSeparator()+"You are currently scoring:"+g.getPlayers().get(player).getHands().get(hand).currentScores());
        System.out.println("Would you like to stick or twist?");
        Scanner scan = new Scanner(System.in);
        boolean validInput = false;
        do{
            String input = scan.next().toUpperCase();
            if(input.equals("STICK")){
                validInput = true;
            }
            else if(input.equals("TWIST")){
                validInput = true;
                g.getPlayers().get(player).getHands().get(hand).addCard(g.dealACard());
            }
        }while(!validInput);

        HashMap<String,Card> handy = new HashMap<>();

    }

}
