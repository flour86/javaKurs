package pl.teslachorzow.Fmetody;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(createName("adam", "nowak", "adas"));
    }

    public static  String createName(String name, String surname, String nickname) {
        return String.join(" ", name, surname, nickname);
    }
}
