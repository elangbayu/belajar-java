package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Elang");
        map.put("name.middle", "Bayu");
        map.put("name.last", "Segara");
        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
