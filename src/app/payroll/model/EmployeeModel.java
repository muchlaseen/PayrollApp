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
public class EmployeeModel {
    private String employeeId;
    private String employeeName;
    private String employeeDept;
    
    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeDept(String department) {
        this.employeeDept = department;
    }

    public String getEmployeeDept() {
        return employeeDept;
    }
    
   
   
    
}
