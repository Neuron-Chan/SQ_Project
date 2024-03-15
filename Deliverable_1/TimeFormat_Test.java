import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class Test
{
    //Instantiate new TimeFormat object
    @BeforeAll
    public void setUp() throws Exception
    {
        Ticket format24 = new Ticket(true, new Booking());
        Ticket format12 = new Ticket(false, new Booking());
        //True = 24 hour format
        //False = 12 hour format
    }

    //Test to check if the time format is 24 hour
    @Test
    public void testTimeFormat()
    {
        assertEquals(true, format24.getTimeFormat());
    }
    @Test
    public void testTimeFormat()
    {
        assertEquals(false, format12.getTimeFormat());
    }
}