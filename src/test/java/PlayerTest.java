import org.junit.Test;
import sample.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PlayerTest {
    @Test

    public void testGetName(){
        Player testPlayer = new Player();
        testPlayer.setName("Simon");
        assertEquals(testPlayer.getName(),"Simon","This is a rubbish test");
    }

    @Test
    public void testSomethingElse(){
        String name ="Ash";
        assertSame(name,name,"This was not the same");
    }


}
