package com.pluralsight;

import java.time.*;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchIn;
    private double punchInTime = 0;

    public Employee(int employeeId, String name, String department, double payRate){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }
    

    public int getEmployeeId() {
        return employeeId;
    }
    public void setPunchIn(double time){
        this.punchInTime = time;
    }
    public void setPunchIn(){
        LocalTime lt = LocalTime.now();
        int hours = lt.getHour();
        int minutes = lt.getMinute();
        double timeAsDouble = hours + ((double) minutes / 60);
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }
    public double getTotalPay(){
        return (getRegularHours() * payRate) * (getOverTimeHours() * 1.5 * payRate);
    }
    public double getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }
    public double getOverTimeHours(){
        return (hoursWorked > 40) ?hoursWorked - 40 : 0;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", getTotalPay() =" +getTotalPay() +
                ", getRegularHours()=" + getRegularHours() +
                ",getOvertimeHours()=" + getOverTimeHours() +
                '}';
    }
}
