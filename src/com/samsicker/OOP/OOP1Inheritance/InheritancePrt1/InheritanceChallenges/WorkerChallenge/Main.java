package com.samsicker.OOP.OOP1Inheritance.InheritancePrt1.InheritanceChallenges.WorkerChallenge;

public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Timmy", "01/01/1996", "01/01/2018");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee jimmy = new SalariedEmployee("Jane", "03/02/1965", "04/04/2018", 35000);
        System.out.println("Jimmy's Paycheck: " + jimmy.collectPay());
        jimmy.getAge();
        jimmy.retire();
        System.out.println("Jimmy's Pension Check: " + jimmy.collectPay());


        HourlyEmployee dennisHourly = new HourlyEmployee("Kevin", "01/01/1978", "0201/2016", 20);
        System.out.println(dennisHourly);
        System.out.println("Dennis Paycheck: " + dennisHourly.collectPay());
        System.out.println("Dennis Holiday Pay: " + dennisHourly.getDoublePay());


    }
}
