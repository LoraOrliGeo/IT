package lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] chessBoard = new String[8][8];

        int[] coordinates = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int row = 0; row < 8; row ++) {
            for (int col = 0; col < 8; col ++) {
                if (row % 2 == 0) {
                    if (col % 2 == 0) {
                        chessBoard[row][col] = "b";
                    } else {
                        chessBoard[row][col] = "w";
                    }
                } else {
                    if (col % 2 == 0) {
                        chessBoard[row][col] = "w";
                    } else {
                        chessBoard[row][col] = "b";
                    }
                }
            }
        }

        int firstRow = coordinates[0];
        int firstCol = coordinates[1];

        int secondRow = coordinates[2];
        int secondCol = coordinates[3];

        String first = chessBoard[firstRow][firstCol];
        String second = chessBoard[secondRow][secondCol];

        if (first.equals(second)){
            System.out.println("Позициите са с еднакъв цвят");
        } else {
            System.out.println("Позициите са с различен цвят");
        }

        // another way:
//        String cell1 = "A3", cell2 = "H4";
//        System.out.println(chessBoardCellColor(cell1,cell2));
    }

//    static boolean chessBoardCellColor(String cell1, String cell2) {
//        if((cell1.charAt(0) + cell1.charAt(1)) % 2 == 0 &&
//                (cell2.charAt(0) + cell2.charAt(1)) % 2 == 0 ||
//                (cell1.charAt(0) + cell1.charAt(1)) % 2 != 0 &&
//                        (cell2.charAt(0) + cell2.charAt(1)) % 2 != 0) {
//            return true;
//
//        }
//        return false;
//    }
}
