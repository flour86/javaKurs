package pl.teslachorzow.Dtablice;

import java.util.Arrays;
import java.util.Random;

public class Main12 {
    public static void main(String[] args) {
        int numbers[] = { 3, 5, 7, 2, 1 };
        int reverse[] = new int[numbers.length];
        int j = 0;
        for ( int i = numbers.length - 1; i > -1; i--) {
            reverse[j] = numbers[i];
            j++;
        }
        System.out.println("oryginal to: " + Arrays.toString(numbers));
        System.out.print("odwrot oryginalu to: " + Arrays.toString(reverse));
    }
}
