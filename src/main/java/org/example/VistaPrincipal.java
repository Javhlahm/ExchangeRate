/*
 * Created by JFormDesigner on Mon May 27 20:49:12 CST 2024
 */

package org.example;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author macdejavier
 */
public class VistaPrincipal extends JFrame {
    public VistaPrincipal() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        Conversor conversor = new Conversor();
        label3.setText(conversor.convertir((Double) spinner1.getValue(),comboBox1.getItemAt(comboBox1.getSelectedIndex()),comboBox2.getItemAt(comboBox2.getSelectedIndex())));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Javier Lamas (javier gerardo lamas hernandez)
        comboBox1 = new JComboBox<>();
        comboBox2 = new JComboBox<>();
        spinner1 = new JSpinner();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        label3 = new JLabel();

        //======== this ========
        setResizable(false);
        var contentPane = getContentPane();

        //---- comboBox1 ----
        comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
            "USD",
            "MXN",
            "EUR",
            "JPY",
            "GBP"
        }));

        //---- comboBox2 ----
        comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
            "MXN",
            "USD",
            "EUR",
            "JPY",
            "GBP"
        }));

        //---- spinner1 ----
        spinner1.setModel(new SpinnerNumberModel(0.0, 0.0, null, 0.5));

        //---- label1 ----
        label1.setText("Exchange Rate ALURA");
        label1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 30));
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label2 ----
        label2.setText("--->");

        //---- button1 ----
        button1.setText("Convertir");
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD));
        button1.addActionListener(e -> button1(e));

        //---- label3 ----
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 14f));
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(label2)
                            .addGap(40, 40, 40)
                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 17, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(249, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                            .addGap(249, 249, 249))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
                            .addGap(239, 239, 239))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2)
                        .addComponent(spinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Javier Lamas (javier gerardo lamas hernandez)
    public JComboBox<String> comboBox1;
    public JComboBox<String> comboBox2;
    public JSpinner spinner1;
    public JLabel label1;
    public JLabel label2;
    public JButton button1;
    public JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
