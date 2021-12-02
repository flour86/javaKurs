package pl.teslachorzow.Fmetody;

public class Main06 {
    public static void main(String[] args) {
        System.out.println(checkMaturity( 19));
    }

    public static boolean checkMaturity (int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}
