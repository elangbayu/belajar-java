package programmer.zaman.now.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Elang");
        list.add("Bayu");
        list.add("Segara");
        for (var value : list){
            System.out.println(value);
        }
    }
}
