/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.payroll.model;

/**
 *
 * @author muchlas
 */
public class PayrollModel {
    private EmployeeModel _empModel;
    private double baseSalary = 2000000;
    private double lifeInsurance = 0.2;
    private double jobSubsidy;
    private double salaryCalculation;
    
    public PayrollModel(EmployeeModel empModel) {
        this._empModel = empModel;
    }
    
    public void loadSalary() {
       salaryCalculation = ((baseSalary + jobSubsidy) * lifeInsurance);
    }
    
    public double getSalaryCalculation() {
        return salaryCalculation;
    }
    
}
