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
    private JDeltaBadge myJDeltaBadge,jDeltaBadge2;

    /* Constructor of the class */
    public JDeltaBadgeHolder(){
        setLayout(new FlowLayout());
        //TODO - Check methods coming from JPanel (Ex. add() method)
        myJDeltaBadge = new JDeltaBadge("Sample","New");
        add(myJDeltaBadge);

        jDeltaBadge2 = new JDeltaBadge("Notifications","4", JDeltaColor.WARNING);
        add(jDeltaBadge2);
    }
}
