package PlayersGuide.Opdracht11;

public class TowerDefenseField {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}






 /*
//        make the grid :
//        make a for loop that uses a dot "." as placeholder
//        This for-loop makes the blueprint for the grid :
//        for : int variable for 20 rows, condition : if number of rows is smaller then 20, row increment/+ 1
//        inner for loop : int var for columns, condition : if num of col is smaller then 20, col increment/+ 1.
//         */
//        for(int row = 0; row < 21; row++) { // print 20 rows
//            for (int col = 0; col < 21; col++) { // print 20 columns
//                field[row][col] = "."; // this prints the dot on every column / row
//            }
//        }
//        System.out.println("    "); // indent for rows, these will be printed either way, with or without the numbers.
//        // this for-loop will run the columns 1 to 20.
//        for (int col = 0; col < 21; col++){
//            // if col==0 : prints an empty string, formatted with a 4-character wide field
//            if (col==0) {
//                System.out.printf("%4s","");
//            }else{
//                System.out.printf("%4s", col);
//            }
//        }
//        System.out.println("    ");
//        for(int row = 1; row < 21; row++){
//            System.out.printf("%4d | ", row); // creates the start from the left side
//            for (int col = 0; col < 20; col++){
//              System.out.printf("%4s",field[row][col] + "   "); // creates the space between the dots from left to right
//            }
//            System.out.println();
//        }