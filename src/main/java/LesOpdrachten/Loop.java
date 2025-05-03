package LesOpdrachten;

/*
Stefan Kiers
30-04-'25

maak met behulp van een for loop de volgende uitkomst :

123
234
345
456
567
678
789

 */

public class Loop {
    public static void main(String[] args) {
        int i = 0;

        for (i = 1; i < 8; i++){
            System.out.print(i);
            System.out.print(i + 1);
            System.out.print(i + 2 + "\n");
        }
    }
}
