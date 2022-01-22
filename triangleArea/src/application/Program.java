package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // Padroniza os retornos com padrao Americano
        Locale.setDefault(Locale.US);

        // Declara vars e instancia vars
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        //  Instancia um novo Scanner
        System.out.println("Enter the measures of triangle X: ");
        Scanner sc = new Scanner(System.in);
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calcArea();
        double areaY = y.calcArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Larger area: X");
        }
        System.out.println("Larger area: Y");

        // Fecha o scanner
        sc.close();

    }

}
