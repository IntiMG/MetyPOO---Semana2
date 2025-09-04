package run;

import models.Product;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product();
        Product prod2 = new Product("Cemento Gris", 120);
        Product prod3 = new Product("Tubo PVC", 45, 30);

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);

    }
}
