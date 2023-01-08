public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Bayu");
        manager.sayHello("Wiwit");
        var vp = new VicePresident("Segara");
        vp.sayHello("Widowati");
        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
