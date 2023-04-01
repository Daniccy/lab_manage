package com.example.lab.UI;
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

public class user_brok_update {
    static JFrame frame = new JFrame("user_brok_update");
    private JTextField eq_name;
    private JTextField breakdown_id;
    private JTextField reason;
    private JTextField num;
    private JButton exit;
    private JButton 确定Button;
    private JPanel root;

    public user_brok_update() {
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_brok_eq().init();
            }
        });
        确定Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num.getText().equals("") || breakdown_id.getText().equals("")) {
                    /******错误弹窗调用***********/
                    JOptionPane.showMessageDialog(null, "填入数据不可为空");
                } else {
                    int breakid = Integer.parseInt(breakdown_id.getText());
                    String equipment_name = eq_name.getText();
                    String reasons = reason.getText();
                    int number = Integer.parseInt(num.getText());
                    Breakdown breakdown=new Breakdown();
                    breakdown.setBreakdownId(breakid);
                    breakdown.setEquipmentName(equipment_name);
                    breakdown.setApplyReason(reasons);
                    breakdown.setNum(number);
                    breakdownEquipmentController controller = (breakdownEquipmentController) ApplicationContextUtil.getBean("breakdownEquipmentController");
                    String info =controller.update(breakdown, Token.token).info;
                    if (info.equals("更新成功")){
                        closepage();
                        new user_brok_eq().init();
                        return;
                    }else{
                        /**************/
                        JOptionPane.showMessageDialog(null, info);
                    }
                }
            }
        });
    }

    public void init() {
        frame.setContentPane(new user_brok_update().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {
        new user_brok_update().init();
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
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:68dlu:noGrow,left:50dlu:noGrow,left:103dlu:noGrow,fill:93px:noGrow,left:69dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:22dlu:noGrow,top:28dlu:noGrow,center:28dlu:noGrow,center:28dlu:noGrow,center:49px:noGrow,top:30dlu:noGrow,center:23px:noGrow"));
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
        label2.setText("更新损坏设备信息");
        panel1.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("损坏表id");
        panel1.add(label3, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("设备名称");
        panel1.add(label4, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        eq_name = new JTextField();
        panel1.add(eq_name, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.CENTER));
        breakdown_id = new JTextField();
        panel1.add(breakdown_id, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-5409849));
        label5.setText("更新原因");
        panel1.add(label5, cc.xy(3, 5, CellConstraints.CENTER, CellConstraints.CENTER));
        reason = new JTextField();
        panel1.add(reason, cc.xy(4, 5, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-5409849));
        label6.setText("数量");
        panel1.add(label6, cc.xy(3, 6, CellConstraints.CENTER, CellConstraints.CENTER));
        num = new JTextField();
        panel1.add(num, cc.xy(4, 6, CellConstraints.FILL, CellConstraints.CENTER));
        exit = new JButton();
        exit.setText("返回");
        panel1.add(exit, cc.xy(5, 7, CellConstraints.LEFT, CellConstraints.CENTER));
        确定Button = new JButton();
        确定Button.setText("确定");
        panel1.add(确定Button, cc.xy(3, 7, CellConstraints.RIGHT, CellConstraints.CENTER));
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
