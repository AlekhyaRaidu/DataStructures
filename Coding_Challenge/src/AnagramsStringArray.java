import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

class Word{
	String val;
	int index;
	public Word(String val,int index)
	{
		this.val=val;
		this.index=index;
	}
}
public class AnagramsStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.remove(1);
		AnagramsStringArray a=new AnagramsStringArray();
		Word w=new Word("bca",0);
		Word w1=new Word("abc",1);
		Word w2=new Word("abcd",2);
		Word[] words= {w,w1,w2};
		//Arrays.sort(words);
		Arrays.sort(words, new Comparator<Word>() {
		    public int compare(Word o1, Word o2) {
		        // Intentional: Reverse order for this demo
		        return o1.val.compareTo(o2.val);
		    }

		
		});
		System.out.print(words[0].val);
	}
	static class compStr implements Comparator<Word>
    {
        public int compare(Word a, Word b)
        {
            return a.val.compareTo(b.val);	
        }
    }
     
	public int[] printingAnagramsTogether(String[] word)
	{
		Word[] dupwords=new Word[word.length];
		for(int i=0;i<word.length;i++)
			{
			Word w=new Word(word[i],i);
			dupwords[i]=w;
			}
		for(int i=0;i<word.length;i++)
		{
			String s=dupwords[i].val;
			char[] charr=s.toCharArray();
			Arrays.sort(charr);
			s=String.valueOf(charr);
		}
		Arrays.sort(dupwords);
		for(int i=0;i<word.length;i++)
		{
			dupwords[i].val=word[dupwords[i].index];
		}
		return null;
		
	}

}
