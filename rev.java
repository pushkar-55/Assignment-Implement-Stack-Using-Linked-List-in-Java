class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top;

    void push(char ch) {
        Node newNode = new Node(ch);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        char ch = top.data;
        top = top.next;
        return ch;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class rev {
    public static void main(java.lang.String[] args) {
        Stack s = new Stack();
        java.lang.String str = "HELLO";

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        System.out.print("Reversed string: ");

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
}