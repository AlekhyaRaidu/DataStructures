
public class Countnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countnegative c=new Countnegative();
		int[][] matrix= {{-3,-2,-1,-1},{-2,2,3,4},{-1,5,7,8}};
		System.out.print(c.counting(matrix));

	}
	public int counting(int[][] matrix)
	{
		int count=0;
		int row=0,col=matrix[0].length-1;
		while(col>=0 && row<matrix.length)
		{
			if(matrix[row][col]<0)
				{count+=col+1; row++;}
			else
				col--;
		}
		return count;
	}

}
