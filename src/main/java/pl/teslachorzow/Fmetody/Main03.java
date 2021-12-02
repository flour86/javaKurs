package pl.teslachorzow.Fmetody;

public class Main03 {

    public static void main(String[] args) {
        double usd = convertToUsd(100);
        System.out.println(usd);
    }

    public static double convertToUsd( double pln ) {
        return pln / 4.24;
    }
}
