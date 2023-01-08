package programmer.zaman.now.application;

import programmer.zaman.now.data.*;
public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook", 3000000);
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product);

        Product product2 = new Product("Macbook", 3000000);
        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());

//        Data data = new Data();
    }
}
