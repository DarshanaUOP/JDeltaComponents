package com.deltaApps.components;

import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

public class JDeltaBadgeTest {
    @Test
    public void JDeltaButtonWithButtonType(){
        JPanel backgroundPanel;
        JLabel nameLabel;
        JDeltaBadge jDeltaBadgeWithButton;

        backgroundPanel = new JPanel(new FlowLayout());
        nameLabel = new JLabel("Testing button type");
        jDeltaBadgeWithButton = new JDeltaBadge("Test Badge","1",JDeltaBadge.PRIMARY_BUTTON)
    }
}
