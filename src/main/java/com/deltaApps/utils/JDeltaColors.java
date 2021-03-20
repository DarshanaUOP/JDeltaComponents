package com.deltaApps.utils;
import java.awt.*;

/**
 * This class created for define particular colors for JDelta UI Components
 * references : https://getbootstrap.com/docs/4.0/components/badge/
 */

/**
 * File history
 * 2020-12-11   - Initially created - Darshana Ariyarathna
 * 2021-03-20   - Change structure of the project, copy and paste file from the old structure
 */
public class JDeltaColors extends Color{

    /* PRIMARY */
    public final static JDeltaColors PRIMARY = new JDeltaColors(0,123, 255);

    /* SECONDARY */
    public final static JDeltaColors SECONDARY = new JDeltaColors(108,117,125);

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

    /**
     * @brief   This is the main constructor of this jDeltaColor project
     * @param r amount of red color
     * @param g amount of green color
     * @param b amount of blue color
     * @return  a jDeltaColor object
     * @since v1.0.0
     */
    public JDeltaColors(int r, int g, int b) {
        super(r, g, b);
    }
}