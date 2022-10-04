import java.util.ArrayList;

public class ArrayList_homogenous_data {
    public static void main(String[] args) {
      ArrayList<Integer> a = new ArrayList<Integer>();
      a.add(10);
      a.add(15);
      a.add(1564);
      a.add(4);
      a.add(10);
      // you can avoid hetrogenous array by explicily write
        // homogrous data by assaging Integer class(Wrapper class)...
      System.out.println(a);
    }
}
