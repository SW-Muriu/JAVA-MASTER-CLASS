package com.samsicker.OOP.OOP1Inheritance.InheritancePrt1.InheritanceChallenges.WorkerChallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;



    private static int employeeNumber = 1;
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNumber++ ;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
