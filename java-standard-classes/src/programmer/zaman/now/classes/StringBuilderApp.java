package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Elang");
        builder.append(" ");
        builder.append("Bayu");
        builder.append(" ");
        builder.append("Segara");

        String name = builder.toString();
        System.out.println(name);
    }
}
