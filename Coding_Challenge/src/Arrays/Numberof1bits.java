// >> is arithmetic shift right(the sign bit is extended to preserve the signedness of the number.), >>> is logical shift right.
package Arrays;

public class Numberof1bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberof1bits n=new Numberof1bits();
		n.hammingWeight(11);
	}
	 public int hammingWeight(int n) {
		 int count=0;
		while(n!=0) {
		count+=(n&1);
		 n=n>>>1;
		}
	        return count;
	    }

}
