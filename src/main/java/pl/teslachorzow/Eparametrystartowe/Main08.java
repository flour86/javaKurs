package pl.teslachorzow.Eparametrystartowe;

public class Main08 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int gcd = 0;

        for (int i = 0; i < args.length; i++) {
            if ( x == 0) {
                gcd = y;
            }
            while ( y != 0 ) {
                if ( x > y ) {
                    gcd = x - y;
                }
                else {
                    y = y - x;
                }
            }
        }
        System.out.println(gcd);
    }
}
