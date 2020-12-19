package com.deltaApps.JDeltaBadge;

import com.deltaApps.JDeltaColors.JDeltaColor;
import com.deltaApps.JDeltaFont.JDeltaFonts;

import javax.swing.*;
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
                       boolean rounded /* TODO - Implement this  */
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
        /** Change label properties */
        /* set font for labels */
        primaryLabel.setFont(primaryFont);
        secondaryLabel.setFont(secondaryFont);
        /* set label colors */
        primaryLabel.setForeground(primaryForegroundColor);
        secondaryLabel.setForeground(secondaryForegroundColor);

        /** Change panel properties */
        /* set colors for components */
        primaryPanel.setBackground(primaryBackgroundColor);
        setBackground(primaryBackgroundColor);  /* set all other background  */
        secondaryPanel.setBackground(secondaryBackgroundColor);

        /* add text appended labels into panels */
        primaryPanel.add(primaryLabel);
        secondaryPanel.add(secondaryLabel);

        add(primaryPanel);

        add(secondaryPanel);

        /* change this JDeltaBadge background color */
        setBackground(primaryBackgroundColor);
    }

    /* ----------------- getters and setters ----------------- */

    /* 1. getters and setters for JDeltaBadge panel & primary panel */
    /**
     * Get background color of the JDeltaBadge
     * @return background color
     */
    public JDeltaColor getBackgroundColor(){
        return (JDeltaColor) super.getBackground();
    }

    /**
     * Set background color of the JDeltaBadge
     * @param backgroundColor New background color of the JDeltaBadge
     */
    public void setBackgroundColor(JDeltaColor backgroundColor){
        this.setBackground((Color) backgroundColor);
        this.primaryPanel.setBackground((Color) backgroundColor);
    }

    /* 2. getters and setters for JDeltaBadge's Secondary label */
    /**
     * get secondary text from the jDeltaBadge
     * @return secondary text of the jDeltaBadge
     */
    public String getSecondaryText() {
        return this.secondaryLabel.getText();
    }

    /**
     * Can update your jDeltaButton's secondary text
     * @param secondaryText New secondary text
     */
    public void setSecondaryText(String secondaryText) {
        this.secondaryLabel.setText(secondaryText);
    }

    /**
     * Can update your jDeltaButton's secondary text
     * @param amount New secondary amount
     */
    public void setSecondaryText(int amount) {
        this.secondaryLabel.setText(String.valueOf(amount));
    }

    /**
     * get secondary's foreground color
     * @return secondary's foreground color
     */
    public JDeltaColor getSecondaryForegroundColor(){
        return (JDeltaColor) this.secondaryLabel.getForeground();
    }

    /**
     * this will update your secondary foreground color
     * @param primaryForegroundColor new secondary foreground color
     */
    public void setSecondaryForegroundColor(JDeltaColor primaryForegroundColor){
        this.secondaryLabel.setForeground((Color) primaryForegroundColor);
    }

    /**
     * this will get secondary's font object
     * @return secondary's font object
     */
    public JDeltaFonts getSecondaryFont(){
        return (JDeltaFonts) secondaryLabel.getFont();
    }

    /**
     * this will set secondary's font object
     * @param font new font for secondary
     */
    public void setSecondaryFont(JDeltaFonts font){
        this.secondaryLabel.setFont((Font) font);
    }

    /* 3 . getters and setters for JDeltaBadge's Secondary panel */
    /**
     * get Secondary's background color
     * @return Secondary's background color
     */
    public JDeltaColor getSecondaryBackgroundColor(){
        return (JDeltaColor) this.secondaryPanel.getBackground();
    }

    /**
     * update Secondary's background color
     * @param primaryBackgroundColor Secondary's background color
     */
    public void setSecondaryBackgroundColor(JDeltaColor primaryBackgroundColor){
        this.secondaryPanel.setBackground((Color) primaryBackgroundColor);
    }

    /* 4 . getters and setters for JDeltaBadge's Primary label */
    /**
     * get primary text from the jDeltaBadge
     * @return primary text of the jDeltaBadge
     */
    public String getPrimaryText() {
        return primaryLabel.getText();
    }

    /**
     * Can update your jDeltaButton's primary text
     * @param primaryText New primary text
     */
    public void setPrimaryText(String primaryText) {
        this.primaryLabel.setText(primaryText);
    }

    /**
     * get primary's foreground color
     * @return primary's foreground color
     */
    public JDeltaColor getPrimaryForegroundColor(){
        return (JDeltaColor) this.primaryLabel.getForeground();
    }

    /**
     * this will update your primary foreground color
     * @param primaryForegroundColor new primary foreground color
     */
    public void setPrimaryForegroundColor(JDeltaColor primaryForegroundColor){
        this.primaryLabel.setForeground((Color) primaryForegroundColor);
    }

    /**
     * get primary's background font
     * @return primary's background font
     */
    public JDeltaFonts getPrimaryBackgroundFont(){
        return (JDeltaFonts) this.primaryPanel.getFont();
    }

    /**
     * update primary's background font
     * @param primaryBackgroundFont primary's background font
     */
    public void setPrimaryBackgroundFont(JDeltaFonts primaryBackgroundFont){
        this.primaryPanel.setFont((Font) primaryBackgroundFont);
    }

}
