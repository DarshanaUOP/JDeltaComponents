package com.deltaApps;

import javax.swing.*;
/*
* This Class is only for create holder for jDeltaBadge
*/
public class JDeltaBadgeHolder extends JFrame {
    /* Constructor of the class */
    private JDeltaBadge myJDeltaBadge;
    public JDeltaBadgeHolder(){
        myJDeltaBadge = new JDeltaBadge("Sample","New");
        add(myJDeltaBadge);
    }
}
