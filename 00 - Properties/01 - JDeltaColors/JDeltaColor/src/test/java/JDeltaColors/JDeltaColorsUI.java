package JDeltaColors;

import javax.swing.*;
import java.awt.*;

public class JDeltaColorsUI extends JFrame {
    com.deltaApps.colors.JDeltaColor jDeltaColor;

    JPanel panLeft,panTop,panRight,panSouth;

    public JDeltaColorsUI(){
        setLayout(new BorderLayout());

        panLeft = new JPanel();
        panLeft.setBackground(jDeltaColor.WARNING);
        add(panLeft,BorderLayout.WEST);
    }
}
