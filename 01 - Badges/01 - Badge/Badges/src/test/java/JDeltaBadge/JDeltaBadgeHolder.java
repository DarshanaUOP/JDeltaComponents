package JDeltaBadge;

import com.deltaApps.JDeltaBadge.JDeltaBadge;
import com.deltaApps.JDeltaColors.JDeltaColor;
import com.deltaApps.JDeltaFont.JDeltaFonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.lang.Thread.sleep;

/**
 * Owner : Darshana Ariyarathna. 2020-12-11
 */
/*
* This Class is only for create holder for jDeltaBadge
*/
public class JDeltaBadgeHolder<intArray> extends JFrame {
    /* get jDeltaBadge Component */
    private JDeltaBadge jDeltaBadgeNotification, jDeltaBadgeCustomSecondary;

    /* for test get/set properties */
    private JPanel testPanel,topPanel;
    private JLabel outputLabel,instructionLabel;
    GridBagConstraints gb =  new GridBagConstraints();
    private JDeltaBadge firstTestBadge,secondTestBadge;

    int clickCount = 0 ;
    int testCase = 0;

    JDeltaColor itemColor = JDeltaColor.LIGHT;
    JDeltaFonts itemFont = JDeltaFonts.JDELTA_FONTS_ARIAL_S;
    int[] testArray = new int[20];
    /* Constructor of the class */
    public JDeltaBadgeHolder(){
        setLayout(new BorderLayout());
        //TODO - Check methods coming from JPanel (Ex. add() method)

        topPanel = new JPanel(new FlowLayout());
        jDeltaBadgeNotification = new JDeltaBadge("Notifications","2");
        jDeltaBadgeNotification.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jDeltaBadgeNotification.setBackgroundColor(JDeltaColor.DANGER);
                jDeltaBadgeNotification.setSecondaryBackgroundColor(JDeltaColor.SECONDARY);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jDeltaBadgeNotification.setBackgroundColor(JDeltaColor.WARNING);
                jDeltaBadgeNotification.setSecondaryBackgroundColor(JDeltaColor.INFO);
            }
        });
        topPanel.add(jDeltaBadgeNotification);

        jDeltaBadgeCustomSecondary = new JDeltaBadge("Massages","50+", JDeltaColor.LIGHT,JDeltaColor.DANGER);
        jDeltaBadgeCustomSecondary.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount++;
                jDeltaBadgeCustomSecondary.setPrimaryText("Clicked");
                jDeltaBadgeCustomSecondary.setSecondaryText(clickCount);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jDeltaBadgeCustomSecondary.setVisible(false);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jDeltaBadgeCustomSecondary.setVisible(true);
            }
        });
        topPanel.add(jDeltaBadgeCustomSecondary);

        add(topPanel,BorderLayout.NORTH);

        /* test get/set properties */
        testPanel = new JPanel(new GridBagLayout());
        outputLabel = new JLabel("Output label");
        firstTestBadge = new JDeltaBadge("JDeltaBadge","New");
        firstTestBadge.setBackgroundColor(JDeltaColor.PRIMARY);
        firstTestBadge.setPrimaryForegroundColor(JDeltaColor.LIGHT);
        firstTestBadge.setSecondaryBackgroundColor(JDeltaColor.LIGHT);
        firstTestBadge.setSecondaryForegroundColor(JDeltaColor.PRIMARY);

        secondTestBadge = new JDeltaBadge("badge 2","new");
        instructionLabel = new JLabel("Instructions Label");

        gb.gridx = 0;
        gb.gridy = 0;
        gb.weightx = 2;
        gb.weighty = 1;
        testPanel.add(instructionLabel,gb);

        gb.gridy = 1;
        gb.weightx = 1;
        testPanel.add(firstTestBadge,gb);

        gb.gridx = 1;
        testPanel.add(secondTestBadge,gb);

        gb.gridx = 0;
        gb.gridy = 2;
        gb.weightx = 2;
        testPanel.add(outputLabel,gb);

        add(testPanel,BorderLayout.CENTER);

        firstTestBadge.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switch (testCase){
                    case 0: /* set/get background */
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                instructionLabel.setText("Executing : setBackgroundColor");
                            }
                        }).run();
//                        instructionLabel.setText("Executing : setBackgroundColor");
                        waitToRead();
                        secondTestBadge.setBackground(JDeltaColor.WARNING);
                        waitToRead();
                        itemColor = secondTestBadge.getBackgroundColor();
                        if(itemColor != JDeltaColor.WARNING){
                            System.out.println("Error : color set to item is not returned back");
                            testArray[testCase] = 1;
                        }else {
                            System.out.println();
                            testArray[testCase] = 0;
                        }
                        break;

                    case 1:

                        break;
                }
                testCase++;
            }
        });
    }

    public void waitToRead(){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
