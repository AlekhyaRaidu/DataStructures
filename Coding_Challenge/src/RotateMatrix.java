
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateMatrix r=new RotateMatrix();
		
		int[][] matrix= {{1,2,3},{4,5,6}};
		matrix=r.rotate(matrix);
		System.out.print(matrix[0][0]);
		System.out.print(matrix[0][1]);
		System.out.print(matrix[0][2]);
		
		System.out.print(matrix[1][0]);
		System.out.print(matrix[1][1]);
		System.out.print(matrix[1][2]);
		
		
		//System.out.print(matrix[0][3]);

	}
	//static int[][] matrix
	 public int[][] rotate(int[][] matrix) {
	        int level=0,len=matrix.length;
	        int last=matrix[0].length-1;
	        while(level<len/2)
	        {
	        	System.out.print(level+ " "+last+"first");
	        	for(int i=level;i<last;i++)
	        	{
	        		swap(level,i,i,last,matrix);
	        		swap(level,i,last,last-i+level,matrix);
	        		swap(level,i,last-i+level,level,matrix);
	        		
	        	}
	        	level++;
	        	last--;
	        }
	        return matrix;
	    }
	public void swap(int i, int j,int l,int m,int[][] matrix)
	{
		System.out.println(i+""+j+" "+l+""+m);
		int temp=matrix[i][j];
		matrix[i][j]=matrix[l][m];
		matrix[l][m]=temp;
		System.out.println("bye");
		return;
	}
	 

}
