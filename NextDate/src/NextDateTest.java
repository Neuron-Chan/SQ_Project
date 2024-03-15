import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NextDateTest {

	@Test
	public void testNextDateLeapYear() {
    	assertEquals("2022-03-01", NextDate.findNextDate(2022, 2, 28));
    	assertEquals("2024-02-29", NextDate.findNextDate(2024, 2, 28));
	}

	@Test
	public void testNextDateValidDate() {
    	assertEquals("2022-01-02", NextDate.findNextDate(2022, 1, 1));
    	assertEquals("2022-12-01", NextDate.findNextDate(2022, 11, 30));
	}

	@Test
	public void testNextDateEndOfYear() {
    	assertEquals("2022-01-01", NextDate.findNextDate(2021, 12, 31));
    	assertEquals("2023-01-01", NextDate.findNextDate(2022, 12, 31));
	}

	@Test
	public void testNextDateBoundaryYear() {
    	assertEquals("1813-01-01", NextDate.findNextDate(1812, 12, 31));
    	assertEquals("Invalid Date", NextDate.findNextDate(2212, 12, 31));
	}

	@Test
	public void testNextDateInvalidDate() {
    	assertEquals("Invalid Date", NextDate.findNextDate(2022, 2, 30));
    	assertEquals("Invalid Date", NextDate.findNextDate(2022, 13, 31));
	}
    
	@Test
	public void testNextDateNotLeapYear() {
    	assertNotEquals("1900-02-29", NextDate.findNextDate(1900, 2, 28));
    	assertNotEquals("1800-02-29", NextDate.findNextDate(1800, 2, 28));
	}
}
