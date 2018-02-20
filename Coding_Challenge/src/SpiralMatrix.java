import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
 public List<Integer> spiralOrder(int[][] matrix) {
		 
		 List<Integer> list=new ArrayList<Integer>();
		 
		 if(matrix==null || matrix.length==0) return list;
		 int str=0,stc=0,er=matrix.length-1,ec=matrix[0].length-1;
		 while(str<=er && stc<=ec)
		 {
			 for(int i=stc;i<=ec;i++)
				 list.add(matrix[str][i]);
			 str++;
			 for(int i=str;i<=er;i++)
				 list.add(matrix[i][ec]);
			 ec--;
			 if(str<=er)
			 for(int i=ec;i>=stc;i--)
				 list.add(matrix[er][i]);
			 er--;
			 if(stc<=ec)
			 for(int i=er;i>=str;i--)
				 list.add(matrix[i][stc]);
					 stc++;
		 }
		 return list;
	        
	    }
	

}
