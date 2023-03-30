package com.example.lab.UI;

import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Controller.breakdownEquipmentController;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Util.ApplicationContextUtil;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class insert_breakdown_equipment {
    static JFrame frame = new JFrame("insert_breakdown_equipment");
    private JPanel root;
    private JButton 确定Button;
    private JTextField user_id;
    private JTextField eq_name;
    private JTextField num;
    private JTextField reason;
    private JButton exit;
    private JPanel panel1;

    String token;

    public insert_breakdown_equipment() {
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new breakdown_equipment().init();
            }
        });
        确定Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num.getText().equals("")) {
                    /******错误弹窗调用***********/
                } else {
                    String userID = user_id.getText();
                    String equipment_name = eq_name.getText();
                    String reasons = reason.getText();
                    int number = Integer.parseInt(num.getText());
                    Breakdown breakdown=new Breakdown();
                    breakdown.setApplyPerson(userID);
                    breakdown.setEquipmentName(equipment_name);
                    breakdown.setApplyReason(reasons);
                    breakdown.setNum(number);

                    breakdownEquipmentController controller = (breakdownEquipmentController) ApplicationContextUtil.getBean("breakdownEquipmentController");
                    String info =controller.add(breakdown, token).info;
                    if (info.equals("success")){
                        closepage();
                        new breakdown_equipment().init();
                        return;
                    }else{
                        /**************/
                    }
                }
                closepage();
            }
        });
    }

    public void init() {
        frame.setContentPane(new insert_breakdown_equipment().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1000, 600, 800, 400);
        frame.pack();
        frame.setVisible(true);
    }

    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {
        new insert_breakdown_equipment().init();
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
        root.setLayout(new FormLayout("fill:d:grow", "center:d:noGrow"));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:68dlu:noGrow,left:50dlu:noGrow,left:103dlu:noGrow,fill:93px:noGrow,left:69dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:10dlu:noGrow,top:28dlu:noGrow,center:28dlu:noGrow,center:28dlu:noGrow,top:28dlu:noGrow,center:61px:noGrow,top:25dlu:noGrow,center:max(d;4px):noGrow"));
        panel2.setBackground(new Color(-4272661));
        panel2.setForeground(new Color(-5922902));
        CellConstraints cc = new CellConstraints();
        root.add(panel2, cc.xy(1, 1));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-4928789));
        label1.setText("Label");
        panel2.add(label1, cc.xy(2, 1));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 26, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-3771247));
        label2.setText("提交损坏设备");
        panel2.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("申报人id");
        panel2.add(label3, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("设备名称");
        panel2.add(label4, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        eq_name = new JTextField();
        panel2.add(eq_name, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.CENTER));
        user_id = new JTextField();
        panel2.add(user_id, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-5409849));
        label5.setText("数量");
        panel2.add(label5, cc.xy(3, 5, CellConstraints.CENTER, CellConstraints.CENTER));
        num = new JTextField();
        panel2.add(num, cc.xy(4, 5, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-5409849));
        label6.setText("故障原因");
        panel2.add(label6, cc.xy(3, 6, CellConstraints.CENTER, CellConstraints.CENTER));
        reason = new JTextField();
        panel2.add(reason, cc.xy(4, 6, CellConstraints.FILL, CellConstraints.CENTER));
        exit = new JButton();
        exit.setText("返回");
        panel2.add(exit, cc.xy(5, 7, CellConstraints.LEFT, CellConstraints.DEFAULT));
        确定Button = new JButton();
        确定Button.setText("确定");
        panel2.add(确定Button, cc.xy(3, 7, CellConstraints.RIGHT, CellConstraints.DEFAULT));
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
