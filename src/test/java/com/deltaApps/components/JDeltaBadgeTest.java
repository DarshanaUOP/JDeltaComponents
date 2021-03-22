package com.deltaApps.components;

import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

public class JDeltaBadgeTest {
    /**
     * JDeltaBadge viewer for use in all test cases in case of visual inspection
     */
    JDeltaButtonViewer jDeltaBadgeViewer = new JDeltaButtonViewer();

    /**
     * Testing constructor 1
     */
    @Test
    public void TestJDeltaBadgeConstructor1(){
        JDeltaBadge jDeltaBadge = new JDeltaBadge();
        jDeltaBadgeViewer.showBadge();

        jDeltaBadge.setPrimaryText("Primary text");
        jDeltaBadgeViewer.setBadgeName("Badge 2");
        jDeltaBadgeViewer.setJDeltaBadgeObj(jDeltaBadge);
        jDeltaBadgeViewer.showBadge();

    }
}

class JDeltaButtonViewer extends JFrame{
    /**
     * This class is for display jDeltaBadges which is created by particular test cases.
     * by using this, tester can visually inspect his implementation
     */
    private JPanel backgroundPanel;
    private JLabel nameLabel = new JLabel();
    private JDeltaBadge jDeltaBadgeObj;

    /**
     * Default constructor of the JDeltaButtonViewer
     * @since v1.0.1
     */
    public JDeltaButtonViewer(){
        this("",null);
    }

    /**
     * Detailed constructor of the JDeltaButtonViewer
     * @param badgeName Name of the badge
     * @param badge Created JDeltaBadge by the test
     * @since v1.0.1
     */
    public JDeltaButtonViewer(String badgeName,JDeltaBadge badge){

        nameLabel.setText(badgeName);
        jDeltaBadgeObj = badge;

        backgroundPanel = new JPanel(new FlowLayout());

        backgroundPanel.add(nameLabel);
        backgroundPanel.add(jDeltaBadgeObj);

        add(backgroundPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /**
     * setter for the badge name
     * @param BadgeName
     * @since v1.0.1
     */
    public void setBadgeName(String BadgeName){
        this.nameLabel.setText(BadgeName);
    }

    /**
     * setter for the JDeltaBadge object
     * @param newJDeltaBadge jDeltaBadge for set in the viewer
     * @since v1.0.1
     */
    public void setJDeltaBadgeObj(JDeltaBadge newJDeltaBadge){
        this.jDeltaBadgeObj = newJDeltaBadge;
    }

    /**
     * This method is for show the JDeltaButtonViewer
     * @since v1.0.1
     */
    public void showBadge(){
        setVisible(true);
        setSize(500,300);
        setEnabled(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
