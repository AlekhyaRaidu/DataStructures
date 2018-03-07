package StacksandQueue;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementation s=new StackImplementation(3);
		s.push(12); s.push(14); s.push(3); s.pop();s.push(8);
		
		
	}
	 
	int capacity; int[] stack;
	int rear=-1, size=0;
	StackImplementation(int capacity)
	{
		stack=new int[capacity];
		this.capacity=capacity;
	}
	public void push(int elem)
	{
		if(size==capacity) return;
		stack[++rear]=elem;
		System.out.println(rear+" "+elem);
		size++;
	}
	public void pop()
	{
		if(size==0) return;
		stack[rear]=0;
		rear--;
		size--;
	}
}
