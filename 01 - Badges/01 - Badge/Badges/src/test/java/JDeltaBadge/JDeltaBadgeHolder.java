package JDeltaBadge;

import com.deltaApps.JDeltaBadge.JDeltaBadge;
import com.deltaApps.JDeltaColors.JDeltaColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Owner : Darshana Ariyarathna. 2020-12-11
 */
/*
* This Class is only for create holder for jDeltaBadge
*/
public class JDeltaBadgeHolder extends JFrame {
    /* get jDeltaBadge Component */
    private JDeltaBadge jDeltaBadgeNotification, jDeltaBadgeCustomSecondary;

    int clickCount = 0 ;
    /* Constructor of the class */
    public JDeltaBadgeHolder(){
        setLayout(new FlowLayout());
        //TODO - Check methods coming from JPanel (Ex. add() method)

        jDeltaBadgeNotification = new JDeltaBadge("Notifications","2");
        jDeltaBadgeNotification.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jDeltaBadgeNotification.setPrimaryBackgroundColor(JDeltaColor.DANGER);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jDeltaBadgeNotification.setPrimaryBackgroundColor(JDeltaColor.WARNING);
            }
        });
        add(jDeltaBadgeNotification);

        jDeltaBadgeCustomSecondary = new JDeltaBadge("Massages","50+", JDeltaColor.LIGHT,JDeltaColor.DANGER);
        jDeltaBadgeCustomSecondary.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount++;
                jDeltaBadgeCustomSecondary.setPrimaryText("Clicked");
                jDeltaBadgeCustomSecondary.setSecondaryText(clickCount);
            }

        });
        add(jDeltaBadgeCustomSecondary);

    }
}
