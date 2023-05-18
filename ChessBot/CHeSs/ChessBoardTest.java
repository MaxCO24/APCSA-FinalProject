package CHeSs;

public class ChessBoardTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();
        board.display();
        
    }

    public static void testBool(String desc, boolean test, boolean expected)
    {
        String result = (test == expected)?"PASSED":"FAILED";
        System.out.println(desc + " - " + result + " [ Expected = " + expected + ", Test = " + test + " ]");
    }

    public static void testKnight(Board board)
    {
        testBool("Knight 1", board.isLegalMove(0, 1, 2, 0), true);
        testBool("Knight 2", board.isLegalMove(0, 1, 2, 2), true);
        testBool("Knight 3", board.isLegalMove(0, 1, 1, 3), false);
    }

    public static void testBishop(Board board)
    {
        testBool("Bishop 1", board.isLegalMove(4, 3, 2, 1), true);
        testBool("Bishop 2", board.isLegalMove(4, 3, 2, 5), false);
        testBool("Bishop 3", board.isLegalMove(4, 3, 6, 5), false);
        testBool("Bishop 4", board.isLegalMove(4, 3, 6, 1), true);

    }

    public static void testQueen(Board board)
    {
        testBool("Queen 1", board.isLegalMove(4, 3, 1, 0), true);
        testBool("Queen 2", board.isLegalMove(4, 3, 1, 3), true);
        testBool("Queen 3", board.isLegalMove(4, 3, 1, 6), true);
        testBool("Queen 4", board.isLegalMove(4, 3, 4, 6), true);
        testBool("Queen 5", board.isLegalMove(4, 3, 7, 6), true);
        testBool("Queen 6", board.isLegalMove(4, 3, 7, 3), true);
        testBool("Queen 7", board.isLegalMove(4, 3, 7, 1), true);
        testBool("Queen 8", board.isLegalMove(4, 3, 4, 1), true);
        testBool("Queen 9", board.isLegalMove(0, 3, 0, 0), false);
        testBool("Queen 10", board.isLegalMove(0, 7, 7, 7), true);
    }

    public static void testKing(Board board)
    {
        testBool("King 1", board.isLegalMove(4, 3, 3, 2), true);
        testBool("King 2", board.isLegalMove(4, 3, 2, 3), false);
        testBool("King 3", board.isLegalMove(4, 3, 3, 4), false);
        testBool("King 4", board.isLegalMove(4, 3, 5, 4), false);
    }
}
