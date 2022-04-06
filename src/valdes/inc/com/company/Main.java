package valdes.inc.com.company;

public class Main {

    public static void main(String[] args) {
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enQueue(67);
        queue.enQueue(89);
        queue.enQueue(110);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
