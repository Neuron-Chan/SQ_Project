package tryObserver;

public class Customer extends Observer {
	
	private String firstName;
	private String lastName;
	private float discount;
	private Store favStore;
	
	public Customer(String firstName, String lastName, Store favStore) {
		this.firstName = firstName;	
		this.lastName = lastName;
		this.favStore = favStore;
	}
	
	@Override
	public void update(float discount) {
		this.discount = discount;
		System.out.println("Customer Name: " + firstName + " " + lastName + ", Discount Price: " + discount);
	}
	
	public void register() {
		favStore.register(this);
	}
	
	public void register(Store favStore) {
		favStore.register(this);
	}
	
	public void unregister() {
		favStore.unregister(this);
	}
}