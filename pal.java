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

public class pal {
    public static void main(java.lang.String[] args) {
        Stack s = new Stack();

        java.lang.String str = "MADAM";
        java.lang.String rev = "";

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        while (!s.isEmpty()) {
            rev = rev + s.pop();
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}