package pl.teslachorzow.Eparametrystartowe;

public class Main05 {
    public static void main(String[] args) {
        int points = Integer.parseInt(args[0]);
        if (points < 0 || points > 100) {
            System.out.println("BADVALUE");
        }
        if (points <= 50) System.out.println("F");
        if (points <= 70) System.out.println("E");
        if (points <= 90) System.out.println("C");
        else System.out.println("A");
    }
}
