package pl.teslachorzow.Ckontrolaprzeplywu;

public class Main06 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0) {
                System.out.println(n + " - parzysta");
            }
            else {
                System.out.println(n + " - nieparzysta");
            }
        }
        int i = n;
        while (i <= 0) {
            if (n % 2 == 0) {
                System.out.println(n + " - parzysta");
            }
            else {
                System.out.println(n + " - nieparzysta");
            }
            i++;
        }
    }
}
