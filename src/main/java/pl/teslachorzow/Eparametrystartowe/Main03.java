package pl.teslachorzow.Eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {
        int tab[] = new int[args.length];
        double avg = 0;
        for (int i = 0; i < args.length; i++) {
            int argsInt = Integer.parseInt(args[i]);
            avg = argsInt + avg;
        }
        System.out.println("srednia: " + avg / args.length);
    }
}
