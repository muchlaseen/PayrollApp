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

    public EmployeeModel getEmpModel() {
        return _empModel;
    }

    public void setEmpModel(EmployeeModel _empModel) {
        this._empModel = _empModel;
    }

    public double getLifeInsurance() {
        return lifeInsurance;
    }

    public void setLifeInsurance(double baseSalary) {
        lifeInsurance = baseSalary * 0.2;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

//    public double getJobSubsidy() {
//        return jobSubsidy;
//    }
//
//    public void setJobSubsidy(double jobSubsidy) {
//        this.jobSubsidy = jobSubsidy;
//    }

    public double getSalaryCalculation() {
        return salaryCalculation;
    }

    public void setSalaryCalculation(double baseSalary, double lifeInsurance) {
        salaryCalculation = baseSalary - lifeInsurance;
    }
    
    
    
}
