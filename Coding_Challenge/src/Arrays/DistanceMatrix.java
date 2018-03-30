// Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.

package Arrays;

public class DistanceMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] updateMatrix(int[][] matrix) {
		if(matrix==null) return null;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j]==1)
					matrix[i][j]=mindist(matrix,i,j,0);
			}
		}
		return matrix;
        
    }
	public int mindist(int[][] matrix,int row,int col,int count)
	{
		if(row<0 || col<0 || row>matrix.length-1 || col>matrix[0].length-1 || matrix[row][col]<0) return Integer.MAX_VALUE;
		if(matrix[row][col]==0) return count;
		
		matrix[row][col]=-matrix[row][col];
		int min= Math.min(mindist(matrix,row+1,col,count+1), mindist(matrix,row-1,col,count+1));
		min=Math.min(min, mindist(matrix,row,col+1,count+1));
		min=Math.min(min, mindist(matrix,row,col-1,count+1));
		
		matrix[row][col]=-matrix[row][col];
		return min;
	}

}
