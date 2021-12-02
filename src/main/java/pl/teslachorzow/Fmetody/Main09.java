package pl.teslachorzow.Fmetody;

public class Main09 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            n *= i; //n=n*i
        }
        return n;
    }
}
