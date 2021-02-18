package com.deltaApps.JDeltaFont;

import java.awt.*;

public class JDeltaFonts extends Font {
    /* FONT SIZES */
    public static int SMALL = 15;
    public static int MEDIUM = 25;
    public static int LARGE = 40;

    /* PREDIFINED FONTS */
    public static final JDeltaFonts JDELTA_FONTS_ARIAL_S = new JDeltaFonts("Arial",Font.PLAIN,SMALL);
    public static final JDeltaFonts JDELTA_FONTS_ARIAL_M = new JDeltaFonts("Arial",Font.PLAIN,MEDIUM);
    public static final JDeltaFonts JDELTA_FONTS_ARIAL_L = new JDeltaFonts("Arial",Font.PLAIN,LARGE);

    /* constructor overloading */


    /* Constructor */
    public JDeltaFonts(String name, int style, int size) {
        super(name, style, size);
    }
}