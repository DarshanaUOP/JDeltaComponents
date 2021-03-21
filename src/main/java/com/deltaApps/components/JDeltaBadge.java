package com.deltaApps.components;

import com.deltaApps.utils.JDeltaColors;
import com.deltaApps.utils.JDeltaFonts;

import javax.swing.*;
import java.awt.*;

/**
 * Owner : Darshana Ariyarathna. Created 2020-12-11
 */

/**
 * File history
 * 2020-12-11   - Initially created - Darshana Ariyarathna
 * 2021-03-20   - Change structure of the project, copy and paste file from the old structure
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
     * No argument constructor
     * @since v1.0.0
     */
    public JDeltaBadge(){
        this("","",JDeltaColors.LIGHT,JDeltaColors.DARK,JDeltaFonts.JDELTA_FONTS_ARIAL_S,
                JDeltaColors.DARK,JDeltaColors.LIGHT,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /**
     * This will create a basic components with light primary background and dark primary fonts
     * with a dark secondary fonts and light secondary background
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as secondary text
     * @since v1.0.0
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText){
        this(primaryText,secondaryText,JDeltaColors.LIGHT,JDeltaColors.DARK,JDeltaFonts.JDELTA_FONTS_ARIAL_S,
                JDeltaColors.DARK,JDeltaColors.LIGHT,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /**
     * This will create a basic components with light primary background and dark primary fonts
     * with a dark secondary fonts and light secondary background
     * @param primaryText Text to write as primary text
     * @param amount A integer number to write as secondary text
     * @since v1.0.0
     */
    public JDeltaBadge(String primaryText,
                       int amount){
        this(primaryText,String.valueOf(amount),JDeltaColors.LIGHT,JDeltaColors.DARK,JDeltaFonts.JDELTA_FONTS_ARIAL_S,
                JDeltaColors.DARK,JDeltaColors.LIGHT,JDeltaFonts.JDELTA_FONTS_ARIAL_S,false);
    }

    /**
     * This will create a custom colored secondary badge
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as primary text
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryBackgroundColor Secondary background color
     * @since v1.0.0
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText,
                       JDeltaColors secondaryForegroundColor,
                       JDeltaColors secondaryBackgroundColor){
        this(primaryText,secondaryText,JDeltaColors.DARK,JDeltaColors.LIGHT,secondaryForegroundColor,secondaryBackgroundColor);
    }

    /**
     * This will create a custom colored secondary badge
     * @param primaryText Text to write as primary text
     * @param amount A integer number to write as secondary text
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryBackgroundColor Secondary background color
     * @since v1.0.0
     */
    public JDeltaBadge(String primaryText,
                       int amount,
                       JDeltaColors secondaryForegroundColor,
                       JDeltaColors secondaryBackgroundColor){
        this(primaryText,String.valueOf(amount),JDeltaColors.DARK,JDeltaColors.LIGHT,secondaryForegroundColor,secondaryBackgroundColor);
    }

    /**
     * You can create a more colorful badge
     * @param primaryText Text to write as primary text
     * @param secondaryText Text to write as secondary text
     * @param primaryForegroundColor Primary font color
     * @param primaryBackgroundColor Primary background color
     * @param secondaryForegroundColor Secondary font color
     * @param secondaryBackgroundColor Secondary background color
     * @since v1.0.0
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText,
                       JDeltaColors primaryForegroundColor,
                       JDeltaColors primaryBackgroundColor,
                       JDeltaColors secondaryForegroundColor,
                       JDeltaColors secondaryBackgroundColor){
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
     * @since v1.0.0
     */
    public JDeltaBadge(String primaryText,
                       String secondaryText,
                       JDeltaColors primaryBackgroundColor,
                       JDeltaColors primaryForegroundColor,
                       JDeltaFonts primaryFont,
                       JDeltaColors secondaryBackgroundColor,
                       JDeltaColors secondaryForegroundColor,
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
     * @since v1.0.0
     */
    public JDeltaColors getBackgroundColor(){
        return (JDeltaColors) super.getBackground();
    }

    /**
     * Set background color of the JDeltaBadge
     * @param backgroundColor New background color of the JDeltaBadge
     * @since v1.0.0
     */
    public void setBackgroundColor(JDeltaColors backgroundColor){
        this.setBackground((Color) backgroundColor);
        this.primaryPanel.setBackground((Color) backgroundColor);
    }

    /* 2. getters and setters for JDeltaBadge's Secondary label */
    /**
     * get secondary text from the jDeltaBadge
     * @return secondary text of the jDeltaBadge
     * @since v1.0.0
     */
    public String getSecondaryText() {
        return this.secondaryLabel.getText();
    }

    /**
     * Can update your jDeltaButton's secondary text
     * @param secondaryText New secondary text
     * @since v1.0.0
     */
    public void setSecondaryText(String secondaryText) {
        this.secondaryLabel.setText(secondaryText);
    }

    /**
     * Can update your jDeltaButton's secondary text
     * @param amount New secondary amount
     * @since v1.0.0
     */
    public void setSecondaryText(int amount) {
        this.secondaryLabel.setText(String.valueOf(amount));
    }

    /**
     * get secondary's foreground color
     * @return secondary's foreground color
     * @since v1.0.0
     */
    public JDeltaColors getSecondaryForegroundColor(){
        return (JDeltaColors) this.secondaryLabel.getForeground();
    }

    /**
     * this will update your secondary foreground color
     * @param primaryForegroundColor new secondary foreground color
     * @since v1.0.0
     */
    public void setSecondaryForegroundColor(JDeltaColors primaryForegroundColor){
        this.secondaryLabel.setForeground((Color) primaryForegroundColor);
    }

    /**
     * this will get secondary's font object
     * @return secondary's font object
     * @since v1.0.0
     */
    public JDeltaFonts getSecondaryFont(){
        return (JDeltaFonts) secondaryLabel.getFont();
    }

    /**
     * this will set secondary's font object
     * @param font new font for secondary
     * @since v1.0.0
     */
    public void setSecondaryFont(JDeltaFonts font){
        this.secondaryLabel.setFont((Font) font);
    }

    /* 3 . getters and setters for JDeltaBadge's Secondary panel */
    /**
     * get Secondary's background color
     * @return Secondary's background color
     * @since v1.0.0
     */
    public JDeltaColors getSecondaryBackgroundColor(){
        return (JDeltaColors) this.secondaryPanel.getBackground();
    }

    /**
     * update Secondary's background color
     * @param primaryBackgroundColor Secondary's background color
     * @since v1.0.0
     */
    public void setSecondaryBackgroundColor(JDeltaColors primaryBackgroundColor){
        this.secondaryPanel.setBackground((Color) primaryBackgroundColor);
    }

    /* 4 . getters and setters for JDeltaBadge's Primary label */
    /**
     * get primary text from the jDeltaBadge
     * @return primary text of the jDeltaBadge
     * @since v1.0.0
     */
    public String getPrimaryText() {
        return primaryLabel.getText();
    }

    /**
     * Can update your jDeltaButton's primary text
     * @param primaryText New primary text
     * @since v1.0.0
     */
    public void setPrimaryText(String primaryText) {
        this.primaryLabel.setText(primaryText);
    }

    /**
     * get primary's foreground color
     * @return primary's foreground color
     * @since v1.0.0
     */
    public JDeltaColors getPrimaryForegroundColor(){
        return (JDeltaColors) this.primaryLabel.getForeground();
    }

    /**
     * this will update your primary foreground color
     * @param primaryForegroundColor new primary foreground color
     * @since v1.0.0
     */
    public void setPrimaryForegroundColor(JDeltaColors primaryForegroundColor){
        this.primaryLabel.setForeground((Color) primaryForegroundColor);
    }

    /**
     * get primary's font
     * @return primary's font
     * @since v1.0.0
     */
    public JDeltaFonts getPrimaryFont(){
        return (JDeltaFonts) this.primaryPanel.getFont();
    }

    /**
     * update primary's font
     * @param primaryFont primary's font
     * @since v1.0.0
     */
    public void setPrimaryFont(JDeltaFonts primaryFont){
        this.primaryPanel.setFont((Font) primaryFont);
    }
}