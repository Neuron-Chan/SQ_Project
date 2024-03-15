public class Maze {
	
	private final int TRIED = 3;
	private final int PATH = 7;
	
	private final int [][] grid = {
			{1,1,1,0,1,1,1,0,1,1,1,1,1},
			{1,1,0,0,0,1,0,0,0,1,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1},
			{1,1,1,0,1,1,0,0,0,1,1,1,1},
			{1,1,1,0,1,1,1,0,1,1,1,1,1},
			{1,1,1,0,1,1,0,0,0,1,1,1,1},
			{1,0,0,0,1,1,0,0,0,1,1,1,1},
			{1,1,1,0,1,1,0,0,0,1,1,1,1},
			{1,1,1,0,1,1,0,0,0,1,1,1,1}
	};
	
	public boolean traverse(int row, int col) {
		boolean done =false;
		if (valid(row,col)) {
			grid[row][col]=TRIED;
			if(row==grid.length-1 && col==grid[row].length-1) {
				done = true;
			}
			else {
				done = traverse(row+1, col);
				if(!done) {
					done = traverse(row, col+1);
				}
				if(!done) {
					done = traverse(row-1, col);
				}
				if(!done) {
					done = traverse(row-1, col-1);
				}
				if (done)
				grid[row][col]=PATH;
			}
		}
		return done;
	}
	
	public boolean valid(int row, int col) {
		boolean result = false;
		
		if (row >= 0 && row<grid.length && col>=0 && col<=grid[row].length && grid[row][col]==1) {
			result = true;
		}
		return result;
	}
	
	public String toString() {
		String temp="";
		for (int row=0; row < grid.length; row++) {
			for (int col=0; col < grid.length; col++) {
				temp += grid[row][col]+ " ";
			}
			temp += "\n";
		}
		return temp;
	}
}
