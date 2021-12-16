package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        operations();
    }

    public static void operations() {
        System.out.print("a = ");
        Scanner num1Scan = new Scanner(System.in);
        double num1 = num1Scan.nextDouble();
        System.out.print("b = ");
        Scanner num2Scan = new Scanner(System.in);
        double num2 = num2Scan.nextDouble();

        System.out.println("Dodawanie: " + num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println("Odejmowanie: " + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Mnozenie: " + num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println("Dzielenie: " + num1 + " / " + num2 + " = " + (num1/num2));
    }
}
