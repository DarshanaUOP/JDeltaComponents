package com.deltaApps.colors;

import java.awt.*;

/**
 * This class created for define particular colors for JDelta UI Components
 * references : https://getbootstrap.com/docs/4.0/components/badge/
 */
public class JDeltaColor extends Color{

    /* Primary */
    public final static com.deltaApps.colors.JDeltaColor PRIMARY = new com.deltaApps.colors.JDeltaColor(0,123, 255);

    /* SECONDARY */
    public final static com.deltaApps.colors.JDeltaColor SECONDARY = new com.deltaApps.colors.JDeltaColor(108,117,125);

    /* SUCCESS */
    public final static com.deltaApps.colors.JDeltaColor SUCCESS = new com.deltaApps.colors.JDeltaColor(40,167,69);

    /* WARNING */
    public final static com.deltaApps.colors.JDeltaColor WARNING = new com.deltaApps.colors.JDeltaColor(255,193,7);

    /* DANGER */
    public final static com.deltaApps.colors.JDeltaColor DANGER = new com.deltaApps.colors.JDeltaColor(220,53,69);

    /* INFO */
    public final static com.deltaApps.colors.JDeltaColor INFO = new com.deltaApps.colors.JDeltaColor(23,162,184);

    /* LIGHT */
    public final static com.deltaApps.colors.JDeltaColor LIGHT = new com.deltaApps.colors.JDeltaColor(248,249,250);

    /* DARK */
    public final static com.deltaApps.colors.JDeltaColor DARK = new com.deltaApps.colors.JDeltaColor(25,58,64);

    public JDeltaColor(int r, int g, int b) {
        super(r, g, b);
    }
}
