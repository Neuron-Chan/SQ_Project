import java.lang.*;

public class Lecture2 { 
	
	public static class SquareArea {
		int length;
		
		//class constructor
		private SquareArea() {
	        length = 5;
	    }

	    public int getSquareArea() {
	        return length * length;
	    }
	    
	    public void setSquareArea(int c) {
	    	this.length = c;
	    }
	    
	    public static void main(String[] args) {
		SquareArea blank = new SquareArea();
		System.out.println(blank.getSquareArea());
		blank.setSquareArea(6);
		System.out.println(blank.getSquareArea());
		}
	}
}