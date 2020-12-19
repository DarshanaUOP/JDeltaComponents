package JDeltaBadge;

import javax.swing.*;

/**
 * Owner : Darshana Ariyarathna. 2020-12-11
 */
public class Run_JDeltaBadge {
    public static void main(String[] args) {
        JDeltaBadgeHolder jDeltaBadgeHolder = new JDeltaBadgeHolder();
        jDeltaBadgeHolder.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jDeltaBadgeHolder.setEnabled(true);
        jDeltaBadgeHolder.setVisible(true);
        jDeltaBadgeHolder.setTitle("JDeltaBadge Test panel");
        jDeltaBadgeHolder.setSize(600,500);
    }
}
