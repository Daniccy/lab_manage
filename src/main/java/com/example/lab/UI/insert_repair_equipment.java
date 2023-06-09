package com.example.lab.UI;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class insert_repair_equipment {
    static JFrame frame = new JFrame("insert_repair_equipment");
    private JPanel root;
    private JPanel panel1;
    private JTextField user_id;
    private JTextField break_id;
    private JButton exit;
    private JButton sure;

    public insert_repair_equipment() {
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
            }
        });
        sure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (break_id.getText().equals("")) {
                    //错误处理
                } else {
                    String userid = user_id.getText();
                    int breakid = Integer.parseInt(break_id.getText());
                    System.out.println(userid + breakid);
                }
                closepage();
            }
        });
    }

    public void init() {
        frame.setContentPane(new insert_repair_equipment().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1000, 600, 800, 400);
        frame.pack();
        frame.setVisible(true);
    }

    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {
        new insert_repair_equipment().init();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        root = new JPanel();
        root.setLayout(new FormLayout("fill:53px:noGrow,left:36dlu:noGrow,left:168dlu:noGrow,fill:max(d;4px):noGrow,left:139dlu:noGrow,fill:max(d;4px):noGrow,fill:d:grow", "center:45px:noGrow,top:28dlu:noGrow,center:230px:grow"));
        root.setForeground(new Color(-4272661));
        panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:68dlu:noGrow,left:50dlu:noGrow,left:103dlu:noGrow,fill:93px:noGrow,left:69dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:22dlu:noGrow,top:28dlu:noGrow,center:67px:noGrow,center:61px:noGrow,top:31dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        panel1.setForeground(new Color(-5922902));
        CellConstraints cc = new CellConstraints();
        root.add(panel1, cc.xywh(1, 1, 5, 3));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-4928789));
        label1.setText("Label");
        panel1.add(label1, cc.xy(2, 1));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 26, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-3771247));
        label2.setText("损坏设备报修");
        panel1.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("报修人ID");
        panel1.add(label3, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("损坏表id");
        panel1.add(label4, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        break_id = new JTextField();
        panel1.add(break_id, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.CENTER));
        user_id = new JTextField();
        panel1.add(user_id, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        exit = new JButton();
        exit.setText("返回");
        panel1.add(exit, cc.xy(5, 5, CellConstraints.LEFT, CellConstraints.DEFAULT));
        sure = new JButton();
        sure.setText("确定");
        panel1.add(sure, cc.xy(3, 5, CellConstraints.RIGHT, CellConstraints.DEFAULT));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return root;
    }

}
