package SGDO;

import java.util.logging.Logger;

public class PremiumGarageDoorApp {
	
  private Logger log = Logger.getLogger(
		  PremiumGarageDoorApp.class.getSimpleName());
    private PremiumGarageDoorOpener garageDoorOpener;
    public PremiumGarageDoorApp(PremiumGarageDoorOpener garageDoorOpener) {
    	this.garageDoorOpener = garageDoorOpener;
    }
    public void openDoor(int speed) {
    	this.garageDoorOpener.openDoor(speed);
    	log.info("Garage Door is Open");
    }
    public void closeDoor(int speed) {
    	this.garageDoorOpener.closeDoor(speed);
    	log.info("Garage Door is Closed");
    }
}
