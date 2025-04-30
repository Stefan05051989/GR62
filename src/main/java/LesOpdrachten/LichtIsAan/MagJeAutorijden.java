package LesOpdrachten.LichtIsAan;

/*
Stefan Kiers
30-04-'25

maak een programma dat aangeeft of wel of niet mag autorijden, of onder begeleiding
 */

public class MagJeAutorijden {
    public static void main(String[] args) {
        // aanmaken van variabele :
        boolean heeftRijbewijs = true;
        int leeftijd = 18;

        if (!heeftRijbewijs){
            System.out.println("Je mag niet autorijden");
        }else if(leeftijd < 18){
            System.out.println("Je mag autorijden onder begeleiding");
        }else{
            System.out.println("je mag autorijden");
        }
    }
}


