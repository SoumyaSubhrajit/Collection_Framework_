import java.util.ArrayList;

public class ArrayList_remove {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        // it removes the data present inside the collction..
        a.remove(3);
        System.out.println(a);
    }
}
