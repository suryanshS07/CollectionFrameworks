import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        //Set<Integer> set = new HashSet<>();
        //Set<Integer> set = new TreeSet<>();
        set.add(232);
        set.add(21);
        set.add(12);
        set.add(54);
        set.add(43);
        System.out.println(set);
//       System.out.println(set.contains(100));
//      System.out.println(set.remove(232));
//        System.out.println(set);
//        set.add(21);
//        //It does not allow to add the duplicate elements in the set
//        System.out.println(set.size());

        }
    }
