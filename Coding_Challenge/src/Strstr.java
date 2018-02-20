
public class Strstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strstr s=new Strstr();
		String str="hello";
		System.out.print(str.substring(0, 0));
		System.out.print(s.strStr(str,"he"));
	}
	 public int strStr(String haystack, String needle) {
		 if(haystack==null || needle==null) return -1;
	        int len=haystack.length();
	        int len1=needle.length();
		 for(int i=0;i<=(len-len1);i++)
		 {	
			 System.out.println(i+" "+haystack.substring(i, i+len1));
			 if(haystack.substring(i, i+len1).equals(needle))
				 return i;
				 
		 }
		 return -1;
	    }

}
