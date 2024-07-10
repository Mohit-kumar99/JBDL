package Assignment_2;

import java.util.Stack;
//Create a queue using stack, without any collection

public class QueueUsingStack {

    private final Stack<Integer> input;
    private final Stack<Integer> output;

    public QueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }
    public int pop() {
        peek();
        return output.pop();
    }
    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }
    public boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());   // returns 1
        System.out.println(queue.empty()); // returns false
    }
}
