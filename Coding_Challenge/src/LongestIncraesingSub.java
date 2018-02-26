

public class LongestIncraesingSub {
	public static void main(String[] args) {
		int[] A = { 3,2,1 };
		LongestIncraesingSub i = new LongestIncraesingSub();
		i.findSubsequence(A);
	}

	public void findSubsequence(int[] arrA) {
		int[] LIS = new int[arrA.length];
		for (int i = 0; i < arrA.length; i++) {
			int max = -1;
			for (int j = 0; j < i; j++) {
				if (arrA[i] > arrA[j]) {
					if (max == -1 || max < LIS[j] + 1) {
						max = 1 + LIS[j];
					}
				}
			}
			if (max == -1) {
				// means none of the previous element has smaller than arrA[i]
				max = 1;
			}
			LIS[i] = max;
		}
		// find the max in the LIS[]
		int result = -1;
		int index = -1;
		for (int i = 0; i < LIS.length; i++) {
			if (result < LIS[i]) {
				result = LIS[i];
				index = i;
			}
		}
		
		String path =  arrA[index] + " ";
		int res = result-1;
		for (int i = index-1; i >= 0; i--) {
			if(LIS[i]==res){
				path =  arrA[i] + " " + path;
				res--;
			}			
		}
		System.out.println("Longest Increasing subsequence: " + result);
		System.out.println("Actual Elements: " + path);		
	}

	

}