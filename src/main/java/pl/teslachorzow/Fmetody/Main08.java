package pl.teslachorzow.Fmetody;

public class Main08 {
    public static void main(String[] args) {
        System.out.println(maxOfThree(94,129,48));
    }

    public static int maxOfThree(int num1, int num2, int num3) {
        if (num1 > num2) {
            return num1;
        }
        if (num2 > num3) {
            return num2;
        }
        else {
            return num3;
        }
    }
}
