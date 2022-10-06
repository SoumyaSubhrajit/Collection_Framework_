import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Sorting_LinkedList {
    public static void main(String[] args) {
        LinkedList a  = new LinkedList();
        a.add(10);
        a.add(5);
        a.add(1090);
        Collections.sort(a);
        System.out.println(a);
    }
}
