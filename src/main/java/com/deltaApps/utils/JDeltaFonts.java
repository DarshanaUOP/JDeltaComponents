package com.deltaApps.utils;

import java.awt.*;

/**
 * File history
 * 2020-12-11   - Initially created - Darshana Ariyarathna
 * 2021-03-20   - Change structure of the project, copy and paste file from the old structure
 */

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

    /**
     * Creates jDeltaFont object by using jdk's Font class
     * @param name font name
     * @param style font style
     * @param size font size
     * @since v1.0.0
     */
    public JDeltaFonts(String name, int style, int size) {
        super(name, style, size);
    }
}