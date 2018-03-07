package DynamicProgramming;

public class LongestCommomSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestCommomSubSeq l=new LongestCommomSubSeq();
		String s1="bhgf"; String s2="fgacb";
		int res=l.longestComSubSeq(s1, s2);
		System.out.print(res);

	}


public int longestComSubSeq(String s1,String s2)
{
	int[][] dp=new int[s2.length()+1][s1.length()+1];
	System.out.print("row"+s2.length()+1+"col"+s1.length()+1);
	for(int row=1; row<dp.length;row++)
	{
		for(int col=1;col<dp[0].length;col++)
		{
			System.out.println(row+" "+col);
			if(s1.charAt(col-1)==s2.charAt(row-1))
				dp[row][col]=dp[row-1][col-1]+1;
			else
				dp[row][col]=Math.max(dp[row-1][col], dp[row][col-1]);
		}
	}
	return dp[s2.length()][s1.length()];
}
}