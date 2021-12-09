package pl.teslachorzow.Hnapisy;

public class Main03 {
    public static void main(String[] args) {
        String str = "NikolaTesla";
        System.out.println(firstHalf(str));
    }

    public static String firstHalf(String str) {
        int x = str.length() / 2;
        String strHalf = str.substring(0,x);
        return strHalf;
    }
}
