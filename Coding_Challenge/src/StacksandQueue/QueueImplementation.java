package StacksandQueue;
class Queue{
	
}
public class QueueImplementation {
int[] queue;
int front=0, size=0,capacity, rear;
 QueueImplementation(int capacity){
	queue=new int[capacity];
	this.capacity=capacity;
	rear=capacity-1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementation q=new QueueImplementation(6);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue(); q.enqueue(8); q.enqueue(6); q.enqueue(10);
		
	}
	public void creatingnewarray()
	{
		int[] temp=queue;
		queue=new int[2*capacity];
		capacity=queue.length;
		rear=capacity-1;
		for(int i=front;i<temp.length;i++)
			{ enqueue(temp[i]); }
		for(int i=0;i<front;i++)
		{ enqueue(temp[i]); }
		return;

	}
	public void enqueue(int item)
	{
		if(capacity==size) { creatingnewarray();}
		rear=(rear+1)%capacity;
		queue[rear]=item;
		size++;
		System.out.println(rear+" "+item);
		return;
	}
	public void dequeue()
	{
		if(size==0) return;
		front=front%capacity;
		System.out.println(queue[front]);
		queue[front++]=0;
		size--;
		
	}

}
