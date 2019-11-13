package nuigalway.app;

import static nuigalway.app.App.student1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals("This is correct", "Mark Higgian18", student1.getUsername());
    }
}
