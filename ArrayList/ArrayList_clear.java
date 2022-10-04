import java.util.ArrayList;

public class ArrayList_clear {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        a.add("abc");
        // clear() will not only remove the data but also it will
        // removed the memory location also..
        a.clear();
        System.out.println(a);
    }
}
