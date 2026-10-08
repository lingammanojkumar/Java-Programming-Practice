package datastructures;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack2 {
    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int a = top.data;
            top = top.next;
            return a;
        }
    }

    int peek() {
        if (top == null) {
            return -1;
        } else {
            return top.data;
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class StackImplementationUsingLinkedList {

    public static void main(String[] args) {
        Stack2 st = new Stack2();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        
        st.display();
        System.out.println("Deleted Element: " + st.pop());
        st.display();
        System.out.println("Peek element: "+st.peek());
        st.display();
        System.out.println(st.isEmpty());
        
    }
}
/*50 40 30 20 10 
Deleted Element: 50
40 30 20 10 
Peek element: 40
40 30 20 10 
false
*/