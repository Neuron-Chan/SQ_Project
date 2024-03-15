import static org.junit.Assert.*;

import org.junit.Test;

public class AirportTest {

	@Test
	public void Airport() {
	assertEquals("Exists", Airport.Airport("Toronto, Oshawa");
	}

	@Test
	public void ConnectAirport() {
	assertEquals("Oshawa", Airport.GetConnectingAirports("Toronto");
	}
	
	@Test
	public void Name() {
	assertEquals("Toronto", Airport.GetName("Toronto");
	}

}
