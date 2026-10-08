package datastructures;
class NodeLL{
	int data;
	NodeLL next;
	NodeLL(int data){
		this.data=data;
		this.next=null;
	}
}
class QueueLinkedList{
	NodeLL front=null,rear=null;
	void enqueue(int data)
	{
		NodeLL newNode=new NodeLL(data);
		if(front==null) {
			front=rear=newNode;
		}else {
			rear.next=newNode;
			rear=newNode;
		}
	}
	void dequeue() {
		if(front==null) {
			System.out.println("Queue is underflow or empty");
		}else if(front==rear){
			front=rear=null;
		}else {
			front=front.next;
		}
	}
	int peek() {
		if(front==null) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			return front.data;
		}
	}
	boolean isEmpty() {
		return front==null;
	}
	void display() {
		if(front==null) {
			System.out.println("Queue is Empty");
		}else {
			NodeLL temp=front;
			while(temp!=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("NULL");
		}
	}
}
public class QueueImplementationUsingLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   QueueLinkedList q=new QueueLinkedList();
   q.enqueue(10);
   q.enqueue(20);
   q.enqueue(30);
   q.enqueue(40);
   q.display();
   System.out.println("Peek element: "+q.peek());
   System.out.println(q.isEmpty());
	}

}
