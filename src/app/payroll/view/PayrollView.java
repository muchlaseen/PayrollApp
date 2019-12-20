/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.payroll.view;

import java.awt.event.ActionListener;
import javax.swing.*;
import app.payroll.model.PayrollModel;


/**
 *
 * @author muchlas
 */
public class PayrollView extends JFrame {
    private PayrollModel _empModel;
    private JLabel idLabel = new JLabel("NIP");
    private JLabel nameLabel = new JLabel("Nama");
    private JLabel deptLabel = new JLabel("Jabatan");
    private JLabel baseSalaryLabel = new JLabel("Gaji Pokok");
    private JLabel lifeInsuranceLabel = new JLabel("Potongan BPJS");
    private JLabel takeHomePayLabel = new JLabel("Gaji Bersih");
    
    private JTextField baseSalarField;
    
    public PayrollView() {
        JPanel mainPanel = new JPanel();
        

        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 400);
        
        this.add(mainPanel);
    }
            
}
