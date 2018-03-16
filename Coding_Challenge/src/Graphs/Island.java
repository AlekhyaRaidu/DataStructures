package Graphs;

public class Island {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Island i=new Island();
		char[][] grid= {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}};
		int res=i.numIslands(grid);
		System.out.print(res);
	}
boolean[][] gridvisited;
public int numIslands(char[][] grid) {
	if(grid==null || grid.length==0 ) return 0;
        int count=0;
        gridvisited=new boolean[grid.length][grid[0].length];
		for(int i=0;i<grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++)
			{
				
				if(grid[i][j]=='1') {
					makingneighVisited(i, j, grid);
					count++;
				}
				
			}
			
		}
	return count;
    }
public void makingneighVisited(int row,int col,char[][] grid)
{
	if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]=='0') return;
	grid[row][col]='0';
	makingneighVisited(row+1, col, grid);
	makingneighVisited(row, col+1, grid);
	makingneighVisited(row, col-1, grid);
	makingneighVisited(row-1, col, grid);

	return;
}

}
