package pl.teslachorzow.kontrolaprzeplywu;

public class Main05 {
    public static void main(String[] args) {
        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 1; i <= 10; i++) {
            resultFor+=i;
        }
        System.out.println(resultFor);

        int i = 0;
        while (i <= 10) {
            resultWhile+=i;
            i++;
        }
        System.out.println(resultWhile);
    }
}
