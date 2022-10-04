import java.util.ArrayList;

public class ArrayList_containsAll_method {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        ArrayList b = new ArrayList();
        b.add(10);
        b.add("kanha");
        b.add(10.3666);
        // it compare two collection if all data present inside another
        // collection it will return true otherwise it will return false..
        System.out.println(a.containsAll(b));
    }
}
