package SGDO;

import java.util.logging.Logger;

public class GarageDoorDriver {
    private Logger log = Logger.getLogger(
    		GarageDoorDriver.class.getSimpleName());

    public GarageDoorDriver(){
		// Nothing to initialize
	}
	public void openDoor(int speedLevel){
		log.info("Garage Door Opening at " + speedLevel + "speed");
	}
	public void closeDoor(int speedLevel){
		log.info("Garage Door Closing " + speedLevel + "speed");
	}
}
