package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Elang", "Bayu", "Segara"));
        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> bayu = names.tailSet("Bayu", true);
        for (var name : bayu) {
            System.out.println(name);
        }
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Elang");
    }
}
