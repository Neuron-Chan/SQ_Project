package SGDO;

import java.util.HashMap;
import java.util.Map;

public class PremiumGarageDoorOpener {

	private enum FeatureSelection {GARAGEDOOR, LIGHTSWITCH, AIRCOMPRESSOR, CAMERA};
	private Map<FeatureSelection, Object> featureMap;
	
	public PremiumGarageDoorOpener() {
		this.featureMap = new HashMap<>();
        this.featureMap.put(
        		FeatureSelection.GARAGEDOOR, new GarageDoorDriver());
	}
	
	public void openDoor(int speedLevel) {
		((GarageDoorDriver) featureMap.get(FeatureSelection.GARAGEDOOR)).openDoor(speedLevel);;
	}
	public void closeDoor(int speedLevel) {
		((GarageDoorDriver) featureMap.get(FeatureSelection.GARAGEDOOR)).closeDoor(speedLevel);;

	}
}
