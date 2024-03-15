import java.util.ArrayList;
import java.util.List;

public class LiskovSub {
	
	public static class Bird {
		public boolean hasWings() {
			return true;
		}	
	}
	
	public static class FlyingBirds extends Bird {
		
	    public boolean canFly() {
	    	return true;
	    }
	}
	
	public static class Duck extends FlyingBirds {
		
	}
	
	public static class Goose extends FlyingBirds {
		public boolean isScary() {
			return true;
			}
	}
	public static class Ostrich extends Bird {
		
	} 
	
	public static void main(String[] args) {
		List<Bird> birdList = new ArrayList<>();
		birdList.add(new Goose());
		birdList.add(new Duck()); 
		birdList.add(new Ostrich()); 
		
		for (Bird bird : birdList) {
			System.out.println(bird.hasWings());
		}
	}
}