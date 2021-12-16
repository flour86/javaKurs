package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        getData();
    }
    public static void getData() {
        int sum = 0;
        int multiple = 0;
        int num = 1;
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while(num > 0) {
            System.out.print("Podaj liczbe: ");
            num = scan.nextInt();
            sum += num;
            multiple = i;
            i++;
        }
        System.out.println("Suma wynosi: " + sum);
        System.out.println("Tyle liczb zostalo podane: " + multiple);
    }
}
