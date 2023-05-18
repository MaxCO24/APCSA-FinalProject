package CHeSs;

import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

import javax.swing.*;

public class Board extends JFrame implements MouseListener {
   //Initialise variables to hold panels and images of the board
    private ChessLabel[][] labels;
    private boolean held = false;
    private ChessLabel heldPiece;
    public Board() {
        labels = initNew();
    }
    public ChessLabel[][] initNew() {
        ChessLabel [][] newBoard = new ChessLabel[][] { //changed to be easier to read
            // black
            {new ChessLabel("r", "b"), new ChessLabel("kn", "b"), new ChessLabel("b", "b"), 
            new ChessLabel("q", "b"), new ChessLabel("k", "b"), new ChessLabel("b", "b"), 
            new ChessLabel("kn", "b"), new ChessLabel("r", "b")},

            {new ChessLabel("p", "b"), new ChessLabel("p", "b"), new ChessLabel("p", "b"), 
            new ChessLabel("p", "b"), new ChessLabel("p", "b"), new ChessLabel("p", "b"), 
            new ChessLabel("p", "b"), new ChessLabel("p", "b")},
            // empty
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()}, 

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel( )},

            // white
            {new ChessLabel("p", "w"), new ChessLabel("p", "w"), new ChessLabel("p", "w"), 
            new ChessLabel("p", "w"), new ChessLabel("p", "w"), new ChessLabel("p", "w"), 
            new ChessLabel("p", "w"), new ChessLabel("p", "w")},
            
            {new ChessLabel("r", "w"), new ChessLabel("kn", "w"), new ChessLabel("b", "w"), 
            new ChessLabel("q", "w"), new ChessLabel("k", "w"), new ChessLabel("b", "w"), 
            new ChessLabel("kn", "w"), new ChessLabel("r", "w")}

        };
        return newBoard;
    }
    
    public ChessLabel[][] initQueenTest() {
        ChessLabel [][] newBoard = new ChessLabel[][] { //changed to be easier to read
            {new ChessLabel(), new ChessLabel("p", "b"), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel("q", "b")},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},
            
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()}, 

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel("q", "b"), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},
            
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel("p", "w")}

        };
        return newBoard;
    }

    public ChessLabel[][] initKingTest() {
        ChessLabel [][] newBoard = new ChessLabel[][] { //changed to be easier to read
            // black
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},
            // empty
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel("k", "w"), 
            new ChessLabel(), new ChessLabel()}, 

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel("k", "b"), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},

            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel("r", "w"), new ChessLabel()},

            // white
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()},
            
            {new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel(), new ChessLabel(), 
            new ChessLabel(), new ChessLabel()}
        };
        return newBoard;
    }
    
    public boolean canBishopMove(int sRow, int sCol, int eRow, int eCol)
    {
        if(eRow > sRow)
        {
            for(int i = Math.min(eCol, sCol)+1; i < Math.max(eCol, sCol); i++)
                {
                    if(!labels[eRow-i][i].isEmpty()) {return false;}
                }
                return true;
        } else {
            int j = 1;
            for(int i = Math.min(eRow, sRow)+1; i < Math.max(eRow, sRow); i++)
            {
                if(!labels[i][Math.min(eCol, sCol)+j].isEmpty()) {return false;}
                j++;
            }
            return true;
        }     
    }
    public boolean canRookMove(int sRow, int sCol, int eRow, int eCol)
    {
        if((sRow == eRow))
        {
            for(int i = Math.min(eCol, sCol)+1; i < Math.max(eCol, sCol); i++)
            {
                if(!labels[sRow][i].isEmpty()) {return false;}
            }
            return true;
        } else if (sCol == eCol) {
            for(int i = Math.min(eRow, sRow)+1; i < Math.max(eRow, sRow); i++)
            {
                if(!labels[i][sCol].isEmpty()) {return false;}
            }
            return true;
        }
        return false;
    }
    
    public boolean isLegalMove(int sRow, int sCol, int eRow, int eCol) // work in progress :)
    {
        ChessLabel curPiece = labels[sRow][sCol];
        ChessLabel destination = labels[eRow][eCol];
        
        int rAbs = Math.abs(eRow - sRow);
        int cAbs = Math.abs(eCol - sCol);

        if(curPiece.isEmpty()) {return false;}
        if(curPiece.getPieceColor().equals(destination.getPieceColor())) {return false;}

        switch (curPiece.getPieceType())
        {
            case "p":
                if(curPiece.isWhite())
                {
                    //white
                    if(sCol == eCol && eRow == sRow-1)
                    {
                        return true;
                    }
                } else {
                    //black
                    if(sCol == eCol && eRow == sRow+1)
                    {
                        return true;
                    }
                }

            case "r":
                return canRookMove(sRow, sCol, eRow, eCol);    
            case "kn": 
                if((rAbs == 2 && cAbs == 1) || (rAbs == 1 && cAbs == 2))
                {
                    return true;
                }
            case "b":
                if(rAbs == cAbs)
                {
                    return canBishopMove(sRow, sCol, eRow, eCol);
                }    
            case "q":
                return (canRookMove(sRow, sCol, eRow, eCol) || canBishopMove(sRow, sCol, eRow, eCol));
            case "k":
                if(rAbs>1 || cAbs>1) {return false;}
                for(int r = 0; r < labels.length; r++)
                {
                    for(int c = 0; c < labels[0].length; c++)
                    {
                        if(r == sRow && c == sCol) {continue;}
                        if(!labels[r][c].getPieceType().equals("k"))
                        {
                            if(isLegalMove(r, c, eRow, eCol)) {return false;}
                        } else {
                            if((eRow <= r+1 && eRow >= r-1) && (eCol <= c+1 && eCol >= c-1)) {return false;}
                        }
                    }
                    
                }
                return true;
        }
        
        
        return false;
    }

    
    private void updatePane()
    {
        Container contentPane = getContentPane();
        GridLayout gridLayout = new GridLayout(8, 8);

        contentPane.setLayout(gridLayout);
        for (int r = 0; r < labels.length; r++) {
            for (int c = 0; c < labels[0].length; c++) {
                labels[r][c].set(r, c);
                contentPane.add(labels[r][c]);
            }
        } // contentPane
    }
    
    public void display() {
        setTitle("Chess board with unicode images");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addMouseListener(this);

        updatePane();
        
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

    public ChessLabel[][] getLabels() {
        return labels;
    }

    public void setLabels(ChessLabel[][] labels) {
        this.labels = labels;
    }

    public boolean isHeld() {
        return held;
    }

    public void setHeld(boolean held) {
        this.held = held;
    }

    public ChessLabel getHeldPiece() {
        return heldPiece;
    }

    public void setHeldPiece(ChessLabel heldPiece) {
        this.heldPiece = heldPiece;
    }

} // class Board
