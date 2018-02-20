import java.util.ArrayList;
import java.util.List;

public class CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountandSay c=new CountandSay();
		System.out.print(c.countAndSay(4));
	}
    public String countAndSay(int n) {
    	if(n<=0) return "";
    	String res="1";
    	int i=1;
    	if(n==1) return res;
    	while(i<n)
    	{
    		System.out.println(res);
    		res=scanning(res);
    		i++;
    		System.out.println(res+" "+i+" "+n);
    	}
    	return res;
    }
    public String scanning(String str)
    {
    	//if(str.length()==1) return str;
    	System.out.println("scan"+str);
    	StringBuilder sb=new StringBuilder();
    	int count=1,i=1;
    	while(i<str.length())
    	{
    		if(str.charAt(i)!=str.charAt(i-1))
    		{
    			sb.append(count);
    	    	sb.append(str.charAt(i-1));
    	    	count=1;
    		}
    		else count++;
    		i++;
    		
    	}
    	sb.append(count);
    	sb.append(str.charAt(i-1));
    	System.out.println("strngbuilder"+sb);
    	return sb.toString();
    	
    }

}
