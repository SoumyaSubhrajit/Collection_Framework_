import java.util.PriorityQueue;

public class PriorityQueue_using_veroius_Methods {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(10);
        q.add(45);
        q.add(100);
        q.add(20);
        System.out.println(q.contains(100));
        System.out.println(q.size());
        //System.out.println(q.removeAll(q));
         q.removeAll(q);
        System.out.println(q);
    }
}
