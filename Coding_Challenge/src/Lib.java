import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

// convert char[] ca to string: 
	// String str= String.valueOf(ca);
// cant sort string directly
// for assigning values to string builder
	// sb.setCharAt(index,character) -- index starts from 0
//  long dividend1=Math.abs((long)dividend);
	//where dividend is int
//substring function,index1 start from 0, index2 starts from 1
	// str.substring(index1,index2);
	// but str.substring(0,0) return 0;
	//String str="hello";
		//System.out.print(str.substring(str, "")); returns 0;
//string comparision
	// str1.equals(str2);
//priority queue
	// public ListNode mergeKLists(ListNode[] lists) {
	//	 PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
			// @Override
	       //     public int compare(ListNode o1,ListNode o2){
	         //      return o1.val-o2.val;
	         //   } 
		// });
//array sort comparator:
Arrays.sort(words, new Comparator<Word>() {
    public int compare(Word o1, Word o2) {
        // Intentional: Reverse order for this demo
        return o1.val.compareTo(o2.val);
    }
});
// to retrieve value from set
	//for(Character c:set)
//0r
// Iterator<String> it = hset.iterator();
//while(it.hasNext()){
  //  System.out.println(it.next());
//Iterate over map
//iterator()-> start of iteration.
//next() returns next elemnt
Map.entrySet() method returns a collection-view(Set<Map.Entry<K, V>>) of the mappings 
contained in this map. So we can iterate over key-value pair using getKey() and
getValue() methods of Map.Entry<K, V>

//str.lastIndexOf(ch) It returns the last occurrence of character ch in the particular String.

// to convert int to char
	// int j=9;
	// int i=(char)(j+'0');

//to convert integer to string
	//int j=12;
	// String.valueOf(j); --converts to string
	// String.valueOf(j).toCharArray(); -- converts to char array

//ASCII equivalents
//int  s= (int)('a');  ascii equivalent of character
//char  s= (char)(97);
// converting nnumber to char 
//int a = 1;
//char b = (char)(a + '0'); o/p: 1
/
// convert char array to string
// char[] word = s.toCharArray();
	// return new String(word);
//Integer.parseInt(String) wittl convert string to int.  "18" to 18.

//string split on multiple chars
//String s="a+b-c";
//String[] sarr=s.split("[+-]");
