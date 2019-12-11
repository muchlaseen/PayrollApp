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
    private double lifeInsurance = 0.2;
    private double baseSalary;
    private double jobSubsidy;
    private double salaryCalculation;
    
    public PayrollModel(EmployeeModel empModel) {
        this._empModel = empModel;
    }
    
    public void setBaseSalary() {
        if(_empModel.getEmployeeDept().equals("Direktur")) {
            baseSalary = 5000000;
        } 
        else if(_empModel.getEmployeeDept().equals("Manager")) {
            baseSalary = 4000000;
        }
        else if(_empModel.getEmployeeDept().equals("Staff")) {
            baseSalary = 3000000;
        }
        else {
            baseSalary = 1500000;
        }
        
    }
    
    public double getLoadBaseSalary() {
        return baseSalary;
    }
    
    public void setJobSubsidy(double baseSalary) {
       jobSubsidy = baseSalary / 10;
    }
    
    public double getLoadJobSubsidy() {
        return jobSubsidy;
    }
    
    public void setLifeInsurance(double baseSalary) {
        lifeInsurance = baseSalary * 0.2;
    }

    public double getLifeInsurance() {
        return lifeInsurance;
    }
    
    public void setSalaryCalculation(double baseSalary, double jobSubsidy, double lifeInsurance) {
        salaryCalculation = ((baseSalary + jobSubsidy) * lifeInsurance);
    }
    
    public double getSalaryCalculation() {
        return salaryCalculation;
    }
    
}
