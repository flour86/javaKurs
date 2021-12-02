package pl.teslachorzow.Dtablice;

import java.util.Arrays;
import java.util.Random;

public class Main13 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        Random r = new Random();
        for (int i=0; i < numbers.length; i++) {
            int num = r.nextInt(20);
            numbers[i] = num;
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
