package datastructures;
class Queue{
	int size=10;
	int queue[]=new int[size];
	int front=-1,rear=-1;
	void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("Queue is overflow");
		}else if(front==-1)
		{
			front=rear=0;//Both pointers meet at when queue is empty
			queue[rear]=data;
		}else {
			queue[++rear]=data;
		}
	}
	void dequeue() {
		if(front==-1) {
			System.out.println("Queue is empty cannot delete");
		}else if(front==rear) {  //TO delete when a queue has single element
			front=rear=-1;
		}else {  //When queue has more than one element
			front++;
		}
		System.out.println();
	}
	int peek()
	{
		if(front==-1) return -1;
		else return queue[front];
	}
	boolean isEmpty() {
		return front==-1;
	}
	boolean isFull() {
		return rear==size-1;
	}
	void display()
	{
		if(front==-1) {
			System.out.println("Queue is empty or underflow");
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.print(queue[i]+" ");
			}
		}
	}
}
public class QueueImplementationUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue q=new Queue();
   q.enqueue(10);
   q.enqueue(20);
   q.enqueue(30);
   q.enqueue(40);
   q.enqueue(50);
   q.display();
   q.dequeue();
   q.display();
   System.out.println("Peek element: "+q.peek());
   System.out.println(q.isEmpty());
   System.out.println(q.isFull());
	}

}
