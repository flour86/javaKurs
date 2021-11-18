package pl.teslachorzow.Btypydanych;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        double nr1 = 5.1;
        float nr2 = 5.0f;
        boolean result = nr1 > nr2;
        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals("hej"))
        {
            for (int i = 0; i <= 10; i++)
            {
                System.out.println("hej");
            }
        }
        else
        {
            System.out.println("sadeg");
        }
    }
}
