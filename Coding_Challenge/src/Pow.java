// (x, x^2, x^4, x^8, etc)- log n TC
public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow p=new Pow();
		System.out.print(p.myPow(2, -2));

	}
	 public double myPow(double x, int n) {
		 if(n==0) return 1;
		 if(n==Integer.MIN_VALUE) {
			 n=n/2;
			 x=x*x;
		 }
		 else if(n<0) {n=-n;
		 x=1/x;}
		 return (n%2==0)? myPow(x*x,n/2): x*myPow(x*x,n/2);
	        
	    }

}
