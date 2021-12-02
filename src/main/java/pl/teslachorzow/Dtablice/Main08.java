package pl.teslachorzow.Dtablice;

import java.util.Arrays;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        int[] tab1 = { 30, 29, 24, 14, 42, -4, -1 };
        int[] tab2 = new int[]{ 30, 29, 24, 14, 42, -4, -1 };

        //wyswietlanie tablic
        System.out.println(Arrays.toString(tab1));

        //porownanie tablic
        System.out.println(Arrays.equals( tab1, tab2 ));

        //sortowanie
        Arrays.sort(tab1);
        System.out.println(Arrays.toString(tab1));

    }
}
