package com.deltaApps.JDeltaBadge;

import com.deltaApps.JDeltaColors.JDeltaColor;
import com.deltaApps.JDeltaFont.JDeltaFonts;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Owner : Darshana Ariyarathna. 2020-12-11
 */
public class JDeltaBadge extends JPanel {
    /* to keep primary and secondary values */
    private String primaryText,secondaryText;
    /* labels for append tests */
    private JLabel primaryLabel,secondaryLabel;
    /* jPanels for append labels */
    private JPanel primaryPanel,secondaryPanel;

    // TODO - Please get fonts from anywhere
    /** fonts for the badge */
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
    // TODO - Use Constructor chaining for different parameter case (Constructor overloading)

    /* C1 */

    /**
     * his will create a basic components with light primary background and dark primary fonts
     * with a dark secondary fonts and light secondary background
     * @param primaryText
     * @param secondaryText
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText){
        this(primaryText,secondaryText,JDeltaColor.LIGHT,JDeltaColor.DARK,JDeltaFonts.JDELTA_FONTS_ARIAL_S,JDeltaColor.DARK,JDeltaColor.LIGHT,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /* C11 */
    public JDeltaBadge(String primaryText,
                       String secondaryText,
                       JDeltaColor primaryBackgroundColor,
                       JDeltaColor primaryForegroundColor,
                       JDeltaFonts primaryFont,
                       JDeltaColor secondaryBackgroundColor,
                       JDeltaColor secondaryForegroundColor,
                       JDeltaFonts secondaryFont,
                       boolean rounded
                        ){
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
        primaryLabel.setFont(primaryFont);
        secondaryLabel.setFont(secondaryFont);
        /* set label colors */
        primaryLabel.setForeground(primaryForegroundColor);
        secondaryLabel.setForeground(secondaryForegroundColor);

        /** Change panel properties
         */
        /* set colors for components */
        primaryPanel.setBackground(primaryBackgroundColor);
        secondaryPanel.setBackground(secondaryBackgroundColor);

        /* add text appended labels into panels */
        primaryPanel.add(primaryLabel);
        secondaryPanel.add(secondaryLabel);

        add(primaryPanel);

        add(secondaryPanel);

        /* change this JDeltaBadge background color */
        setBackground(primaryBackgroundColor);
    }
}
