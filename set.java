import java.util.HashSet;
import java.util.Set;
public class Set {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Apple");
        s.add("Banana");
        s.add("Mango");
        System.out.println("After Insertion: " + s);
        s.remove("Banana");
        System.out.println("After Deletion: " + s);
        s.remove("Apple");
        s.add("Orange");
        System.out.println("After Update: " + s);
    }
}