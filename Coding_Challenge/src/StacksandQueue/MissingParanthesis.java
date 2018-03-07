package StacksandQueue;

import java.util.Stack;

public class MissingParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingParanthesis m=new MissingParanthesis();
		String str="()()))((";
		m.checkingParanthesis(str);

	}
	public void checkingParanthesis(String str)
	{
		if(str==null ||  str.length()==0) return;
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
				st.push('(');
			else if(str.charAt(i)==')')
				{
				if(st.isEmpty()) System.out.print('(');
				else st.pop();
				}
			
		}
		while(!st.isEmpty())
		{
			st.pop();
			System.out.print(')');
		}
			
		
	}

}
