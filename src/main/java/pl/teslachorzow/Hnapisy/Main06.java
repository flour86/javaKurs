package pl.teslachorzow.Hnapisy;

public class Main06 {
    public static void main(String[] args) {
        String str = "Tak";
        String strReversed = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            strReversed = ch + strReversed;
        }
        System.out.println(strReversed);
    }
}
