import java.util.ArrayList;

public class ArrayList_removeAll_method {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        // removeAll() will remove the data
        // but not removed the memory location that's the only difference
        // between clear() and removeALL()...
        a.removeAll(a);
        System.out.println(a);
    }
}
