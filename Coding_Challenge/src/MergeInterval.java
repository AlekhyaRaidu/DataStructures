import java.util.List;

class Interval {
     int start;
      int end;
      Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }
public class MergeInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Interval> merge(List<Interval> intervals) {
		   if(intervals.size()==0 || intervals==null) return intervals;
intervals.sort((Interval o1,Interval o2)->o1.start-o2.start);
for(int i=1;i<intervals.size();i++)
{
	   if(intervals.get(i-1).end>=intervals.get(i).start)
	   {
		 // new Interval(intervals.get(i-1).start,Math.max(intervals.get(i).end,intervals.get(i-1).end));
		    intervals.set(i-1, new Interval(intervals.get(i-1).start,Math.max(intervals.get(i).end,intervals.get(i-1).end)));
		  intervals.remove(i); 
		  i--;
		   
	   }
	   
}
return intervals;
}

}
