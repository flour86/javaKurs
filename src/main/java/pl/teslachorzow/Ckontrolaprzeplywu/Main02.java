package pl.teslachorzow.Ckontrolaprzeplywu;

public class Main02 {
    public static void main(String[] args) {
        int nr1 = 3;
        int nr2 = 7;
        int nr3 = 11;

        if ((nr1 > nr2) && (nr2 > nr3)) {
            System.out.println(nr1 + " jest najwieksza");
        }
        else if ((nr2 > nr3) && (nr3 > nr1)) {
            System.out.println(nr2 + " jest najwieksza");
        }
        else {
            System.out.println(nr3 + " jest najwieksza");
        }
    }
}
