/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.payroll.controller;

import app.payroll.model.EmployeeModel;
import app.payroll.model.PayrollModel;
import app.payroll.view.PayrollView;

/**
 *
 * @author JJR_FIN
 */
public class PayrollController {
    private EmployeeModel _empModel;
    private PayrollModel _pyrlModel;
    private PayrollView _pyrlView;
    
    public PayrollModel payrol(String q){
        PayrollModel model = new PayrollModel();
        
        if (q.equals("Direktur")) {
            model.setBaseSalary(5000000);
        } 
        else if (q.equals("Manager")) {
            model.setBaseSalary(4000000);
        } 
        else if (q.equals("Staff")) {
            model.setBaseSalary(3000000);
        }
        
        model.setLifeInsurance(model.getBaseSalary());
        model.setSalaryCalculation(model.getBaseSalary(), model.getLifeInsurance());
        
        return model;
    }
    
    
    
    

    
}
