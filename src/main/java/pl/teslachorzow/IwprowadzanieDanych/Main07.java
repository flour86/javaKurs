package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        nettoBrutto();
    }
    public static void nettoBrutto() {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        while(repeat) {
        System.out.println("brutto na netto - \"bn\"; netto na brutto - \"nb\"");
        String wybor = scan.nextLine();

            if (wybor.equals("bn")) {
                System.out.print("Wartosc brutto: ");
                double brutto = scan.nextInt();
                double netto = brutto - 0.23 * brutto;
                System.out.println("Wartosc netto: " + netto);
                repeat = false;
            } else if (wybor.equals("nb")) {
                System.out.print("Wartosc netto: ");
                double netto = scan.nextInt();
                double brutto = netto * 1.23;
                System.out.println("Wartosc brutto: " + brutto);
                repeat = false;
            } else {
                repeat = true;
            }
        }
    }
}
