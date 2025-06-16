package w3schools.Java.StringPool;
/*
Stefan Kiers
16-06-'25

Strings are immutable.
When you create a String and declare an initial value, you can change that name of the value.
Like this :
String name = "Stefan";
name = "Joris";
We created the "name" variable with the value "stefan", so java created the variable name with different values.
But that variable isn't the name object itself. It's a reference to a String OBJECT in memory that it creates.
What java does in the memory is create a new OBJECT with a different value in the memory.
It doesn't override (overload) the first value.
That's what is meant with immutable, the variables stays but when changing the reference, the old one stays in the memory too.
The advantage of this is that it saves java a buttload of memory each time when making new Strings.
So every time you make a new String with identical values, it checks previous made Strings to check if the
value has allready been declared before, en picks that one out.
It does so from the pool.
Basically the "pool" is just a virtual dictionary where java can pull words from that have allready been used before.
This advantages makes it use have the memory that when making a new variable each time.

Only when you use the "new" keyword, it will create a new variable with the same value, like this :
String secondName = new String("Stefan");
That's when it creates another "pool" because you made a new String variable.

We can prove that with the example below :
 */


public class PoolApp {
    public static void main(String[] args) {
        PoolApp account = new PoolApp();
        // First show if the variables match each other :
        String name = "Stefan";
        String secondName = "Stefan";
        System.out.println(name == secondName); // works as a boolean, prints true.

        // Now create another variable using the "new" keyword and see if they match
        String thirdName = new String("Stefan");
        System.out.println(name == thirdName);
        /*
        This prints false, because what happens here is that java created a new object outside of the
        first pool and it doesn't match the ones made in the previous pool.
         */

        account.transferAmount(name, 500);
        account.transferAmount(thirdName, -100);

    }
    // Java also made this for extra security reasons (explanation with method)
    // As a simple banking method this can tranfer money betweens accounts.
    public static void transferAmount(String accountHolder, int depositAmount){
        int accountBalance = 100;
        String transferComplete = "Transfer completed.";
        String transferDeclined = "Transfer declined.";
        // Validations to check is the transaction is possible :
        if (depositAmount > 0 && accountBalance >= 0){
            accountBalance += depositAmount;
            System.out.println(transferComplete);
            System.out.println("Account : " + accountHolder);
            System.out.println("New balance : " + accountBalance);
            }else {
            System.out.println(transferDeclined);
            System.out.println("Error completing transaction");
        }
        /*
        As you can see in the example above, Strings name and thirdName have different outcomes even though that have identical value references.
        The outcome is not identical because if the Strings were the same, every Stefan around the world could, or could
         not, transfer the same amount of money every time. This gives an extra security level to the program which is
         easy to implement in the app.

         */
    }
}
