package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Elang");
        Set<String> mutable = new HashSet<>();
        mutable.add("Elang");
        mutable.add("Bayu");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        Set<String> set = Set.of("Elang", "Segara");
//        set.remove("Elang"); // ERROR
//        set.add("Bayu"); // ERROR
    }
}
