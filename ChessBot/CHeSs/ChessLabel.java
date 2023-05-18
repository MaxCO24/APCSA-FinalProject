package CHeSs;

import java.awt.*;
import javax.swing.*;

public class ChessLabel extends JLabel {
    Font f = new Font("Ariel", Font.PLAIN, 90);
    Color bgLight = new Color(222, 184, 135);
    Color bgDark = new Color(139, 69, 19);
    private String pieceType;
    private String pieceColor;
    
    
    ChessLabel(String s, String w) { //modified constructor; takes piece type and bool determines color (true will always mean white and vice versa)
        super(ChessLabel.strToUni(s, w));
        
        pieceType = s;
        pieceColor = w;
        
    }
    
    ChessLabel() //constructor for empty spaces
    {
        super(" ");
        pieceType = " ";
        pieceColor = " ";
    }

    public String getPieceType() {return pieceType;}
    public String getPieceColor() {return pieceColor;}
    public void setPieceType(String pt) {pieceType = pt;}
    public boolean isEmpty() { return pieceType.equals(" ");}
    public boolean isWhite() { return pieceColor.equals("w");}
    public boolean isBlack() { return pieceColor.equals("b");}
    

    public static String strToUni(String piece, String color) //converts readable piece name string into unicode char for display()
    {
        if(color.equals("w"))
        {
            switch (piece)
            {
                case "p":
                    return "\u2659";
                case "r":
                    return "\u2656";
                case "kn":
                    return "\u2658";
                case "b":
                    return "\u2657";
                case "q":
                    return "\u2655";
                case "k":
                    return "\u2654";
            }
        } else {
            switch (piece)
            {
                case "p":
                    return "\u265F";
                case "r":
                    return "\u265C";
                case "kn":
                    return "\u265E";
                case "b":
                    return "\u265D";
                case "q":
                    return "\u265B";
                case "k":
                    return "\u265A";
            }

        }
        return " ";
    }

    void set(int idx, int row) {
        setFont(f);
        setOpaque(true);
        setBackground((idx+row)%2 == 0 ? bgLight : bgDark);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}
