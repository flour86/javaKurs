package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        equation();
    }

    public static void equation() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = scan.nextInt();

        System.out.print("Podaj b: ");
        int b = scan.nextInt();

        System.out.print("Podaj c: ");
        int c = scan.nextInt();

        int delta = (b*b) - (4 * a * c);
        double deltaSqrt = Math.sqrt(delta);
        if(delta > 0) {
            double x1 = ((-b) - deltaSqrt) / 2 * a;
            double x2 = ((-b) + deltaSqrt) / 2 * a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (delta == 0) {
            double x0 = -b / 2 * a;
            System.out.println("x0 = " + x0);
        }
        else {
            System.out.println("Brak pierwiastkow");
        }
    }
}
