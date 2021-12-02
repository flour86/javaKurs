package pl.teslachorzow.Dtablice;

import java.util.Arrays;

public class Main09 {
    public static void main(String[] args) {
        int[] mainTab = new int[50];
        String pierliczba = "";
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
            if (i % 10 == 0) {
                System.out.println();
            }
            if (mainTab[i] < 10) {
                System.out.println("0" + mainTab[i] + ", ");
            } else {
                System.out.println(mainTab[i] + ", ");
            }
        }
    }
}
