import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import sample.Card;
import sample.Suit;
import sample.Value;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {

    @Test
    public void testGetCardSuit(){
        Card card = new Card(Suit.CLUBS, Value.ACE);
        assertEquals(Suit.CLUBS,card.getSuit(),"The suits were not returned the same");
    }

    @Test
    @DisplayName("Test that the Value comes out is correct")
    public void testGetCardValue(){
        Card card = new Card(Suit.CLUBS, Value.QUEEN);
        assertEquals(10, card.getValue().getNumericalValue(),"Card value was not equal to 10");
    }


}
