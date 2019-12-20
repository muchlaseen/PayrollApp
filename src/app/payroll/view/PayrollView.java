/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.payroll.view;

import app.payroll.controller.PayrollController;
import javax.swing.*;
import java.awt.Font;

import app.payroll.model.PayrollModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author muchlas
 */
public class PayrollView extends JFrame {

    private PayrollModel _empModel;
    private JLabel titleLabel;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JLabel deptLabel;
    private JLabel baseSalaryLabel;
    private JLabel lifeInsuranceLabel;
    private JLabel takeHomePayLabel;
    private JTextField txtId;
    private JTextField txtName;
    private JComboBox<String> combDept;
    private JTextField txtBaseSalary;
    private JTextField txtLifeInsurance;
    private JTextField txtTakeHomePay;
    private JButton btnSave;
    private JButton btnReset;
    private JButton btnUpdate;
    private JButton btnDelete;
    private JTable table;
    private JScrollPane pane;

    PayrollController payrollController = new PayrollController();

    // Constructor 
    public PayrollView() {
        JPanel mainPanel = new JPanel();

        // Init Label Component
        titleLabel = new JLabel("DATA GAJI KARYAWAN");
        idLabel = new JLabel("NIP");
        nameLabel = new JLabel("Nama");
        deptLabel = new JLabel("Jabatan");
        baseSalaryLabel = new JLabel("Gaji Pokok");
        lifeInsuranceLabel = new JLabel("Potongan BPJS");
        takeHomePayLabel = new JLabel("Gaji Bersih");

        // Init TextField Component
        txtId = new JTextField();
        txtName = new JTextField();
        String[] deptList = new String[]{"--- Select ---","Direktur", "Manager", "Staff"};
        combDept = new JComboBox<>(deptList);
        txtBaseSalary = new JTextField();
        txtLifeInsurance = new JTextField();
        txtTakeHomePay = new JTextField();

        // Init Button Component
        btnSave = new JButton("Save");
        btnReset = new JButton("Reset");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");

        // Init Table Component
        table = new JTable();
        Object[] columns = {"NIP", "Nama", "Jabatan", "Gaji Pokok", "Potongan BPJS", "Gaji Bersih"};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columns);

        // Set the model to table
        table.setModel(tableModel);

        // Create ScrollPane
        pane = new JScrollPane(table);
        pane.setBounds(10, 220, 660, 200);

        // Label's Properties
        titleLabel.setBounds(230, 10, 300, 50);
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        idLabel.setBounds(15, 70, 100, 20);
        nameLabel.setBounds(15, 100, 100, 20);
        deptLabel.setBounds(15, 130, 100, 20);
        baseSalaryLabel.setBounds(370, 70, 100, 20);
        lifeInsuranceLabel.setBounds(370, 100, 100, 20);
        takeHomePayLabel.setBounds(370, 130, 100, 20);

        // TextField's Properties
        txtId.setBounds(100, 70, 150, 22);
        txtName.setBounds(100, 100, 210, 22);
        combDept.setBounds(100, 130, 210, 22);
        txtBaseSalary.setBounds(490, 70, 180, 22);
        txtLifeInsurance.setBounds(490, 100, 180, 22);
        txtTakeHomePay.setBounds(490, 130, 180, 22);

        // Button's Properties
        btnSave.setBounds(310, 170, 80, 30);
        btnReset.setBounds(395, 170, 80, 30);
        btnUpdate.setBounds(480, 170, 80, 30);
        btnDelete.setBounds(565, 170, 80, 30);

        // ComboBox's Properties
        combDept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String dept = combDept.getSelectedItem().toString();
                PayrollModel payrol = null;
                switch (dept) {
                    case "Direktur":
                        payrol = payrollController.payrol(dept);
                        break;
                    case "Manager":
                        payrol = payrollController.payrol(dept);
                        break;
                    case "Staff":
                        payrol = payrollController.payrol(dept);
                        break;
                }
                txtBaseSalary.setText(Double.toString(payrol.getBaseSalary()));
                txtLifeInsurance.setText(Double.toString(payrol.getLifeInsurance()));
                txtTakeHomePay.setText(Double.toString((payrol.getSalaryCalculation())));
            }
        });
        
<<<<<<< HEAD

=======
        Object[] row = new Object[6];
>>>>>>> 140e0a8f47b8560e9f64ca704d1e91ebafa01cc0
        
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                row[0] = txtId.getText();
                row[1] = txtName.getText();
                row[2] = combDept.getSelectedItem();
                row[3] = txtBaseSalary.getText();
                row[4] = txtLifeInsurance.getText();
                row[5] = txtTakeHomePay.getText();
                
                tableModel.addRow(row);
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int i = table.getSelectedRow();
                if(i >= 0) {
                    tableModel.removeRow(i);
                }
                else {
                    System.out.println("Delete Error! Tidak ada data!");
                }
            }
        });
        
        mainPanel.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 500);

        mainPanel.add(pane);
        mainPanel.add(titleLabel);
        mainPanel.add(idLabel);
        mainPanel.add(nameLabel);
        mainPanel.add(deptLabel);
        mainPanel.add(txtId);
        mainPanel.add(txtName);
        mainPanel.add(combDept);
        mainPanel.add(baseSalaryLabel);
        mainPanel.add(lifeInsuranceLabel);
        mainPanel.add(takeHomePayLabel);
        mainPanel.add(txtBaseSalary);
        mainPanel.add(txtLifeInsurance);
        mainPanel.add(txtTakeHomePay);
        mainPanel.add(btnSave);
        mainPanel.add(btnReset);
        mainPanel.add(btnUpdate);
        mainPanel.add(btnDelete);
        mainPanel.add(pane);

        this.add(mainPanel);
    }

}
