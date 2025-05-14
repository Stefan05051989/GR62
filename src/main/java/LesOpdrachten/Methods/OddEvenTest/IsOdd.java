package LesOpdrachten.Methods.OddEvenTest;
/*
Schrijf een booleaanse methode met de naam isOdd() in een klasse met de naam OddEvenTest,
die een int als invoer neemt en true retourneert als deze oneven is.

 */

class IsOdd {
    public static boolean isOdd(int base, int exp){
        //boolean isOdd = true;
        return ((base + exp) % 2) != 0;
    }
}
/*
Andere optie :
class oddEven{
    boolean isOdd(int num){
        return num % 2 != 0;
 */
