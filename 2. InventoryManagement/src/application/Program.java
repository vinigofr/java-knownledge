package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = scanner.nextLine();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.println("Product data: " + product + "\n");

        System.out.print("Enter the number of producuts do be added in stock");
        int quantityToBeAdded = scanner.nextInt();
        product.AddProducts(quantityToBeAdded);
        System.out.println("Product updated: " + product + "\n");

        System.out.print("Enter the number of producuts do be removed from stock");
        int quantityToBeRemoved = scanner.nextInt();
        product.RemoveProducts(quantityToBeRemoved);
        System.out.println("Product updated: " + product + "\n");

        scanner.close();
    }
}
