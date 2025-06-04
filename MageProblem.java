
public class MageProblem {
	public static void main(String[] args) {
		int [][] maze = {
				{0,1,0},
				{0,0,0},
				{0,1,0}};
		System.out.println(findMaze(maze,0,0,2,2));
	}
	
	static boolean findMaze(int [][]maze,
				int x,int y,int endx,int endy)
	{
		int m = maze.length;
		int n = maze[0].length;
		boolean[][] visited = new boolean[m][n];
		return dfs(maze,x,y,endx,endy,visited);
	}
	static boolean dfs(int [][]maze,int x,int y,
			int goalx, int goaly,boolean [][] visited)
	{
		if(x<0 || x>=maze.length || y<0 || y>=maze[0].length
				||maze[x][y]==1 ||visited[x][y])  
			return false;
		if(x==goalx && y == goaly)
			return true;
		visited[x][y] = true;
		if(dfs(maze,x-1,y,goalx,goaly,visited)||
			dfs(maze,x+1,y,goalx,goaly,visited)||
			dfs(maze,x,y-1,goalx,goaly,visited)||
			dfs(maze,x,y+1,goalx,goaly,visited)
				)
			return true;
		return false;
	}
	
	
}










