package SGDO;

public class TestGarageDoors {
	
	public static void main(String[] args) {
		GarageDoorApp app = new GarageDoorApp(new BasicGarageDoor());
		
		app.openDoor();
		app.closeDoor();
		
		app = new GarageDoorApp(new GarageDoorAdapter());
		
		app.openDoor();
		app.closeDoor();
		
		app = new GarageDoorApp(new GarageDoorAdapter(25));
		
		app.openDoor();
		app.closeDoor();
	}
}