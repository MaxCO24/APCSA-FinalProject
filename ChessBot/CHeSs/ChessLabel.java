package CHeSs;

import java.awt.*;
import javax.swing.*;

public class ChessLabel extends JLabel {
    Font f = new Font("Ariel", Font.PLAIN, 90);
    Color bgLight = new Color(222, 184, 135);
    Color bgDark = new Color(139, 69, 19);

    ChessLabel(String s) {
        super(s);
    }

    void set(int idx, int row) {
        setFont(f);
        setOpaque(true);
        setBackground((idx+row)%2 == 0 ? bgDark : bgLight);
        setHorizontalAlignment(SwingConstants.CENTER);
    }
}
