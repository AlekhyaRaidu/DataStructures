package Stacks;

import java.util.Stack;

public class ReverseStack {
	public static void main(String[] args) {
		ReverseStack r=new ReverseStack();
		Stack<Integer> s=new Stack<Integer> ();
		s.push(3);
		s.push(8);
		s.push(9);
		s=r.reversingStack(s);
		while(!s.isEmpty())
			System.out.print(s.pop());
		
	
	}
	public Stack<Integer> reversingStack(Stack<Integer> st){
		
		Stack<Integer> tempst=new Stack<Integer>();
		int var=0,size=0;
		while(st.isEmpty())
		{
			var=st.pop();
			if(!tempst.isEmpty())
			{
				size=tempst.size();
				while(!tempst.isEmpty())
				{
					st.push(tempst.pop());
				}
				tempst.push(var);
				while(size>0)
				{
					tempst.push(st.pop());
					size--;
				}
			}
			else tempst.push(var);
			
		}
		while(!tempst.isEmpty())
			{
			System.out.print(st.push(tempst.pop()));
			}
		return st;
	}
}
