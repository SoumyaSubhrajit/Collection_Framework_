import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_binary_search {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(4);
        a.add(10);
        a.add(57);
        a.add(68);
        a.add(75);
        a.add(85);
        int index = Collections.binarySearch(a,75);
        System.out.println(a.get(index));
    }
}
