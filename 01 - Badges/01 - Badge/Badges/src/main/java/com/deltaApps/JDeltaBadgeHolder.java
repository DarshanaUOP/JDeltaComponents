package com.deltaApps;

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
        myJDeltaBadge = new JDeltaBadge("Sample","New");
        add(myJDeltaBadge);

        jDeltaBadge2 = new JDeltaBadge("Notifications","4");
        add(jDeltaBadge2);
    }
}
