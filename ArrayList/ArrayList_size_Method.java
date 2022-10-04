import java.util.ArrayList;

public class ArrayList_size_Method {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        // size() method pass the relative size of the collection..
        System.out.println(a.size());
    }
}
