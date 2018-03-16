package Arrays;

public class Ninjas {
int[][] board;
int K,D;
int rescount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Ninjas(int m,int n, int K, int D){
		board=new int[m][n];
		this.K=K;
		this.D=D;
		
	}
	public boolean Moves(int row,int col)
	{
		if(row<0 || col<0 || row>=board.length || col>=board[0].length)
			return false;
			return true;
	}
	public boolean Probe(int row,int col)
	{
		if(Moves(row,col)) 
		{
			if(board[row][col]==1)
				return true;
		}
		return false;
	}
	public int ResourcesLeft()
	{
		return K-rescount;
	}
	public int ResMinDist()
	{
		return D;
	}
	public void 

}
