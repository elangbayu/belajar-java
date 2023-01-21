package programmer.zaman.now.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("Elang", "Elang");
        map.put("Bayu", "Bayu");
        map.put("Segara", "Segara");
        for (var key : map.keySet()){
            System.out.println(key);
        }
    }
}
