package pl.teslachorzow.Dtablice;

public class Main05 {
    public static void main(String[] args) {
        int numbers[] = {4 , 643 , 112 , 9999 , -69};
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                min = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.print(min);
    }
}
