import java.util.Iterator;
import java.util.LinkedList;

public class Read_data_iterator {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.add(10);
        a.add("kanha");
        a.add(10.33);
        Iterator itr = a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
