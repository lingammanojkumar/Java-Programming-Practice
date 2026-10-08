package datastructures;
class Stack{
	int size=5;
	int stack[]=new int[size];
	int top=-1;
	void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("Stack is Overflow");
		}else {
			top++;
			stack[top]=data;
		}
	}
	int pop() {
		if(top==-1) {
			System.out.println("Stack is empty cannot delete");
			return -1;
		}else {
			int a=stack[top];
			top--;
			return a;
		}
	}
	int peek() {
		if(top==-1) return -1;
		else
			return stack[top];
			
	}
	boolean isEmpty() {
		return top==-1;
	}
	boolean isFull() {
		return top==size-1;
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is underflow");
		}else {
			for(int i=top;i>=0;i--) {
				System.out.print(stack[i]+" ");
			}
			System.out.println();
		}
	}
}
public class StackImplementationUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Stack ob=new Stack();
    ob.push(10);
    ob.push(20);
    ob.push(30);
    ob.display();
    System.out.println("Deleted element is: "+ob.pop());
    ob.display();
    System.out.println("Peek element is: "+ob.peek());
   System.out.println(ob.isEmpty());
   System.out.println(ob.isFull());
	}

}
/*
30 20 10 
Deleted element is: 30
20 10 
Peek element is: 20
false
false
*/