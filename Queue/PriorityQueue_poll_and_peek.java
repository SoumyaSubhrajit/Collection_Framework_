import java.util.PriorityQueue;

public class PriorityQueue_poll_and_peek {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(10);
        q.add(45);
        q.add(100);
        q.add(20);
        // because of poll it will goes to the next element ...
        // if u don't gave peek it will have the same element read every time..
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
    }
}
