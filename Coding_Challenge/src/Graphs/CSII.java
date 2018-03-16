package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CSII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSII c=new CSII();
		int[][] pre= {{1,0}};
		int[] res=c.findOrder(2, pre);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]);

	}
	Map<Integer,List<Integer>> map=new HashMap<Integer,List<Integer>>();
	int[] indegree;
	  int[] res;
	  public int[] findOrder(int numCourses, int[][] prerequisites) 
	  {  res=new int[numCourses];
	  if(numCourses==0 || prerequisites.length==0) return res;
		  		  indegree=new int[numCourses];
			      constructGraph(numCourses,prerequisites)  ;
			  	System.out.print("po");
			      return solveByBFS(numCourses,prerequisites);
	   }
	  public void constructGraph(int numCourses, int[][] prerequisites)
	  {
		 
			  map=new HashMap<Integer,List<Integer>>();
			  
			  for(int i=0;i<prerequisites.length;i++)
			  {
				  if(!map.containsKey(prerequisites[i][1]))
				  {
					  map.put(prerequisites[i][1], new ArrayList<Integer>());
					 
				  }
				  map.get(prerequisites[i][1]).add(prerequisites[i][0]);
				  System.out.println(prerequisites[i][1]+" "+map.get(prerequisites[i][1]));
				  indegree[prerequisites[i][0]]+=1;
			  }
	  }
	  public int[] solveByBFS(int numCourses,int[][] prerequisites)
		  {
		  Set<Integer> set=new HashSet<Integer>();
			 
			  Queue<Integer> que=new LinkedList<Integer>();
			  int indx=0;
			  for(int i:indegree)
			  {
				  if(indegree[i]==0) { que.offer(i);
					System.out.println(i);
				  }
			  }
			  while(!que.isEmpty())
			  {
				  int elem=que.poll();
				  res[indx++]=elem;
				  if(map.get(elem)!=null) { List<Integer> list=map.get(elem);
				 System.out.println(elem+" "+list);
				  while(!list.isEmpty())
				  {
					  if(!set.contains( list.get(0)))
					  {
						  que.offer(list.get(0));
						  set.add(list.get(0));
					  }
					  list.remove(0);
					  System.out.println(" here is updated list"+list+" "+set);
				  }
				  }
				  System.out.println("queue size"+que.size());
			  }
			  return (indx == numCourses) ? res : new int[0];
		  
	  }
}
