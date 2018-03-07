import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Interval1 {
     int start;
      int end;
      Interval1() { start = 0; end = 0; }
      Interval1(int s, int e) { start = s; end = e; }
}
public class NonOverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonOverlappingIntervals n=new NonOverlappingIntervals();
		Interval1 n1=new Interval1(1,2);
		Interval1 n2=new Interval1(2,3);
		Interval1 n3=new Interval1(3,4);
		Interval1 n4=new Interval1(1,3);
		Interval1[] intervals= {n1,n2,n3,n4};
		int res=n.eraseOverlapIntervals(intervals);
		System.out.print(res);
		
		
	}
	  public int eraseOverlapIntervals(Interval1[] intervals) {
		  if(intervals.length==0 || intervals==null) return 0;
		  Arrays.sort(intervals,new Comparator<Interval1>() {
			@Override
			public int compare(Interval1 arg0, Interval1 arg1) {
				// TODO Auto-generated method stub
				return arg0.end-arg1.end;
			}});
		  int count=1;
	      int  end=intervals[0].end;
		  for(int i=1;i<intervals.length;i++)
		  {
			  if(intervals[i].start>=end)
	          { end=intervals[i].end; count++;}
		  }
		  return intervals.length-count;
			 
		 
	    }
}
