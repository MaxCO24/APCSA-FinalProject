package CHeSs;

import java.awt.*;
import javax.swing.*;

public class Board extends JFrame {
   //Initialise variables to hold panels and images of the board
    private ChessLabel[][] labels;

    public Board() {
        labels = new ChessLabel[][] {
            // black
            {new ChessLabel("\u265C"), new ChessLabel("\u265E"), new ChessLabel("\u265D"), 
            new ChessLabel("\u265B"), new ChessLabel("\u265A"), new ChessLabel("\u265D"), 
            new ChessLabel("\u265E"), new ChessLabel("\u265C")},

            {new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
            new ChessLabel("\u265F"), new ChessLabel("\u265F"), new ChessLabel("\u265F"), 
            new ChessLabel("\u265F"), new ChessLabel("\u265F")}, 

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
            {new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"), 
            new ChessLabel("\u2659"), new ChessLabel("\u2659"), new ChessLabel("\u2659"), 
            new ChessLabel("\u2659"), new ChessLabel("\u2659")},

            {new ChessLabel("\u2656"), new ChessLabel("\u2658"), new ChessLabel("\u2657"), 
            new ChessLabel("\u2655"), new ChessLabel("\u2654"), new ChessLabel("\u2657"), 
            new ChessLabel("\u2658"), new ChessLabel("\u2656")}
        };
    } // Board()

    void display() {
        setTitle("Chess board with unicode images");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);
        for (int r = 0; r < labels.length; r++) {
            for (int c = 0; c < labels[0].length; c++) {
                labels[r][c].set(r, c);
                contentPane.add(labels[r][c]);
            }
        } // contentPane

        setSize(600, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    } // display()
} // class Board
