import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class PlayerTest {
    @Test
    public void testGetName(){
        assertEquals(10,10,"This is a rubbish test");
    }

    @Test
    public void testSomethingElse(){
        String name ="Ash";
        assertSame(name,name,"This was not the same");
    }


}
