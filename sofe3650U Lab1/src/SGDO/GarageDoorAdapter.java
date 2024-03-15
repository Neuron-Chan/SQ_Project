package SGDO;

public class GarageDoorAdapter extends PremiumGarageDoorOpener implements StdGarageDoorOpener {
	
	private int speed = 100;
	
	public GarageDoorAdapter() {
		super();		
	}
	
	public GarageDoorAdapter(int speed) {
		this();
		this.speed = speed;
	}
	
	@Override
	public
	void openDoor() {
		this.openDoor(speed);
	}
	
	@Override
	public
	void closeDoor() {
		this.closeDoor(speed);
	}
}
