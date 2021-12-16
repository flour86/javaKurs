package pl.teslachorzow.IwprowadzanieDanych;

import java.util.Objects;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        textLines();
    }
    public static void textLines() {
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);

        while(repeat) {
            String text = scan.nextLine();
            if(text.equals("quit")) {
                repeat = false;
            }
            else {
                System.out.println(text);
            }
        }
    }
}
