package pl.teslachorzow.Hnapisy;

public class Main05 {
    public static void main(String[] args) {
        String[] str = { "nikola", "tesla", "najwiekszy", "wynalazca"};
        System.out.println(stringFromArray(str));
    }

    public static String stringFromArray(String[] str) {
        String joinedStr = "";
        for (int i = 0; i < str.length - 1; i++) {
            joinedStr += str[i];
        }
        return joinedStr;
    }
}
