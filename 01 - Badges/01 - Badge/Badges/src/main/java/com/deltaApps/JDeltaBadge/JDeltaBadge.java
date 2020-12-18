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

    /* GridBag Constraints */
    GridBagConstraints gb = new GridBagConstraints();

    /* This is the constructor of the class, it needs primary text and secondary test */

    

    /**
     * This will create a basic components with light primary background and dark primary fonts
     * with a dark secondary fonts and light secondary background
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as secondary text
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText){
        this(primaryText,secondaryText,JDeltaColor.LIGHT,JDeltaColor.DARK,JDeltaFonts.JDELTA_FONTS_ARIAL_S,
                JDeltaColor.DARK,JDeltaColor.LIGHT,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /**
     * This will create a basic components with light primary background and dark primary fonts
     * with a dark secondary fonts and light secondary background
     * @param primaryText Text to write as primary text
     * @param amount A integer number to write as secondary text
     */
    public JDeltaBadge(String primaryText,
                       int amount){
        this(primaryText,String.valueOf(amount),JDeltaColor.LIGHT,JDeltaColor.DARK,JDeltaFonts.JDELTA_FONTS_ARIAL_S,
                JDeltaColor.DARK,JDeltaColor.LIGHT,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /**
     * This will create a custom colored secondary badge
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as primary text
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryBackgroundColor Secondary background color
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText,
                       JDeltaColor secondaryForegroundColor,
                       JDeltaColor secondaryBackgroundColor){
        this(primaryText,secondaryText,JDeltaColor.DARK,JDeltaColor.LIGHT,secondaryForegroundColor,secondaryBackgroundColor);
    }

    /**
     * This will create a custom colored secondary badge
     * @param primaryText Text to write as primary text
     * @param amount A integer number to write as secondary text
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryBackgroundColor Secondary background color
     */
    public JDeltaBadge(String primaryText,
                       int amount,
                       JDeltaColor secondaryForegroundColor,
                       JDeltaColor secondaryBackgroundColor){
        this(primaryText,String.valueOf(amount),JDeltaColor.DARK,JDeltaColor.LIGHT,secondaryForegroundColor,secondaryBackgroundColor);
    }

    /**
     * You can create a more colorful badge
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as secondary text
     * @param primaryForegroundColor Primary font color
     * @param primaryBackgroundColor Primary background color
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryBackgroundColor Secondary background color
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText,
                       JDeltaColor primaryForegroundColor,
                       JDeltaColor primaryBackgroundColor,
                       JDeltaColor secondaryForegroundColor,
                       JDeltaColor secondaryBackgroundColor){
        this(primaryText,secondaryText,primaryBackgroundColor,primaryForegroundColor,JDeltaFonts.JDELTA_FONTS_ARIAL_S,
                secondaryBackgroundColor,secondaryForegroundColor,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /**
     * This will create a full flexible JDeltaButton for the user
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as secondary text
     * @param primaryBackgroundColor Primary font color
     * @param primaryForegroundColor Primary font color
     * @param primaryFont Primary font specifications
     * @param secondaryBackgroundColor Secondary background color
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryFont Secondary font specifications
     * @param rounded is the JDeltaButton round in shape or not
     */
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
