package com.example.lab.UI;

import com.example.lab.Controller.BasicEquipmentController;
import com.example.lab.Entity.Equipment;
import com.example.lab.Util.ApplicationContextUtil;
import com.example.lab.common.Ret;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Locale;
import java.util.Random;
public class select_equipment extends JFrame {

    static JFrame frame = new JFrame("select_equipment");
    private JPanel panel1;
    private JButton eq_Button;
    private JTable table1;
    private JButton insert_button;
    private JButton update_Button;
    private JButton br_eq;
    private JButton re_eq;
    private JButton bore_eq;
    private JButton feedback;
    private JButton 用户管理Button;

    public void init() {
        select_equipment se = new select_equipment();
        se = printform(se);
        frame.setContentPane(se.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


    public select_equipment printform(select_equipment se) {
        // 表格上的title
        String[] columnNames = new String[]{"设备ID", "设备名称", "设备类型", "入库时间","数量","单价","产地","备注"};
        // 表格中的内容，是一个二维数组
        /*String[][] eqs = new String[][];{{"1", "盖伦", "616" + a, "100"},
                {"2", "提莫", "512", "102"}, {"3", "奎因", "832", "200"}};*/
        /**
         * 对接数据
         * 1、通过ApplicationContextUtil.getBean拿到指定controller的实例
         * 2、调用
         * 3、强转回指定类型
         */
        BasicEquipmentController controller = (BasicEquipmentController)ApplicationContextUtil.getBean("BasicEquipmentController");
        String info =controller.getEquipment().info;
        if (info.equals("success")){
            List<Equipment> list = (List<Equipment>)controller.getEquipment().data;
            String[][] eqs = new String[list.size()][];
            int i=0;
            for (Equipment eq_list:list){
                String[] eq=eq_list.get_eq();
                eqs[i++]=eq;
            }
            DefaultTableModel dt = new DefaultTableModel(eqs, columnNames);
            se.table1.setModel(dt);
        }else{

        }
        return se;
        /*int num = table1.getRowCount();
        System.out.println(num);
        table1.getModel().setValueAt("a", 1, 1);*/

    }

    public void closepage() {
        frame.dispose();

    }

    public select_equipment() {
        insert_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new insert_equipment().init();

            }
        });
        update_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new update_equipment().init();

            }
        });
        br_eq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closepage();
                new breakdown_equipment().init();
            }
        });
        re_eq.addActionListener(new ActionListener() {
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
        eq_Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
            }
        });
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
        panel1.setLayout(new FormLayout("fill:110px:noGrow,left:4dlu:noGrow,left:150dlu:noGrow,fill:8px:noGrow,fill:150dlu:noGrow", "center:79px:noGrow,top:30dlu:noGrow,top:30dlu:noGrow,center:30dlu:noGrow,top:30dlu:noGrow,center:29dlu:noGrow,center:30dlu:noGrow,top:11dlu:noGrow,top:28dlu:noGrow,center:max(d;4px):noGrow"));
        panel1.setBackground(new Color(-4272661));
        eq_Button = new JButton();
        eq_Button.setText("基本设备");
        CellConstraints cc = new CellConstraints();
        panel1.add(eq_Button, cc.xy(1, 2, CellConstraints.CENTER, CellConstraints.CENTER));
        br_eq = new JButton();
        br_eq.setText("损坏设备");
        panel1.add(br_eq, cc.xy(1, 3, CellConstraints.CENTER, CellConstraints.CENTER));
        re_eq = new JButton();
        re_eq.setText("维修设备");
        panel1.add(re_eq, cc.xy(1, 4, CellConstraints.CENTER, CellConstraints.CENTER));
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
        label1.setText("基本设备");
        panel1.add(label1, cc.xyw(3, 1, 3, CellConstraints.CENTER, CellConstraints.DEFAULT));
        用户管理Button = new JButton();
        用户管理Button.setText("用户管理");
        panel1.add(用户管理Button, cc.xy(1, 7, CellConstraints.CENTER, CellConstraints.CENTER));
        insert_button = new JButton();
        insert_button.setText("申请");
        panel1.add(insert_button, cc.xy(3, 9, CellConstraints.CENTER, CellConstraints.TOP));
        update_Button = new JButton();
        update_Button.setText("更新");
        panel1.add(update_Button, cc.xy(5, 9, CellConstraints.CENTER, CellConstraints.DEFAULT));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setForeground(new Color(-12369221));
        panel1.add(scrollPane1, cc.xywh(3, 2, 3, 6, CellConstraints.FILL, CellConstraints.FILL));
        scrollPane1.setBorder(BorderFactory.createTitledBorder(null, "kakakaka", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        table1 = new JTable();
        table1.setDragEnabled(true);
        Font table1Font = this.$$$getFont$$$(null, Font.BOLD, -1, table1.getFont());
        if (table1Font != null) table1.setFont(table1Font);
        table1.setForeground(new Color(-3770255));
        table1.putClientProperty("terminateEditOnFocusLost", Boolean.FALSE);
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
        return panel1;
    }

}