package pl.teslachorzow.Dtablice;

import java.util.Arrays;
import java.util.Random;

public class Main10 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] randNumbers = new int[20];
        //fori robi petle for ze "schematu"
        for ( int i = 0; i < randNumbers.length; i++) {
            int rand_num = r.nextInt( 101 );
            randNumbers[i] = rand_num;
        }
        Arrays.sort(randNumbers);
        System.out.println(randNumbers[0]);
    }
}
