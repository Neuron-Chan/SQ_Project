import java.util.ArrayList;
import java.util.List;

//100845721 Rolf-Jaden Sibal

public class IntSeg {
	
	public interface Hero {
		void heroic();
	}
	
	public interface Paladin extends Hero {
		void shield();
		void sword();
	}
	
	public interface Mage extends Hero {
		void fireball();
		void magicMissile();
	}
	
	public static class Jerry implements Mage {
		
		@Override
		public void heroic() {
			System.out.println("Jerry, to defeat the forces of evil... ");
		}

		@Override
		public void fireball() {
			System.out.println("Jerry casts fireball! ");
			
		}

		@Override
		public void magicMissile() {
			System.out.println("Jerry casts magic missile! ");			
		}
	}
	
		public static void main(String[] args) {
			Jerry demo = new Jerry();
			demo.heroic();
			demo.fireball();
			demo.magicMissile();
	}
}