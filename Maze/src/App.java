public class App {
	
	public static void main(String[] args) {
		Maze maze = new Maze();
		System.out.println(maze);
		maze.traverse(0,0);
		System.out.println(maze.valid(4, 5));
	}
}