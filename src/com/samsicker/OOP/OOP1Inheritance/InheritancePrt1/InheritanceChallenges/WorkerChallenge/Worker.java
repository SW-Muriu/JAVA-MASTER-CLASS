package com.samsicker.OOP.OOP1Inheritance.InheritancePrt1.InheritanceChallenges.WorkerChallenge;

import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker() {
    }

    public int getAge(){
        int currentYear = LocalDate.EPOCH.getYear();
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return birthYear - currentYear;
    }

    public double collectPay(){
        return 1.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
