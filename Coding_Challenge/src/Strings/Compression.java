package Strings;

public class Compression {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compression c=new Compression();
		char[] chars= {'a','a','b'};
		System.out.print(c.compress(chars));

	}
	public int compress(char[] chars) {
		if(chars==null || chars.length==0) return 0;
		int iter=1,count=1;
		for(int i=1;i<chars.length;i++)
		{
			if(chars[i]!=chars[i-1])
			{	chars[iter++]=(char)count;
				chars[iter++]=chars[i];
				count=1;
			}
			else count++;
			}	
		return iter;	
		}

        
    

}
