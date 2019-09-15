package lesson10_practice;

public class Test1Task4S6 {
    public static void main(String[] args) {

        /*
        Write a method that by given chessboard filled with figures on some squares,
        coordinates of knight (horse) and king, finds whether the knight can reach the king.
        The knight can move only on "Г"-shaped moves. The method must return true/false.
        Te other figures are marked with "X" on the board and the empty squares are
        marked with " " (space).
         */

        char[][] chessboard = {
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', 'H', ' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', 'X', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', 'X', ' '},
                {' ', ' ', 'X', ' ', ' ', 'K', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
        };

        int hI = 1;
        int hJ = 2;
        int kI = 6;
        int kJ = 5;

        boolean canTakeKing = canHorseTakeKing(chessboard, hI, hJ, kI, kJ);
        // canTakeKing = true;
    }

    private static boolean canHorseTakeKing(char[][] chessboard, int hI, int hJ, int kI, int kJ) {
        // in case of index out of bounds ot "X" figure -> return false
        // in case of reaching the king -> return true

        // possible moves of the horse:
        int[] firstMove = {hI - 2, hJ - 1};
        int[] secondMove = {hI - 2, hJ + 1};
        int[] thirdMove = {hI - 1, hJ + 2};
        int[] fourthMove = {hI + 1, hJ + 2};
        int[] fifthMove = {hI + 2, hJ + 1};
        int[] sixthMove = {hI + 2, hJ - 1};
        int[] seventhMove = {hI + 1, hJ - 2};
        int[] eighthMove = {hI - 1, hJ - 1};

        // if the move is valid -> mark current cell of the horse as "X"
        // call the function with the new coordinates

        if (isInvalidCell(firstMove)) {
            return false;
        }

        if (chessboard[firstMove[0]][firstMove[1]] == 'X') {
            return false;
        }

        if (firstMove[0] == kI && firstMove[1] == kJ) {
            return true;
        }

        chessboard[hI][hJ] = 'X';
        boolean jumpFirstMove = canHorseTakeKing(chessboard, firstMove[0], firstMove[1], kI, kJ);
        boolean jumpSecondMove = canHorseTakeKing(chessboard, secondMove[0], secondMove[1], kI, kJ);

        return jumpFirstMove || jumpSecondMove; // || jumpThirdMove || jumpFourthMove || jumpFifthMove ||
        //jumpSixthMove || jumpSeventhMove || jumpEighthMove;
    }

    public static boolean isInvalidCell(int[] coord) {
        return coord[0] < 0 || coord[0] > 7 || coord[1] < 0 || coord[1] > 7;
    }
}
