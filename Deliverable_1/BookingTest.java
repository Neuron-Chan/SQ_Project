import static org.junit.Assert.*;

import org.junit.Test;

public class BookingTest {

	@Test
	public void roundtest() {
		assertEquals("valid", Booking.GetFlightType("Round-Trip"));
	}

	@Test
	public void onewaytest() {
		assertEquals("valid", Booking.GetFlightType("One-Way"));
	}
}
