import java.util.PriorityQueue;

public class PriorityQueue_poll_Method {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(10);
        q.add(45);
        q.add(100);
        q.add(20);
        // poll() gives the first priortiy data, then it goes to next and so on so fourth..
        System.out.println(q.poll());
        System.out.println(q.poll());  // output - 10
                                       //          20
    }
}
