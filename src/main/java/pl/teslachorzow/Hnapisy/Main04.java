package pl.teslachorzow.Hnapisy;

public class Main04 {
    public static void main(String[] args) {
        String str = "Nikola Tesla";
        String search = "kola";
        System.out.println(containsStr(str, search));
    }

    public static boolean containsStr(String str, String search) {
        return str.contains(search);
    }
}
