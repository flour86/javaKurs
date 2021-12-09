package pl.teslachorzow.Hnapisy;

public class Main07 {
    public static void main(String[] args) {
        String str = "Kobyla ma maly bok";
        String strLowerCase = str.toLowerCase();
        String trimmedStr = strLowerCase.replaceAll("\\s","");
        char ch;
        boolean isPalindrome = false;

        if (trimmedStr.equals(reversed(str))) {
            isPalindrome = true;
        }

        System.out.println(isPalindrome);
    }

    public static String reversed(String str) {
        String strWOSpace = str.replaceAll("\\s", "");
        String strLowerCase = strWOSpace.toLowerCase();
        String strReversed = "";

        char ch;

        for (int i = 0; i < strWOSpace.length(); i++) {
            ch = strLowerCase.charAt(i);
            strReversed = ch + strReversed;
        }
        return strReversed;
    }
}
