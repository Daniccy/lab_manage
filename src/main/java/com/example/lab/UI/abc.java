package com.example.lab.UI;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;

public class abc {
    private JPanel ab;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("abc");
        abc a = new abc();
        a.table1.getModel().setValueAt("jj", 1, 1);
        frame.setContentPane(a.ab);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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
        ab = new JPanel();
        ab.setLayout(new FormLayout("fill:d:grow", "center:d:grow"));
        final JScrollPane scrollPane1 = new JScrollPane();
        CellConstraints cc = new CellConstraints();
        ab.add(scrollPane1, cc.xy(1, 1, CellConstraints.FILL, CellConstraints.FILL));
        table1 = new JTable();
        scrollPane1.setViewportView(table1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return ab;
    }

}