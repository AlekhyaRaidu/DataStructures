// while working with dictnry word problems or array problms, check for repatation
// make sure index[ro][col] are correclty placed instead of index[0][0]
package Graphs;
import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordSearchII w=new WordSearchII();
		char [][] board= {
				{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
		String[] words= {"eat","rain","oath","oao","tae"};
		
		 List<String> list=new ArrayList<String>(); 
		 list=w.findWords(board, words);
		
		 System.out.print(list);
		           
	}
	 public List<String> findWords(char[][] board, String[] words) {
		
	     List<String> list=new ArrayList<String>();   
	     if(board==null || board.length==0 || words==null || words.length==0) return list;
		 for(int i=0;i<words.length;i++)
	        {
	        	if(((list.isEmpty() || (!list.isEmpty() && !list.contains(words[i]))) && checikngWord(words[i],board)))
	        		{
	        		list.add(words[i]);	 
	        		 System.out.println("resulted list"+list);
	        		 
	        		}
	        }
		 return list;
	    }
	 public boolean checikngWord(String word,char[][] board)
	 {
		 System.out.println(word);
		 boolean [][] visited=new boolean[board.length][board[0].length];
		 for(int i=0; i<board.length;i++)
		 {
			 for(int j=0;j<board[0].length;j++)
			 {
				 if(board[i][j]==word.charAt(0) && dfsWord(0,word,board,i,j))
						 	return true;
			 }
		 }
		 return false;
	 }
	 public boolean dfsWord(int index,String word,char[][] board,int row,int col)
	 {
		System.out.println(word+" "+index+" "+row+" "+col);
		if( index>= word.length() ) return true; // catchy point
		if(   row<0 || row>=board.length || col<0 || col>=board[0].length || word.charAt(index)!=board[row][col] ) return false;
		boolean res=false;
		board[row][col]^=256;
		if( dfsWord( index+1,word,board,row+1,col)|| dfsWord( index+1,word,board,row,col+1)	|| dfsWord( index+1,word,board,row,col-1)|| dfsWord( index+1,word,board,row-1,col)) 
				{  res=true; }
		board[row][col]^=256;
		return res;
	 }

}
