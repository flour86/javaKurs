package pl.teslachorzow.Ckontrolaprzeplywu;

public class MainBonus {
    public static void main(String[] args) {
        int n = 5000;
        for (int i = 0; n >= i; i++) {
            String row = "";
                if (i % 2 == 0) {
                    row += i + " ";
                }
                else {
                    row += "* ";
                }
                if (i % 50 == 1)
                {
                    System.out.println();
                }
            System.out.print(row);
        }
    }
}
