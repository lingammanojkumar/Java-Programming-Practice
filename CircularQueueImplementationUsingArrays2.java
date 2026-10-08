package datastructures;
class Queue2{
	int size=10;
	int queue[]=new int[size];
	int front=-1,rear=-1;
	void enqueue(int data) {
		if(front==(rear+1)% size) {
			System.out.println("Queue is overflow");
		}else if(front==-1)
		{
			front=rear=0;//Both pointers meet at when queue is empty
			queue[rear]=data;
		}else {
			rear=(rear+1) % size;
			queue[rear]=data;
		}
	}
	void dequeue() {
		if(front==-1) {
			System.out.println("Queue is Underflow");
		}else if(front==rear) {  //TO delete when a queue has single element
			front=rear=-1;
		}else {  //When queue has more than one element
			front=(front+1)%size;
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
		return front==(rear+1)%size;
	}
	void display()
	{
		if(front==-1) {
			System.out.println("Queue is empty or underflow");
		}else {
			for(int i=front;;i=(i+1)%size) {
				System.out.print(queue[i]+" ");
				if(i==rear) break;
			}
		}
		System.out.println();
	}
}
public class CircularQueueImplementationUsingArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue2 q=new Queue2();
   q.enqueue(10);
   q.enqueue(20);
   q.enqueue(30);
   q.enqueue(40);
   q.enqueue(50);
 q.display();
 q.dequeue();
 q.dequeue();
 q.display();
 q.enqueue(60);
 q.enqueue(70);
 q.display();
	}

}
