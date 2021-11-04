package pl.teslachorzow.kontrolaprzeplywu;

public class Main06 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i >= 0; i--) {
            if (n % 2 == 0) {
                System.out.println(n + " - parzysta");
                n--;
            }
            else {
                System.out.println(n + " - nieparzysta");
                n--;
            }
        }
        int i = n;
        while (i >= 0) {
            if (n % 2 == 0) {
                System.out.println(n + " - parzysta");
                n--;
            }
            else {
                System.out.println(n + " - nieparzysta");
                n--;
            }
            i--;
        }
    }
}
