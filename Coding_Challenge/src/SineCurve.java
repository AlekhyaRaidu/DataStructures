
public class SineCurve {

	
	public int increase=1;
	int val;
	int next;
	public  SineCurve(int val)
	{
		this.val=val;
		next=getNext(val);
	}
	public int getNext(int val)
	{
		increasing(val);
		if(increase==1) return val+1;
		else return val-1;
	}
	public void increasing(int val)
	{
		if(val==127) increase=0;
		if(val==-127) increase=1;
	}
	public static void main(int[] args)
	{
		SineCurve s=new SineCurve(1);
		s.getNext(2);
		
		
	}

}
