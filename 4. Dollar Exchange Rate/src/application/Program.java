package application;

import util.Exchange;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price?\n-> ");
        double dollarPrice = scan.nextDouble();
        System.out.println();

        System.out.print("How many dollars will be bought?\n-> ");
        double boughtDollars = scan.nextDouble();
        System.out.println();

        scan.close();

        double result = Exchange.calc(dollarPrice, boughtDollars);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);
    }

}
