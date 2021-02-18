package com.deltaApps.utils.JDeltaColors;

import java.awt.*;

/**
 * This class created for define particular colors for JDelta UI Components
 * references : https://getbootstrap.com/docs/4.0/components/badge/
 */
public class JDeltaColor extends Color{

    /* PRIMARY */
    public final static JDeltaColor PRIMARY = new JDeltaColor(0,123, 255);

    /* SECONDARY */
    public final static JDeltaColor SECONDARY = new JDeltaColor(108,117,125);

    /* SUCCESS */
    public final static JDeltaColor SUCCESS = new JDeltaColor(40,167,69);

    /* WARNING */
    public final static JDeltaColor WARNING = new JDeltaColor(255,193,7);

    /* DANGER */
    public final static JDeltaColor DANGER = new JDeltaColor(220,53,69);

    /* INFO */
    public final static JDeltaColor INFO = new JDeltaColor(23,162,184);

    /* LIGHT */
    public final static JDeltaColor LIGHT = new JDeltaColor(248,249,250);

    /* DARK */
    public final static JDeltaColor DARK = new JDeltaColor(25,58,64);

    public JDeltaColor(int r, int g, int b) {
        super(r, g, b);
    }
}
