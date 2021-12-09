package pl.teslachorzow.Hnapisy;

public class Main01 {
    public static void main(String[] args) {
        String str = "Nikola Tesla – amerykański inżynier serbskiego pochodzenia";
        char[] charArray = str.toCharArray();
        char x = charArray[str.length() - 2];
        int y = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == x) {
                y+=1;
            }
        }
        System.out.println(y);
    }
}
