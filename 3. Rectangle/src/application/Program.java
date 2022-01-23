package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.println("Informe a largura do retangulo");
        rectangle.width = scanner.nextDouble();

        System.out.println("Informe a altura do retangulo");
        rectangle.height = scanner.nextDouble();

        scanner.close();

        System.out.printf("AREA = %.2f \n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f \n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f \n", rectangle.Diagonal());
    }
}
