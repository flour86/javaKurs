package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        rowsColmns();
    }
    public static void rowsColmns() {
        int rows;
        int columns;
        int rowSum;
        int columnSum;
        double sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj liczbe rzedow: ");
        rows = scan.nextInt();
        System.out.print("Podaj liczbe kolumn: ");
        columns = scan.nextInt();

        int[] [] intArray = new int[rows] [columns];

        for (int i = 0; i < rows; i++) {
            System.out.print("Podaj liczbe: ");
            int num1 = scan.nextInt();
            intArray[i] [0] = num1;
            for (int j = 0; j < columns; j++) {
                System.out.print("Podaj liczbe: ");
                int num2 = scan.nextInt();
                intArray[i] [j] = num2;
                sum += num1 + num2;
            }
        }
        System.out.println("Suma wynosi: " + sum);
        System.out.print("Srednia wynosi: " + (sum/(rows+columns)));
    }
}
