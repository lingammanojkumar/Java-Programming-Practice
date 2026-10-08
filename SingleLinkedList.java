package LinkedList;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}
public class SingleLinkedList {
     Node head=null,tail=null;
     int size=0;
     //insert at end
     void insertAtEnd(int data) {
    	Node newNode=new Node(data);
    	if(head==null) {
    		head=tail=newNode;
    	}else {
    		tail.next=newNode;
    	}
    	size++;
     }
     void insertAtBegin(int data) {
    	 Node newNode=new Node(data);
    	 if(head==null)
    	 {
    		 head=tail=newNode;
    	 }else {
    		 newNode.next=head;
    		 head=newNode;
    	 }
    	 size++;
     }
     void insertAtPosition(int data,int position)
     {
    	 if(position>size)
    	 {
    		 System.out.println("Invalid position");
    	 }else if(position==0) {
    		 insertAtBegin(data);
    	 }else if(position==size) {
    		 insertAtEnd(data);
    	 }else {
    		 Node temp=head;
    		 for(int i=1;i<position;i++) temp=temp.next;
    		 Node newNode=new Node(data);
    		 newNode.next=temp.next;
    		 temp.next=newNode;
    		 size++;
    	 }
     }
     
     void deleteAtBegin()
     {
    	 if(head==null)
    	 {
    		 System.out.println("List is empty cannot delete");
    	 }
    	 head=head.next;
     }
     void deleteAtEnd() {
    	 if(head==null)
    	 {
    		 System.out.println("List is empty cannot delete at end");
    		 return;
    	 }
    	 //Only one node to delete
    	 if(head.next==null) {
    		 head=null;
    		 return;
    	 }
    	 //More than one node to delete
    	 Node temp=head;
    	 if(temp.next.next!=null) {
    		 temp=temp.next;
    	 }
    	 temp.next=null;
    	 }
     void deleteAtPosition(int pos)
     {
    	 if(pos>=size) {
    		 System.out.println("Invalid Position");
    	 }else if(pos==size-1) {
    		 deleteAtEnd();
    	 }else if(pos==0)
    	 {
    		 deleteAtBegin();
    	 } else {
    		 Node temp=head;
    		 for(int i=1;i<pos;i++) temp=temp.next;
    		 temp.next=temp.next.next;
    		 size--;
    	 }
     }
     void search(int key) {
    	Node temp=head;
    	boolean found =true;
    	while(temp!=null) {
    		if(key==temp.data)
    		{
    			System.out.println("Key is found");
    			break;
    		}
    		temp=temp.next;//to stop from going infinite loop
    	}
    	if(!found) {
    		System.out.println("Key is not found");
    	}
    	 
     }
     void display()
     {
    	 if(head==null)
    	 {
    		 System.out.println("List is empty");
    	 }else {
    		 Node temp=head;
    		 while(temp!=null) {
    			 System.out.print(temp.data+" -> ");
    			 temp=temp.next;
    		 }
    		 System.out.println( "NULL");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SingleLinkedList sll=new SingleLinkedList();
     sll.insertAtEnd(10);
     sll.insertAtEnd(20);
     sll.insertAtBegin(30);
     sll.insertAtPosition(40, 0);
     
     sll.display();
     sll.deleteAtBegin();
     sll.display();
     sll.deleteAtEnd();
     sll.display();
     sll.deleteAtPosition(0);
     sll.display();
     sll.search(15);
     System.out.println("Size="+sll.size);
	}

}
