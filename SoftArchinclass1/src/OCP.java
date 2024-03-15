import java.security.InvalidParameterException;

public class OCP { 
	
	public interface Shape {
		static public void calcArea(int n) {
			System.out.println("Current input: " + n);
		}
	}
	
	public static class Rectangle implements Shape {
		
		private double length;
	    private double width;
	    private double result;
	    
	    public double getRect() {
	    	return length * width;
	    }
	    
	    public void setRect(double u) {
	    	this.length = 5;
	    	this.width = 6;
	    }
	    
	    public double getResult() {
	        return result;
	    }

	    public void setResult(double result) {
	        this.result = result;
	    }
	    
	    @Override
	    public void calcArea() {
	    	result = length * width;
	    }
	    
	    public static void main(String[] args) {
			Rectangle try = new Rectangle();
		}
	}
			
		
	}