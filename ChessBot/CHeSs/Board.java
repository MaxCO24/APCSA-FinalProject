package CHeSs;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JFrame implements MouseListener {
   //Initialise variables to hold panels and images of the board
    private ChessLabel[][] labels;
    private boolean held = false;
    private ChessLabel heldPiece;

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
        addMouseListener(this);

        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);
        for (int r = 0; r < labels.length; r++) {
            for (int c = 0; c < labels[0].length; c++) {
                labels[r][c].set(r, c);
                contentPane.add(labels[r][c]);
            }
        } // contentPane

        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    } // display()

    void selectPiece(int x, int y) {
        heldPiece = labels[x][y];
    }

    void movePiece(int x, int y) {
        labels[x][y] = heldPiece;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (held) {
            selectPiece(x/100, y/100);
        }
        else {
            movePiece(x/100, y/100);
        }
        held = !held;
        System.out.println("Mouse Clicked at X: " + x/100 + " - Y: " + y/100 + " Held: " + held);
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
} // class Board
