public class Display {
	public Display getDisplay(String barcode) {
		if (barcode == null) {
			return null;
		}
		if (barcode.equalsIgnoreCase("Barcode")) {
			return new Observer();
		}
	}
}