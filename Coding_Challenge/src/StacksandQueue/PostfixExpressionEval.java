package StacksandQueue;

import java.util.Stack;

public class PostfixExpressionEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostfixExpressionEval p=new PostfixExpressionEval();
		String[] tokens= {"18","1","+"};
		int res=p.evalRPN1(tokens);
		System.out.print(res);
	}
	
	public int evalRPN1(String[] tokens) {
	Stack<Integer> st=new Stack<Integer>();
	int a,b;
	for(String s:tokens)
	{
		if(s.equals("+"))
		{
			
			st.push(st.pop()+st.pop());
		}
		else if(s.equals("-"))
		{a=st.pop();b=st.pop();
		st.push(b-a);
			
		}
		else if(s.equals("*"))
		{
			st.push(st.pop()*st.pop());
		}
		else if(s.equals("/"))
		{
			a=st.pop();b=st.pop();
			st.push(b/a);
		}
		else
		{
			
			st.push(Integer.parseInt(s));
		}
		
	}
	return st.pop();
	}
		

}
