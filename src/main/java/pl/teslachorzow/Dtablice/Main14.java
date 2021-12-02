package pl.teslachorzow.Dtablice;

import java.util.Arrays;
import java.util.Random;

public class Main14 {
    public static void main(String[] args) {
        int leng = 10;
        int numbers[] = new int[leng];
        int secondNumbers[] = new int[leng];
        int tabSum[] = new int[leng];
        Random random = new Random();
        for (int i=0; i < numbers.length; i++) {
            int num1 = random.nextInt(20);
            int num2 = random.nextInt(20);
            numbers[i] = num1;
            secondNumbers[i] = num2;
        }
        for (int i = 0; i < numbers.length; i++) {
            tabSum[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println("pierwsza tablica: " + Arrays.toString(numbers));
        System.out.println("druga tablica: " + Arrays.toString(secondNumbers));
        System.out.println("suma tych tablic: " + Arrays.toString(tabSum));
    }
}
