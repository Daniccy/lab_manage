package com.example.lab.UI;

import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Controller.breakdownEquipmentController;
import com.example.lab.Entity.Breakdown;
import com.example.lab.Entity.Equipment;
import com.example.lab.Util.ApplicationContextUtil;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Locale;

public class breakdown_equipment {
    static JFrame frame = new JFrame("breakdown_equipment");
    private JButton eq;
    private JButton insert;
    private JButton update;
    private JButton 维修设备Button;
    private JButton 借还设备Button;
    private JButton 故障设备Button;
    private JButton 查看报表Button;
    private JPanel root;
    private JButton repair_eq;
    private JButton bore_eq;
    private JButton feedback;
    private JButton 用户管理Button;
    private JTable table1;
    private JButton break_eq;

    public breakdown_equipment() {
        eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new select_equipment().init();
            }
        });
        repair_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new repair_equipment().init();
            }
        });
        bore_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new borrow_return_equipment().init();
            }
        });
        feedback.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new select_feedback().init();
            }
        });
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new insert_breakdown_equipment().init();

            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new update_breakdown().init();
            }
        });
        break_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
            }
        });
        用户管理Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new select_users().init();
            }
        });
    }

    public void init() {
        breakdown_equipment be = new breakdown_equipment();
        be = printform(be);
        frame.setContentPane(be.root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public breakdown_equipment printform(breakdown_equipment se) {

        // 表格上的title
        String[] columnNames = new String[]{"损坏表id", "设备名称", "数量", "申请原因","申请人","申请时间"};
        /**
         * 对接数据
         * 1、通过ApplicationContextUtil.getBean拿到指定controller的实例
         * 2、调用
         * 3、强转回指定类型
         */
        breakdownEquipmentController controller = (breakdownEquipmentController) ApplicationContextUtil.getBean("breakdownEquipmentController");
        String info =controller.get().info;
        if (info.equals("success")){
            java.util.List<Breakdown> list = (List<Breakdown>)controller.get().data;
            String[][] eqs = new String[list.size()][];

            int i=0;
            for (Breakdown eq_list:list){
                String[] eq={String.valueOf(eq_list.getBreakdownId()),eq_list.getEquipmentName(), String.valueOf(eq_list.getNum()),eq_list.getApplyReason(),eq_list.getApplyPerson(), String.valueOf(eq_list.getApplyTime())};
                eqs[i++]=eq;
            }
            DefaultTableModel dt = new DefaultTableModel(eqs, columnNames);
            se.table1.setModel(dt);
        }else{

        }
        return se;

    }

    public void closepage() {
        frame.dispose();

    }


    public static void main(String[] args) {
        new breakdown_equipment().init();
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
        root.setLayout(new FormLayout("fill:max(d;4px):noGrow,left:4dlu:noGrow,fill:d:grow", "center:max(d;4px):noGrow,top:4dlu:noGrow,center:d:grow"));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FormLayout("fill:110px:noGrow,left:4dlu:noGrow,left:150dlu:noGrow,fill:8px:noGrow,fill:151dlu:noGrow", "center:79px:noGrow,top:30dlu:noGrow,top:30dlu:noGrow,center:30dlu:noGrow,top:30dlu:noGrow,center:31dlu:noGrow,top:30dlu:noGrow,center:max(d;4px):noGrow,center:28dlu:noGrow,top:9dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        CellConstraints cc = new CellConstraints();
        root.add(panel1, cc.xywh(1, 1, 3, 3));
        eq = new JButton();
        eq.setText("基本设备");
        panel1.add(eq, cc.xy(1, 2, CellConstraints.CENTER, CellConstraints.CENTER));
        break_eq = new JButton();
        break_eq.setText("损坏设备");
        panel1.add(break_eq, cc.xy(1, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        repair_eq = new JButton();
        repair_eq.setText("维修设备");
        panel1.add(repair_eq, cc.xy(1, 4, CellConstraints.CENTER, CellConstraints.CENTER));
        bore_eq = new JButton();
        bore_eq.setText("借还设备");
        panel1.add(bore_eq, cc.xy(1, 5, CellConstraints.CENTER, CellConstraints.CENTER));
        feedback = new JButton();
        feedback.setText("查看报表");
        panel1.add(feedback, cc.xy(1, 6, CellConstraints.CENTER, CellConstraints.CENTER));
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.BOLD, 26, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-3770255));
        label1.setText("损坏设备");
        panel1.add(label1, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        insert = new JButton();
        insert.setText("申请");
        panel1.add(insert, cc.xy(3, 9, CellConstraints.CENTER, CellConstraints.DEFAULT));
        update = new JButton();
        update.setText("更新");
        panel1.add(update, cc.xy(5, 9, CellConstraints.CENTER, CellConstraints.DEFAULT));
        用户管理Button = new JButton();
        用户管理Button.setText("用户管理");
        panel1.add(用户管理Button, cc.xy(1, 7, CellConstraints.CENTER, CellConstraints.CENTER));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, cc.xywh(3, 2, 3, 6, CellConstraints.FILL, CellConstraints.FILL));
        table1 = new JTable();
        scrollPane1.setViewportView(table1);
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
