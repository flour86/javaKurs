package pl.teslachorzow.Hnapisy;

public class Main02 {
    public static void main(String[] args) {
        String str = "Nikola Tesla";
        char s = 's';
        System.out.println(charPos(str, s));
    }

    public static int charPos(String str, char s) {
        char[] charArray = str.toCharArray();
        int x = 0;

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == s); {
                x = i;
            }
        }
        return x;
    }
}
