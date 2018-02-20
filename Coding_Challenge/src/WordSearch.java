
public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordSearch w=new WordSearch();
		char[][] board= {};
		System.out.print(w.exist(board, "ABC"));

	}
    boolean res=false;
  public boolean exist(char[][] board, String word) {
	if(board.length==0 || board==null | word.length()==0 || word==null) return true;
	
	boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
        	for(int j=0;j<board[0].length;j++)
        	{
        		if(board[i][j]==word.charAt(0) && exist(board,word,i,j,0,visited))
        		return true;
        	}
        }
        return res;
    }

public boolean exist(char[][] board, String word,int i,int j,int index,boolean[][] visited) {
	if(index==word.length()) return true;
	if(i>=board.length || j>=board[0].length || i<0 || j<0 || board[i][j] != word.charAt(index) || visited[i][j]) return false;
   
    	visited[i][j]=true;
    	if( exist(board,word,i+1,j,index+1,visited) || exist(board,word,i-1,j,index+1,visited) || exist(board,word,i,j+1,index+1,visited) || exist(board,word,i,j-1,index+1,visited))
    	return true;
    
    visited[i][j]=false;
   return false;
}
}
