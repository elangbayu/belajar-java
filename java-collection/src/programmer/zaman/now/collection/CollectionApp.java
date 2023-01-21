package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Elang");
        collection.add("Bayu");
        collection.add("Segara");
        collection.addAll(List.of("Wiwit", "Widowati"));

        for(var value : collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");
        collection.remove("Elang");
        collection.removeAll(List.of("Bayu", "Widowati"));
        for(var value : collection){
            System.out.println(value);
        }

        System.out.println(collection.contains("Segara"));
        System.out.println(collection.containsAll(List.of("Segara", "Wiwit")));
        System.out.println(collection.size());
    }
}
