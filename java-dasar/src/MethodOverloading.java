public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Elang");
        sayHello("Elang", "Segara");
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    static void sayHello(String fitstName, String lastName){
        System.out.println("Hello "+fitstName+" "+lastName);
    }
}
