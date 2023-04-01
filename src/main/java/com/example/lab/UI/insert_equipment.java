package com.example.lab.UI;

import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Entity.Equipment;
import com.example.lab.Util.ApplicationContextUtil;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;

public class insert_equipment {
    static JFrame frame = new JFrame("insert_equipment");
    private JPanel panel1;
    private JTextField eq_type;
    private JTextField eq_name;
    private JButton sure_Button;
    private JPanel root;
    private JTextField num;
    private JTextField single_price;
    private JTextField from;
    private JTextField remakr;
    private JButton exit_Button;


    public insert_equipment() {
        exit_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new select_equipment().init();
            }
        });
        sure_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num.getText().equals("") || single_price.getText().equals("")) {
                    /******错误弹窗调用***********/
                    JOptionPane.showMessageDialog(null, "填入数据不可为空");
                } else {
                    String eqname = eq_name.getText();
                    String eqtype = eq_type.getText();
                    int number = Integer.parseInt(num.getText());
                    double price = Double.parseDouble(single_price.getText());
                    String where = from.getText();
                    String beizhu = remakr.getText();
                    Equipment equipment=new Equipment(eqname,eqtype,number,price,where,beizhu);
                    BasicEquipmentController controller = (BasicEquipmentController) ApplicationContextUtil.getBean("BasicEquipmentController");
                    String info =controller.addEquipment(equipment, Token.token).info;
                    JOptionPane.showMessageDialog(null, info);
                    if(info.equals("添加成功")){
                        closepage();
                        new select_equipment().init();
                        return;
                    }
                }

            }
        });
    }

    public void closepage() {
        frame.dispose();

    }

    public void init() {
        frame.setContentPane(new insert_equipment().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new insert_equipment().init();
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
        root.setLayout(new FormLayout("fill:d:grow", "center:max(d;4px):noGrow"));
        panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:68dlu:noGrow,left:50dlu:noGrow,left:103dlu:noGrow,fill:93px:noGrow,left:69dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:13dlu:noGrow,top:28dlu:noGrow,center:28dlu:noGrow,center:28dlu:noGrow,top:28dlu:noGrow,top:30dlu:noGrow,center:30dlu:noGrow,center:61px:noGrow,top:31dlu:noGrow,center:max(d;4px):noGrow"));
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
        label2.setText("新增设备");
        panel1.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("设备名称");
        panel1.add(label3, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("设备类型");
        panel1.add(label4, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        eq_type = new JTextField();
        panel1.add(eq_type, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.CENTER));
        eq_name = new JTextField();
        eq_name.setText("");
        panel1.add(eq_name, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-5409849));
        label5.setText("数量");
        panel1.add(label5, cc.xy(3, 5, CellConstraints.CENTER, CellConstraints.CENTER));
        num = new JTextField();
        num.setText("");
        panel1.add(num, cc.xy(4, 5, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-5409849));
        label6.setText("单价");
        panel1.add(label6, cc.xy(3, 6, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-5409849));
        label7.setText("产地");
        panel1.add(label7, cc.xy(3, 7, CellConstraints.CENTER, CellConstraints.CENTER));
        single_price = new JTextField();
        single_price.setText("");
        panel1.add(single_price, cc.xy(4, 6, CellConstraints.FILL, CellConstraints.CENTER));
        from = new JTextField();
        from.setText("");
        panel1.add(from, cc.xy(4, 7, CellConstraints.FILL, CellConstraints.CENTER));
        sure_Button = new JButton();
        sure_Button.setText("确定");
        panel1.add(sure_Button, cc.xy(3, 9, CellConstraints.RIGHT, CellConstraints.DEFAULT));
        exit_Button = new JButton();
        exit_Button.setText("返回");
        panel1.add(exit_Button, cc.xy(5, 9, CellConstraints.LEFT, CellConstraints.DEFAULT));
        final JLabel label8 = new JLabel();
        Font label8Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-5409849));
        label8.setText("备注");
        panel1.add(label8, cc.xy(3, 8, CellConstraints.CENTER, CellConstraints.CENTER));
        remakr = new JTextField();
        remakr.setText("");
        panel1.add(remakr, cc.xy(4, 8, CellConstraints.FILL, CellConstraints.CENTER));
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

    public JPanel getRoot() {
        return root;
    }
}
