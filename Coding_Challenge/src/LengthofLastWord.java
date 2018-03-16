// s.trim()->leading and trailing white spaces will be omitted
//s.split()->splits arr into string arr on delimeter
// lastIndexOf returns the last occurrence of character ch in the particular String. and returns -1 if not found
public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthofLastWord l=new LengthofLastWord();
		l.lengthOfLastWord("hey world");
		//System.out.print("hey");

	}
	 public int lengthOfLastWord(String s) {
	      //  String[] arr=s.split(" ");
	       System.out.print( s.trim().length()-(s.trim().lastIndexOf(' ')+1));
	       return 0;
	    }
}
