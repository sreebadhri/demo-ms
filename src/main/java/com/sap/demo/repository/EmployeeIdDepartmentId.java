package com.sap.demo.repository;

public class EmployeeIdDepartmentId {
    private String employeeId;
    private String departmentId;

    public EmployeeIdDepartmentId() {}

    public EmployeeIdDepartmentId(String employeeId, String departmentId) {
        this.employeeId = employeeId;
        this.departmentId = departmentId;
    }

    // getters and setters

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
