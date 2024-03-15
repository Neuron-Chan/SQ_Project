import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class Test
{
    //Instantiate new TimeFormat object
    @BeforeAll
    public void setUp() throws Exception
    {
        TimeFormat format24 = new TimeFormat(true);
        TimeFormat format12 = new TimeFormat(false);
        //True = 24 hour format
        //False = 12 hour format
    }

    //Test the time format method with lowest bound for each format
    @Test
    public void testTimeFormat()
    {
        assertEquals(true, format24.getTimeFormat(0000 % 100));//First digit
    }
    @Test
    public void testTimeFormat()
    {
        assertEquals(false, format24.getTimeFormat(0000 / 100));//Second digit
    }
}