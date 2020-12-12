package JDeltaColors;

import com.deltaApps.JDeltaColors.JDeltaColor;

import javax.swing.*;
import java.awt.*;

public class JDeltaColorsUI extends JFrame {
    JDeltaColor jDeltaColor;

    JPanel panLeft,panTop,panRight,panSouth;
    JPanel middlePan;
    JPanel midpanLeft,midpanTop,midpanRight,midpanSouth;

    public JDeltaColorsUI(){
        setLayout(new BorderLayout());

        /* panLeft with PRIMARY color */
        panLeft = new JPanel();
        panLeft.setBackground(jDeltaColor.PRIMARY);
        add(panLeft,BorderLayout.WEST);

        /* panTop with SECONDARY color */
        panTop = new JPanel();
        panTop.setBackground(jDeltaColor.SECONDARY);
        add(panTop,BorderLayout.NORTH);

        /* panRight with SUCCESS color */
        panRight = new JPanel();
        panRight.setBackground(jDeltaColor.SUCCESS);
        add(panRight,BorderLayout.EAST);

        /* panSouth with SUCCESS color */
        panSouth = new JPanel();
        panSouth.setBackground(jDeltaColor.DANGER);
        add(panSouth,BorderLayout.SOUTH);

        /* add a middle panel */
        middlePan = new JPanel(new BorderLayout());
        add(middlePan,BorderLayout.CENTER);

        /* midpanLeft with WARNING color */
        midpanLeft = new JPanel();
        midpanLeft.setBackground(jDeltaColor.WARNING);
        middlePan.add(midpanLeft,BorderLayout.WEST);

        /* midpanLeft with INFO color */
        midpanTop = new JPanel();
        midpanTop.setBackground(jDeltaColor.INFO);
        middlePan.add(midpanTop,BorderLayout.NORTH);

        /* midpanRight with INFO color */
        midpanRight = new JPanel();
        midpanRight.setBackground(jDeltaColor.LIGHT);
        middlePan.add(midpanRight,BorderLayout.EAST);

        /* midpanRight with INFO color */
        midpanSouth = new JPanel();
        midpanSouth.setBackground(jDeltaColor.DARK);
        middlePan.add(midpanSouth,BorderLayout.CENTER);

    }
}
