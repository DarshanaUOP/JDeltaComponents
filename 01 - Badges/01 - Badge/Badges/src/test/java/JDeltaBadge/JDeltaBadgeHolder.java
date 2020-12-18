package JDeltaBadge;

import com.deltaApps.JDeltaBadge.JDeltaBadge;
import com.deltaApps.JDeltaColors.JDeltaColor;

import javax.swing.*;
import java.awt.*;

/**
 * Owner : Darshana Ariyarathna. 2020-12-11
 */
/*
* This Class is only for create holder for jDeltaBadge
*/
public class JDeltaBadgeHolder extends JFrame {
    /* get jDeltaBadge Component */
    private JDeltaBadge jDeltaBadgeNotification, jDeltaBadgeCustomSecondary;

    /* Constructor of the class */
    public JDeltaBadgeHolder(){
        setLayout(new FlowLayout());
        //TODO - Check methods coming from JPanel (Ex. add() method)

        jDeltaBadgeNotification = new JDeltaBadge("Notifications","2");
        add(jDeltaBadgeNotification);

        jDeltaBadgeCustomSecondary = new JDeltaBadge("Massages","50+", JDeltaColor.LIGHT,JDeltaColor.DANGER);
        add(jDeltaBadgeCustomSecondary);
    }
}
