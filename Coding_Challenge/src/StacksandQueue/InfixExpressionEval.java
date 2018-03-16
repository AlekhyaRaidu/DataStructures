package StacksandQueue;

import java.util.Stack;

public class InfixExpressionEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="((2+1-1)+5)";
		InfixExpressionEval i=new InfixExpressionEval();
		System.out.print(i.infixEvaluation(s));
		

	}
	public int infixEvaluation(String expres)
	{
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<expres.length();i++)
		{
			if(expres.charAt(i)==')')
			{
				int op1=st.pop()-'0';
				char opr=st.pop();
				int op2=st.pop()-'0';
				int res = 0;
				while(true)
				{	System.out.println(op1+" "+opr+" "+op2);
					
					if(opr== '+')  res=op1+op2;
					else if(opr== '-') res=op2-op1; 
					else if(opr== '/') res=op2/op1;
					else  res=op2*op1;
					
					if(st.peek()=='(') {st.pop(); st.push((char)(res+'0')); break;}
					System.out.println(res);
					op1=res; opr=st.pop(); op2=st.pop()-'0';
				}
			}
			else st.push(expres.charAt(i));
		}
		return st.pop()-'0';
		}
	
	}


