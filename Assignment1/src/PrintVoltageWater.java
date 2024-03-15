import java.util.Random;

public class PrintVoltageWater {
	
	/** Create a new Java class PrintVoltageWater that prints a table showing the meter voltage corresponding to 
	 * 20 random water temperatures varying from 0 °C to 100 °C degrees.
	 *
	 * @Author Rolf-Jaden Sibal
	 * @Date October 1 2022
	 */
	
	
	/**
	 * This code creates a random value for temperature.
	 */
	public static double temperature() {
		Random temp = new Random();
		double celsius = temp.nextInt(100 - 0) + 1;
		return celsius;
	}
	
	/**
	 * This code creates a random value for the resistor using the value from the temperature.
	 */
	public static double resistor() {
		double temp = temperature();
		double res = (50 * (0.5 * temp));
		return res;
	}
	
	/**
	 * This code creates a random value for the voltmeter using the value from the resistor.
	 */
	public static double voltmeter() {
		double res = resistor();
		double volt = 20 * (res/(75 + res));
		return volt;
	}
	
	public static void main(String[] args) {
	
		for (int i = 1; i <= 20; i++)
		{
			System.out.println(voltmeter());
		}
		
	
	}
	
}