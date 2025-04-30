package LesOpdrachten.LichtIsAan;

/*
Stefan Kiers
30-04-'25

Maak een schaakbord met behulp van een loop, startend en eindigend bij 1 / 8.
 */

public class LoopSchaakbord {
    public static void main(String[] args) {
        int i = 1;
        int j = 8;

        for (j = 8; j > 0; j--) {
            for (i = 1; i < 9; i++)
            System.out.print("(" + j + "," + i + ")");
            System.out.println();
        }
    }
}
