package com.deltaApps;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JDeltaBadge extends JPanel {
    /* to keep primary and secondary values */
    private String primaryText,secondaryText;
    /* labels for append tests */
    private JLabel primaryLabel,secondaryLabel;
    /* jPanels for append labels */
    private JPanel primaryPanel,secondaryPanel;

    // TODO - Please get fonts from anywhere
    /* fonts for the badge */
    private Font font = new Font("Arial",Font.PLAIN,40);
    private Font font2 = new Font("Arial",Font.BOLD,30);

    // TODO - Please get this colors from anywhere
    /* Color : Blue */
    private Color colorBlue = new Color(0,123,255);
    /* Color : white */
    private Color colorWhite = new Color(255,255,255);
    /* Color : black */
    private Color colorBlack = new Color(0,0,0);

    /* GridBag Constraints */
    GridBagConstraints gb = new GridBagConstraints();

    /* This is the constructor of the class, it needs primary text and secondary test */
    public JDeltaBadge(String primaryText,String secondaryText){
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;

        // TODO - Please change this layout later
        /* set layout as FlowLayout */
        //this.setLayout(new GridBagLayout());
        setLayout(new FlowLayout());

        /* create objects for panels */
        primaryPanel = new JPanel();
        secondaryPanel = new JPanel();

        /* create objects of labels */
        primaryLabel = new JLabel(primaryText);
        secondaryLabel = new JLabel(secondaryText);
        /** Change label properties
         */
        /* set font for labels */
        primaryLabel.setFont(font);
        secondaryLabel.setFont(font2);
        /* set label colors */
        primaryLabel.setForeground(colorWhite);
        secondaryLabel.setForeground(colorBlack);

        /** Change panel properties
         */
        /* set colors for components */
        primaryPanel.setBackground(colorBlue);
        secondaryPanel.setBackground(colorWhite);

        /* add text appended labels into panels */
        primaryPanel.add(primaryLabel);
        secondaryPanel.add(secondaryLabel);

        /* add panels to the badge panel */
        /* gb.gridx = 0;
        gb.gridy = 0;
        gb.gridwidth = 3;
        add(primaryPanel,gb); */  /* Adding primary panel */
        add(primaryPanel);

        /* gb.gridx = gb.gridwidth + 1;
        gb.gridy = 1;
        add(secondaryPanel,gb); */ /* Adding secondary panel */
        add(secondaryPanel);

        /* change this JDeltaBadge background color */
        this.setBackground(colorBlue);
        setBorder(new EmptyBorder(10, 10, 10, 10));
    }
}
