class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;
    int count = 0;

    // Q1: Push operation
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        count++;

        System.out.println(data + " inserted");
    }

    // Q2: Pop operation
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int data = top.data;
        top = top.next;
        count--;

        System.out.println(data + " removed");
        return data;
    }

    // Q3: Peek operation
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // Q4: Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Q5: Find size of stack
    int size() {
        return count;
    }

    // Q6: Display stack elements
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class main {
    public static void main(String[] args) {

        Stack s = new Stack();

        // Q1: Push
        s.push(10);
        s.push(20);
        s.push(30);

        // Q6: Display
        System.out.println("Stack:");
        s.display();

        // Q3: Peek
        System.out.println("Top element: " + s.peek());

        // Q2: Pop
        s.pop();

        System.out.println("After pop:");
        s.display();

        // Q5: Size
        System.out.println("Size: " + s.size());

        // Q4: IsEmpty
        System.out.println("Is empty: " + s.isEmpty());

        // Remove remaining elements
        s.pop();
        s.pop();

        System.out.println("Is empty: " + s.isEmpty());

        // Underflow test
        s.pop();
    }
}
