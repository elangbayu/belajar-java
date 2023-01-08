package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Elang";
        first = first+" "+"Bayu";
        System.out.println(first);

        String second = "Elang Bayu";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Elang Bayu";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
