package Strings;

public class Compressions {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compressions c=new Compressions();
		int g=2;
		char ch=(char)(g+'0');
		//System.out.print(ch);
		char[] chars= {'a','a','a','a','a','a','a','a','a','a','a'};
		System.out.print(c.compress(chars));

	}
	public int compress(char[] chars) {
		if(chars==null || chars.length==0) return 0;
		int iter=1,count=1;

		for(int i=1;i<chars.length;i++)
		{
			if(chars[i]!=chars[i-1])
			{	if(count!=1) 
				{ 
				char[] temp=String.valueOf(count).toCharArray();	
			    for(char c:temp)
				chars[iter++]=c;
				count=1;
				}
             chars[iter++]=chars[i];
			}
			else count++;
		}	
		if(count!=1) 
		{ 
		char[] temp=String.valueOf(count).toCharArray();
		
	for(char c:temp)
		chars[iter++]=c;
		}
		return iter;	
		}
        
    

}
