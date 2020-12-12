package com.deltaApps.colors;

import java.awt.*;

/**
 * This class created for define particular colors for JDelta UI Components
 * references : https://getbootstrap.com/docs/4.0/components/badge/
 */
public class JDeltaColors extends Color{

    /* Primary */
    public final static JDeltaColors PRIMARY = new JDeltaColors(0,123, 255);

    /* INDIGO */
    public final static JDeltaColors INDIGO = new JDeltaColors(108,117,125);

    /* SUCCESS */
    public final static JDeltaColors SUCCESS = new JDeltaColors(40,167,69);

    /* WARNING */
    public final static JDeltaColors WARNING = new JDeltaColors(255,193,7);

    /* DANGER */
    public final static JDeltaColors DANGER = new JDeltaColors(220,53,69);

    /* INFO */
    public final static JDeltaColors INFO = new JDeltaColors(23,162,184);

    /* LIGHT */
    public final static JDeltaColors LIGHT = new JDeltaColors(248,249,250);

    /* DARK */
    public final static JDeltaColors DARK = new JDeltaColors(25,58,64);

    public JDeltaColors(int r, int g, int b) {
        super(r, g, b);
    }
}
