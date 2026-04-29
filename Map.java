import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "John");
        m.put(2, "Sam");
        m.put(3, "David");
        System.out.println("After Insertion: " + m);
        m.remove(2);
        System.out.println("After Deletion: " + m);
        m.put(1, "Mike");
        System.out.println("After Update: " + m);
    }
}