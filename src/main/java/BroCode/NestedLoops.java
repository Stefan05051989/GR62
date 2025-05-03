package BroCode;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns : ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use : ");
        symbol = scanner.next().charAt(0);
        System.out.println();



        for (int i = 0; i < rows; i++){ // prints the rows
            for (int j = 0; j < columns; j++){ // prints the columns
                System.out.print(symbol);
            }
            System.out.println();
        }

        scanner.close();
    }
}
