package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Elang", "Elang");
        map.put("Bayu", "Bayu");
        map.put("Segara", "Segara");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+" : "+value);
            }
        });
    }
}
