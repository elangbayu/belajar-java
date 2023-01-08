class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Elang");
        employee.sayHello("Bayu");
        employee = new Manager("Elang");
        employee.sayHello("Bayu");
        employee = new VicePresident("Elang");
        employee.sayHello("Bayu");

        sayHello(new Employee("Elang"));
        sayHello(new Manager("Bayu"));
        sayHello(new VicePresident("Segara"));
    }

    static void sayHello(Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP "+employee.name);
        } else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello manager "+employee.name);
        } else {
            System.out.println("Hello "+employee.name);
        }

    }
}
