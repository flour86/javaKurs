package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        getInfo();
    }
    public static void getInfo() {
        System.out.println("Imie: ");
        Scanner imieScan = new Scanner(System.in);
        String imie = imieScan.nextLine();
        System.out.println("Wiek: ");
        Scanner wiekScan = new Scanner(System.in);
        String wiek = wiekScan.nextLine();

        System.out.println(imie + " ma " + wiek +  " lat");
    }
}
