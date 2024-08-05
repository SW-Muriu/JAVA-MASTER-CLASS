package com.samsicker.SEC02ControlFlow.SwitchStatement;

public class WeekDayInEnhancedSwitch  {
    public static void main(String[] args) {
        printDatOfWeek(0);
        printDatOfWeek(1);
        printDatOfWeek(2);
        printDatOfWeek(3);
        printDatOfWeek(4);
        printDatOfWeek(5);
        printDatOfWeek(6);
        printDatOfWeek(7);

        printWeekDay(7);


    }

    public static void printDatOfWeek(int day){
        String dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " Stands for " + dayOfWeek);

    }
    
    public static void printWeekDay(int day){
     String dayOfWeek = "Invalid Day";
     
     if(day == 0){
         dayOfWeek = "Sunday";
     } else if (day == 1 ) {
         dayOfWeek = "Monday";
     } else if (day == 2) {
         dayOfWeek = "Tuesday";
     } else if (day == 3) {
         dayOfWeek = "Wednesday";
     } else if (day ==  4) {
         dayOfWeek = "Thursday";
     } else if (day == 5) {
         dayOfWeek = "Friday";
     } else if (day == 6) {
         dayOfWeek = "Saturday";
     }

        System.out.println(day + " Stands for " + dayOfWeek);

    }
}



