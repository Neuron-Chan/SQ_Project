import java.util.Random;

public class CoinFlip {
 		private int face;
 		
 		public void Coin() {
 			this.face = 0;
 		}
 		
 		public void flip() {
 			Random random = new Random();
 			int randNum = random.nextInt(2);
 			this.face = randNum;
 		}
 		
 		public int getFace() {
 			return this.face;
 		}
 		
 		public static void main(String[] args) {
 		
 			
 		}
 		
 	}