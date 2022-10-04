import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_sorting {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(85);
        a.add(75);
        a.add(68);
        a.add(4);
        a.add(57);
        // colections in java is class that's helps us to
        // perform sorting,serching etc..
        // sort() used to sort the homogenous datatype...
        Collections.sort(a);
        System.out.println(a);
    }
}
