public class test {
	void silly(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < i; ++j) {
				
				System.out.println("j = " + j);
			}
		}
		
		for (int k = 0; k < 0; k++) {
			return;
		}
	}
}