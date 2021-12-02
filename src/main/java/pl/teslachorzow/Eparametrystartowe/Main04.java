package pl.teslachorzow.Eparametrystartowe;

public class Main04 {
    public static void main(String[] args) {
        int sideA = Integer.parseInt(args[0]);
        int sideB = Integer.parseInt(args[1]);
        int sideC = Integer.parseInt(args[2]);
        boolean sidesAB = false;
        boolean sidesCB = false;
        boolean sidesAC = false;

        if ( sideA + sideB > sideC ) {
            sidesAB = true;
        }
        if ( sideC + sideB > sideA ) {
            sidesCB = true;
        }
        if ( sideA + sideC > sideB ) {
            sidesAC = true;
        }
        if ( sidesAB && sidesCB && sidesAC ) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
