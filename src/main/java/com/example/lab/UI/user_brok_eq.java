package com.example.lab.UI;
import com.example.lab.Controller.breakdownEquipmentController;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Util.ApplicationContextUtil;
import com.example.lab.common.Ret;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public class user_brok_eq {
    static JFrame frame = new JFrame("实验室设备管理系统");
    private JPanel root;
    private BackgroundPanel panel1;
    private JButton eq_Button;
    private JButton bd_eq;
    private JButton re_eq;
    private JButton br_eq;
    private JButton information;
    private JButton 返回Button;
    private JTable table1;
    private JButton 申请;
    private JButton 更新Button;


    public user_brok_eq() {
        eq_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_sl_equipment().init();
            }
        });
        bd_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_brok_eq().init();
            }
        });
        br_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_br_eq().init();
            }
        });
        re_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_rep_eq().init();
            }
        });
        返回Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_menu().init();

            }
        });
        information.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_information().init();
            }
        });
        申请.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_brok_insert().init();
            }
        });
        更新Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new user_brok_update().init();
            }
        });
    }

    public void init() {
        user_brok_eq ube=new user_brok_eq();
        ube=printform(ube);
        frame.setContentPane(ube.root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600, 300, 800, 400);
        frame.pack();
        frame.setVisible(true);
    }

    public user_brok_eq printform(user_brok_eq se) {
        // 表格上的title
        String[] columnNames = new String[]{"损坏表id", "设备名称", "数量", "申请原因","申请人","申请时间"};
        /******改这个方法***/
        breakdownEquipmentController controller = (breakdownEquipmentController) ApplicationContextUtil.getBean("breakdownEquipmentController");
        Ret<?> ret=controller.getByUserId(Token.token);
        String info = ret.info;
        java.util.List<Breakdown> list = (List<Breakdown>)ret.data;
        String[][] eqs = new String[list.size()][];
        int i=0;
        for (Breakdown eq_list:list){
            String[] eq={String.valueOf(eq_list.getBreakdownId()),eq_list.getEquipmentName(), String.valueOf(eq_list.getNum()),eq_list.getApplyReason(),eq_list.getApplyPerson(), new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(eq_list.getApplyTime())};
            eqs[i++]=eq;
        }
        DefaultTableModel dt = new DefaultTableModel(eqs, columnNames);
        se.table1.setModel(dt);
        return se;

    }

    public void closepage() {
        frame.dispose();

    }

    public static void main(String[] args) {

        new user_brok_eq().init();
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
        panel1 = new BackgroundPanel();
        panel1.setImagestr("src/main/resources/picture/bg.jpg");
        panel1.setLayout(new FormLayout("fill:110px:noGrow,left:4dlu:noGrow,left:150dlu:noGrow,fill:8px:noGrow,fill:150dlu:noGrow", "center:79px:noGrow,top:30dlu:noGrow,top:30dlu:noGrow,center:30dlu:noGrow,top:30dlu:noGrow,center:29dlu:noGrow,center:30dlu:noGrow,top:30dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        CellConstraints cc = new CellConstraints();
        root.add(panel1, cc.xy(1, 1));
        eq_Button = new JButton();
        eq_Button.setText("基本设备");
        panel1.add(eq_Button, cc.xy(1, 2, CellConstraints.CENTER, CellConstraints.CENTER));
        bd_eq = new JButton();
        bd_eq.setText("损坏设备");
        panel1.add(bd_eq, cc.xy(1, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        re_eq = new JButton();
        re_eq.setText("维修设备");
        panel1.add(re_eq, cc.xy(1, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        br_eq = new JButton();
        br_eq.setText("借还设备");
        panel1.add(br_eq, cc.xy(1, 5, CellConstraints.CENTER, CellConstraints.CENTER));
        information = new JButton();
        information.setText("个人信息");
        panel1.add(information, cc.xy(1, 6, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.BOLD, 26, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-3770255));
        label1.setText("损坏设备");
        panel1.add(label1, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        返回Button = new JButton();
        返回Button.setText("返回");
        panel1.add(返回Button, cc.xy(1, 7, CellConstraints.CENTER, CellConstraints.CENTER));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setForeground(new Color(-12369221));
        panel1.add(scrollPane1, cc.xywh(3, 2, 3, 6, CellConstraints.FILL, CellConstraints.FILL));
        scrollPane1.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        table1 = new JTable();
        table1.setDragEnabled(true);
        Font table1Font = this.$$$getFont$$$(null, Font.PLAIN, -1, table1.getFont());
        if (table1Font != null) table1.setFont(table1Font);
        table1.setForeground(new Color(-3770255));
        table1.putClientProperty("terminateEditOnFocusLost", Boolean.FALSE);
        scrollPane1.setViewportView(table1);
        申请 = new JButton();
        申请.setText("申请");
        panel1.add(申请, cc.xy(3, 8, CellConstraints.CENTER, CellConstraints.CENTER));
        更新Button = new JButton();
        更新Button.setText("更新");
        panel1.add(更新Button, cc.xy(5, 8, CellConstraints.CENTER, CellConstraints.CENTER));

        eq_Button.setBackground(new Color(230,230,250));
        bd_eq.setBackground(new Color(230,230,250));
        re_eq.setBackground(new Color(230,230,250));
        br_eq.setBackground(new Color(230,230,250));
        information.setBackground(new Color(230,230,250));
        返回Button.setBackground(new Color(230,230,250));
        申请.setBackground(new Color(230,230,250));
        更新Button.setBackground(new Color(230,230,250));
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
