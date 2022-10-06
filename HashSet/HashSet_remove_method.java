import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_remove_method {
    public static void main(String[] args) {
        HashSet a = new HashSet();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        // it removes the data present inside the collction..
        a.remove("kanha");
        System.out.println(a);
    }
}
