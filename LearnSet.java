import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {        //  Set stores unique value...no repeating elements

    public static void main(String[] args) {
        // Set <Integer> set = new HashSet<>();
        // Set <Integer> set = new LinkedHashSet<>();

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(50);
        set.add(25);
        set.add(15);
        System.out.println(set);

        set.remove(25);
        System.out.println(set);

        System.out.println(set.contains(50));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }

}
