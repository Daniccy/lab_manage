package com.example.lab.UI;
import com.example.lab.Controller.UserController;
import com.example.lab.Entity.User;
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

public class update_user {
    static JFrame frame = new JFrame("update_user");
    private JTextField user_name;
    private JTextField pw_user;
    private JTextField user_phone;
    private JTextField user_email;
    private JButton exit;
    private JButton 确定Button;
    private JPanel root;
    private JTextField id_user;
    private JTextField user_adress;

    public update_user() {
        确定Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userid = id_user.getText();
                String userName = user_name.getText();
                String userpw = pw_user.getText();
                String userEmail = user_email.getText();
                String userAdress = user_adress.getText();
                String userPhone = user_phone.getText();
                User user=new User();
                user.setUserId(userid);
                user.setUserPassward(userpw);
                user.setUserName(userName);
                user.setUserMail(userEmail);
                user.setUserAddress(userAdress);
                user.setUserPhone(userPhone);
                UserController controller = (UserController) ApplicationContextUtil.getBean("UserController");
                String info =controller.update(user).info;
                if(info.equals("更新成功")){
                    closepage();
                    new select_users().init();
                    return;
                }
                /*****************后端***********/
                closepage();
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new select_users().init();
                closepage();
            }
        });
    }

    public void init() {
        frame.setContentPane(new update_user().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {
        new update_user().init();
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
        root.setLayout(new BorderLayout(0, 0));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:49dlu:noGrow,left:50dlu:noGrow,left:93dlu:noGrow,fill:93px:noGrow,left:45dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:28dlu:noGrow,top:28dlu:noGrow,center:28dlu:noGrow,center:28dlu:noGrow,top:29dlu:noGrow,top:28dlu:noGrow,center:max(d;4px):noGrow,center:61px:noGrow,top:20dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        panel1.setForeground(new Color(-5922902));
        root.add(panel1, BorderLayout.CENTER);
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-4928789));
        label1.setText("Label");
        CellConstraints cc = new CellConstraints();
        panel1.add(label1, cc.xy(2, 1));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD, 26, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-3771247));
        label2.setText("修改用户信息");
        panel1.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        user_name = new JTextField();
        panel1.add(user_name, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.CENTER));
        pw_user = new JTextField();
        panel1.add(pw_user, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        user_phone = new JTextField();
        panel1.add(user_phone, cc.xy(4, 5, CellConstraints.FILL, CellConstraints.CENTER));
        user_email = new JTextField();
        panel1.add(user_email, cc.xy(4, 6, CellConstraints.FILL, CellConstraints.CENTER));
        exit = new JButton();
        exit.setText("返回");
        panel1.add(exit, cc.xy(5, 9, CellConstraints.LEFT, CellConstraints.DEFAULT));
        确定Button = new JButton();
        确定Button.setText("确定");
        panel1.add(确定Button, cc.xy(3, 9, CellConstraints.RIGHT, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("用户id");
        panel1.add(label3, cc.xy(3, 2, CellConstraints.CENTER, CellConstraints.CENTER));
        id_user = new JTextField();
        panel1.add(id_user, cc.xy(4, 2, CellConstraints.FILL, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("用户地址");
        panel1.add(label4, cc.xy(3, 7, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-5409849));
        label5.setText("用户邮箱");
        panel1.add(label5, cc.xy(3, 6, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-5409849));
        label6.setText("用户电话");
        panel1.add(label6, cc.xy(3, 5, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-5409849));
        label7.setText("用户名字");
        panel1.add(label7, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label8 = new JLabel();
        Font label8Font = this.$$$getFont$$$(null, Font.PLAIN, 20, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-5409849));
        label8.setText("新密码");
        panel1.add(label8, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        user_adress = new JTextField();
        panel1.add(user_adress, cc.xy(4, 7, CellConstraints.FILL, CellConstraints.CENTER));
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
