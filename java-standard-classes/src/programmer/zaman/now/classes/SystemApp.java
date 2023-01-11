package programmer.zaman.now.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.getenv("HOME"));
        System.out.println(System.getenv("JavSysApp"));
        System.out.println(System.getenv("COBACOBAENV"));
        System.gc();
        System.exit(1);
        System.out.println("Hi");
    }
}
