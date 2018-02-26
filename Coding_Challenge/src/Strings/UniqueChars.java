package Strings;

public class UniqueChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueChars u=new UniqueChars();
		String str="bcb";
		System.out.print(u.uniqueCharacters(str));
	}
	 boolean uniqueCharacters(String str)
	    {
	        // Assuming string can have characters a-z
	        // this has 32 bits set to 0
	        int checker = 0;
	 
	        for (int i=0; i<str.length(); i++)
	        {
	            int bitAtIndex = str.charAt(i)-'a';
	           
	            // if that bit is already set in checker,
	            // return false
	            System.out.print(i+" "+bitAtIndex+" "+(1<<bitAtIndex));
	            if ((checker & (1<<bitAtIndex)) > 0)
	                return false;
	           
	            // otherwise update and continue by
	            // setting that bit in the checker
	            checker = checker | (1<<bitAtIndex);
	            System.out.println(" "+checker);
	        }
	 
	        // no duplicates encountered, return true
	        return true;
	    }

}
