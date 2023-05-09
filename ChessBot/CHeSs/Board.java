package CHeSs;

import java.awt.*;
import javax.swing.JFrame;


public class Board extends JFrame {


   //Initialise arrays to hold panels and images of the board

    private ChessLabel[] labels;

    public Board() {
        labels = new ChessLabel[] {
            // black
            new ChessLabel("\u265C"), new ChessLabel("\u265E"), new ChessLabel("\u265D"), 
            new ChessLabel("\u265B"), new ChessLabel("\u265A"), new ChessLabel("\u265D"), 
            new ChessLabel("\u265E"), new ChessLabel("\u265C"),

            new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
            new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
            new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
            
            // empty
            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "), 
            
            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "), 

            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "),

            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "), new ChessLabel(" "), 
            new ChessLabel(" "), new ChessLabel(" "),
            // white
            new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"), 
            new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"), 
            new ChessLabel("\u2659"), new ChessLabel("\u2659"),
            
            new ChessLabel("\u2656"), new ChessLabel("\u2658"), new ChessLabel("\u2657"), 
            new ChessLabel("\u2655"), new ChessLabel("\u2654"), new ChessLabel("\u2657"), 
            new ChessLabel("\u2658"), new ChessLabel("\u2656")
        };
    } // Board()

    void display() {
        setTitle("Chess board with unicode images");

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);

        int row = -1;
        for (int i = 0; i < labels.length; i++)  {
            if(i % 8 == 0) row ++; // increment row number
            labels[i].set(i, row);
            contentPane.add(labels[i]);
        } // i

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    } // display()

} // class Board
