package programmer.zaman.now.lambda.app;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first.name", "Elang");
        map.put("middle.name", "Bayu");
        map.put("last.name", "Segara");
        for (var entry : map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //foreach anonymous class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+" : "+value);
            }
        });
        //lambda
        map.forEach((key, value) -> System.out.println(key+" : "+value));
    }
}
