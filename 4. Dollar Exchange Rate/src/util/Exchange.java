package util;

public class Exchange {

    private static final double IOF = 0.06;

    public static double calc(double dollarPrice, double boughtDollar) {

        double netValue = dollarPrice * boughtDollar;

        return (netValue * IOF) + netValue;
    }

}
