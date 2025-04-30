package LesOpdrachten.LichtIsAan;

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
