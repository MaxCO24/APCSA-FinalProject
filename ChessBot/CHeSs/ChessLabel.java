package CHeSs;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ChessLabel extends JLabel implements MouseListener, MouseMotionListener {

    Font font = new Font("Ariel", Font.PLAIN, 72);
    Color bgLight = new Color(222, 184, 135);
    Color bgDark = new Color(139, 69, 19);

    ChessLabel(String s) {
        super(s);
    }

    void set(int idx, int row) {
      setFont(font);
          setOpaque(true);
          setBackground((idx+row)%2 == 0 ? bgDark : bgLight);
          setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

}
