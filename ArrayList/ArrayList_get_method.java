import java.util.ArrayList;

public class ArrayList_get_method {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("kanha");
        a.add(10.366);
        a.add(true);
        a.add('A');
        //get() method is used to retuen the data present inside
        //the perticular index..
        System.out.println(a.get(1));
        System.out.println(a.get(4));
    }
}
