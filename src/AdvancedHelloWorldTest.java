
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class AdvancedHelloWorldTest {

	@Test
    public void testAdvancedHelloWorld() {
        try {
            new AdvancedHelloWorld();
        } catch (Exception e) {
            fail("Construction failed. ");
        }
    }

    @Test
    public void testMain() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        AdvancedHelloWorld.main(null);
        assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        System.setOut(null);
    }

    @Test
    public void testToString() {
        String helloWorldString =  new AdvancedHelloWorld().toString();
        assertEquals("AdvancedHelloWorld [message=Hello World!]",helloWorldString);
    }

}

