package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsHappy i=new IsHappy();
		System.out.print(i.isHappy(7));

	}

	public boolean isHappy(int n) {
		Set<Integer> set=new HashSet<Integer>();
		int sum=0;
		while(set.add(n))
		{
			sum=0;
			while(n>0)
			{
				int rem=n%10;
				sum+=rem*rem;
				n=n/10;
			}
			if(sum==1) return true;
			n=sum;
		}
		return false;
    }

}
