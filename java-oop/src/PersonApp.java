public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Elang", "Yogya");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Wiwit");
        Person person2 = new Person("Wiwit");
        Person person3;
        person3 = new Person();
        person3.sayHello("Wiwit");
    }
}