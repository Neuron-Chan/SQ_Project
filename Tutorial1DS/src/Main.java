public class Main {
	
	static int sum(int[][] a, int r, int c) {
	
	if (c >= a[r].length) {
		
		r++;
		c = 0;
		
		if (r >= a.length) {
			return 0;
		}
		else {
			return a[r][c] + sum(a, r, c + 1);
		}
	}
	else {
		return a[r][c] + sum(a, r, c + 1);
	} 
	}
	
	public static void main(String[] args) {
		int n = 3;
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };
		System.out.print(sum(array, 0, 0));
  }
}

