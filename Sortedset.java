import java.util.SortedSet;
import java.util.TreeSet;
public class Sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> ss = new TreeSet<>();
        ss.add(30);
        ss.add(10);
        ss.add(20);
        System.out.println("After Insertion: " + ss);
        ss.remove(20);
        System.out.println("After Deletion: " + ss);
        ss.remove(10);
        ss.add(25);
        System.out.println("After Update: " + ss);
    }
}