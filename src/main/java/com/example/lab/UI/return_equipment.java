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

public class return_equipment {
    static JFrame frame = new JFrame("return_equipment");
    private JPanel panel1;
    private JButton exit;
    private JTextField borrow_id;
    private JPanel root;
    private JComboBox comboBox1;
    private JButton sure;

    public return_equipment() {
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
            }
        });
        sure.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String borrowid = borrow_id.getText();
                int damage = comboBox1.getSelectedIndex();//0为no，1为yes
                System.out.println(damage);
                closepage();
            }
        });
    }

    public void init() {
        frame.setContentPane(new return_equipment().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {
        new return_equipment().init();
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
        root.setLayout(new FormLayout("fill:d:grow", "center:d:grow"));
        panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:68dlu:noGrow,left:50dlu:noGrow,left:103dlu:noGrow,fill:93px:noGrow,left:69dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:27dlu:noGrow,center:28dlu:noGrow,center:28dlu:noGrow,center:max(d;4px):noGrow,top:51dlu:noGrow,top:12dlu:noGrow,center:max(d;4px):noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        panel1.setForeground(new Color(-5922902));
        CellConstraints cc = new CellConstraints();
        root.add(panel1, cc.xy(1, 1));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-4928789));
        label1.setText("Label");
        panel1.add(label1, cc.xy(2, 1));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 26, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-3771247));
        label2.setText("归还设备");
        panel1.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("是否损坏");
        panel1.add(label3, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        borrow_id = new JTextField();
        panel1.add(borrow_id, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("借用表ID");
        panel1.add(label4, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        comboBox1 = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("no");
        defaultComboBoxModel1.addElement("yes");
        comboBox1.setModel(defaultComboBoxModel1);
        comboBox1.setToolTipText("1\n2");
        panel1.add(comboBox1, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.DEFAULT));
        exit = new JButton();
        exit.setText("返回");
        panel1.add(exit, cc.xy(5, 6, CellConstraints.LEFT, CellConstraints.CENTER));
        sure = new JButton();
        sure.setText("确定");
        panel1.add(sure, cc.xy(3, 6, CellConstraints.RIGHT, CellConstraints.CENTER));
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
