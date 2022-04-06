package valdes.inc.com.company;

import java.util.Stack;

public class QueueWithTwoStacks<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void enQueue(T item) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(item);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public T deQueue() {
        if (stack1.isEmpty()) {
            System.out.println("Пустая очередь");
            System.exit(0);
        }

        T item = stack1.peek();
        stack1.pop();
        return item;
    }
}