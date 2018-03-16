import java.util.ArrayList;
import java.util.List;

public class CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountandSay c=new CountandSay();
		c.countAndSay(4);
	}
    public String countAndSay(int n) {
    	if(n<=0) return "";
    	StringBuilder sb=new StringBuilder();
    	sb.append("1");
    	int i=1;
    	while(i<n)
    	{
    
    		sb=scanning(sb);
    		i++;
    		//System.out.println(sb+" "+i+" "+n);
    	}
    	return sb.toString();
    }
    public StringBuilder  scanning(StringBuilder sb)
    {
    	System.out.println(sb);
    	int count=1,i=1;
    StringBuilder sb1=new StringBuilder();
    	while(i<sb.length())
    	{
    		if(sb.charAt(i)!=sb.charAt(i-1))
    		{
    			sb1.append(count);
    			sb1.append(sb.charAt(i-1));
    	    	count=1;
    		}
    		else count++;
    		i++;
    		
    	}
    	sb1.append(count);
    	sb1.append(sb.charAt(i-1));
    	System.out.println("strngbuilder"+sb1);
    	return sb1;
    	
    }

}
