package com.deltaApps;

import javax.swing.*;

public class JDeltaBadge extends JPanel {
    /* to keep primary and secondary values */
    private String primaryText,secondaryText;
    /* labels for append tests */
    private JLabel primaryLabel,secondaryLabel;

    /* This is the constructor of the class, it needs primary text and secondary test */
    public JDeltaBadge(String primaryText,String secondaryText){
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;

        
    }
}
