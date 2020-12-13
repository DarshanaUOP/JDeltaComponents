package com.deltaApps.JDeltaFont;

import java.awt.*;

public class JDeltaFonts extends Font {

    public static final JDeltaFonts JDELTA_FONTS_ARIAL_S = new JDeltaFonts("Arial",Font.PLAIN,15);
    public static final JDeltaFonts JDELTA_FONTS_ARIAL_M = new JDeltaFonts("Arial",Font.PLAIN,25);
    public static final JDeltaFonts JDELTA_FONTS_ARIAL_L = new JDeltaFonts("Arial",Font.PLAIN,40);

    public JDeltaFonts(String name, int style, int size) {
        super(name, style, size);
    }
}
