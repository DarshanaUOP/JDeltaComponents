package com.deltaApps.components;

import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

public class JDeltaBadgeTest {
    @Test
    public void JDeltaButtonWithButtonType(){
        JFrame backFrame;
        JPanel backgroundPanel;
        JLabel nameLabel;
        JDeltaBadge jDeltaBadgeWithButton;

        backFrame = new JFrame();
        backgroundPanel = new JPanel(new FlowLayout());
        nameLabel = new JLabel("Testing button type");
        jDeltaBadgeWithButton = new JDeltaBadge("Test Badge","1",JDeltaBadge.PRIMARY_BUTTON);

        backgroundPanel.add(nameLabel);
        backgroundPanel.add(jDeltaBadgeWithButton);

        backFrame.add(backgroundPanel);
        backFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backFrame.setVisible(true);
        backFrame.setSize(500,300);
        backFrame.setEnabled(true);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
