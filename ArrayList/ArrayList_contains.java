import java.util.ArrayList;

public class ArrayList_contains {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        System.out.println(a.contains(11));
    }
}
