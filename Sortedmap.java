import java.util.SortedMap;
import java.util.TreeMap;
public class Sortedmap {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm = new TreeMap<>();
        sm.put(3, "C");
        sm.put(1, "A");
        sm.put(2, "B");
        System.out.println("After Insertion: " + sm);
        sm.remove(2);
        System.out.println("After Deletion: " + sm);
        sm.put(1, "Updated");
        System.out.println("After Update: " + sm);
    }
}