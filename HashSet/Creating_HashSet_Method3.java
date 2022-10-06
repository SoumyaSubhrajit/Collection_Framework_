import java.util.HashSet;

public class Creating_HashSet_Method3 {
    public static void main(String[] args) {
        HashSet h  =new HashSet(30,0.95f);
        h.add(10);
        h.add(10.3);
        h.add(100);
        h.add(1010);
        System.out.println(h);
    }
}
