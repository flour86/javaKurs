package pl.teslachorzow.Fmetody;

public class Main10 {
    public static void main(String[] args) {
        System.out.println(footballWin(3, 3, 3, 3));
    }

    public static String footballWin(int goalAg, int goalBg, int goalAw, int goalBw) {
        double wynikA = goalAw * 1.5 + goalAg;
        double wynikB = goalBw * 1.5 + goalBg;

        if ( wynikA > wynikB ) {
            return "druzyna A wygrala";
        }
        if ( wynikB > wynikA ) {
            return "druzyna B wygrala";
        }
        else {
            return "remis";
        }
    }
}
