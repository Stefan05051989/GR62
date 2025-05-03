package LesOpdrachten;

/*
Stefan Kiers
30-04-'25

Maak een schaakbord met behulp van een loop, startend en eindigend bij 1 / 8.
 */

public class LoopSchaakbord {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (j = 10; j > 0; j--) { // print 8 t/m 1 van boven naar beneden (1 kolom)
            for (i = 1; i < 10; i++) // print 1 t/m in rijen van links naar rechts
            System.out.print("(" + j + "," + i + ")");
            System.out.println();
        }
    }
}
