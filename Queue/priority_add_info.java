import java.util.PriorityQueue;

public class priority_add_info{
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(10);
        q.add("");
        q.add('@');
        q.add("kanha");
        q.add("Soumya");
        // we can't add hetrogemous data in queue..
        System.out.println(q);
    }
}
