package CHeSs;

import java.awt.*;
import javax.swing.JFrame;


public class Board extends JFrame {

   //Initialise arrays to hold panels and images of the board

    private ChessLabel[][] labels;

    public Board()
    {
        labels = new ChessLabel[][] {

      // black
      {new ChessLabel("bRook.png"), new ChessLabel("bKnight.png"), new ChessLabel("bBishop.png"), 
       new ChessLabel("bQueen.png"), new ChessLabel("bKing.png"), new ChessLabel("bBishop.png"), 
      new ChessLabel("bKnight.png"), new ChessLabel("bRook.png")},

      {new ChessLabel("bPawn.png"), new ChessLabel("bPawn.png"), new ChessLabel("bPawn.png"), 
      new ChessLabel("bPawn.png"), new ChessLabel("bPawn.png"), new ChessLabel("bPawn.png"), 
      new ChessLabel("bPawn.png"), new ChessLabel("bPawn.png")}, 
    
      // empty
       {new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" ")}, 
    
       {new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" ")}, 

       {new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" ")},

       {new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
       new ChessLabel(" "), new ChessLabel(" ")},

       // white
       {new ChessLabel("wPawn.png"), new ChessLabel("wPawn.png"), new ChessLabel("wPawn.png"), 
       new ChessLabel("wPawn.png"), new ChessLabel("wPawn.png"), new ChessLabel("wPawn.png"), 
       new ChessLabel("wPawn.png"), new ChessLabel("wPawn.png")},
       
       {new ChessLabel("wRook.png"), new ChessLabel("wKnight.png"), new ChessLabel("wBishop.png"), 
       new ChessLabel("wQueen.png"), new ChessLabel("wKing.png"), new ChessLabel("wBishop.png"), 
      new ChessLabel("wKnight.png"), new ChessLabel("wRook.png")}
        };
    } // Board()

    void display()
    {
        setTitle("Chess board with PNG images");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);

        for (int row = 0; row < labels.length; row++) {
            for (int col = 0; col < labels[row].length; col++) {
                labels[row][col].set(col, row); // Set the row and column for each label
                contentPane.add(labels[row][col]); // Add the label to the content pane
            }
        }
        
        //int row = -1;
        //for (int i = 0; i < labels.length; i++) 
        //{
        //    if(i % 8 == 0) row ++; // increment row number
        //    labels[i].set(i, row);
        //    contentPane.add(labels[i]);
        //} Old 1-D array ver. of nested loop for reference

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    } // display()

} // class Board
