package tryObserver;

public class Test {
	public static void main(String[] args) {
		Store Costco = new Store("Costco", 20.25f);
		Store Walmart = new Store("Walmart", 15.12f);
		
		Customer bro = new Customer("Logan", "Paul", Costco);
		
		bro.register();
		
		Costco.setDiscount("coffee sale", 14f);
		
		bro.register(Costco);
	}
}