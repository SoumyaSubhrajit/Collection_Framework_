import java.util.PriorityQueue;

public class PriorityQueue_peek_Method {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(10);
        q.add(45);
        q.add(100);
        q.add(20);
        // peek() method will return the first element & does't goes to the next elemnt..
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek()); //output - 10 10 10 evey time..

    }
}
