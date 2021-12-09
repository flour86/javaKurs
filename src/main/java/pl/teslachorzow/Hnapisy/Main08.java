package pl.teslachorzow.Hnapisy;

public class Main08 {
    public static void main(String[] args) {
        String str = "Nikola TESLA";
        System.out.println(toggleChar(str));

    }

    public static String toggleChar(String str){
        char[] charArray = str.toCharArray();
        for (int i=0; i< charArray.length; i++){
            if (Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            else if (Character.isLowerCase(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }
}
