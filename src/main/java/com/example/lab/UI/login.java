package com.example.lab.UI;
import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Controller.UserController;
import com.example.lab.Util.ApplicationContextUtil;
import com.example.lab.Util.TokenUtil;
import com.example.lab.common.Ret;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Map;

public class login {
    static JFrame frame = new JFrame("登录");
    private JPanel panel1;
    private JTextField account;
    private JButton 登录Button;
    private JTextField password;
    private JButton 取消Button;


    public login() {
        登录Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = account.getText();
                String b = password.getText();
                UserController controller = (UserController) ApplicationContextUtil.getBean("UserController");
                Ret<?> ret = controller.login(a,b);
                String info =ret.info;
                Map<String, Object> data = (Map<String, Object>) ret.data;
                if(info.equals("登录成功")){
                    Token.token= (String)data.get("token");
                    closepage();
                    if ((int)data.get("auth")==0){
                        new select_equipment().init();
                    }
                    else{
                        /******用户的首届面***/
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(null, info);
                }
            }
        });
        取消Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
            }
        });
    }

    public  void init() {
        frame.setContentPane(new login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1100, 600, 800, 400);
        frame.pack();
        frame.setVisible(true);
    }
    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {
        new login().init();
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
        panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:68dlu:noGrow,left:50dlu:noGrow,left:103dlu:noGrow,fill:93px:noGrow,left:69dlu:noGrow,fill:max(d;4px):noGrow", "center:61px:noGrow,top:22dlu:noGrow,top:28dlu:noGrow,center:66px:noGrow,center:max(d;4px):noGrow,top:28dlu:noGrow,center:61px:noGrow,top:17dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        panel1.setForeground(new Color(-5922902));
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-4928789));
        label1.setText("Label");
        CellConstraints cc = new CellConstraints();
        panel1.add(label1, cc.xy(2, 1));
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.BOLD | Font.ITALIC, 28, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-8878906));
        label2.setText("实验室设备管理系统");
        panel1.add(label2, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 22, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-5409849));
        label3.setText("账号");
        panel1.add(label3, cc.xy(3, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 22, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-5409849));
        label4.setText("密码");
        panel1.add(label4, cc.xy(3, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        account = new JTextField();
        panel1.add(account, cc.xy(4, 3, CellConstraints.FILL, CellConstraints.CENTER));
        password = new JTextField();
        panel1.add(password, cc.xy(4, 4, CellConstraints.FILL, CellConstraints.CENTER));
        登录Button = new JButton();
        登录Button.setText("登录");
        panel1.add(登录Button, cc.xy(3, 7, CellConstraints.CENTER, CellConstraints.DEFAULT));
        取消Button = new JButton();
        取消Button.setText("取消");
        panel1.add(取消Button, cc.xy(5, 7, CellConstraints.CENTER, CellConstraints.DEFAULT));
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
        return panel1;
    }

}
