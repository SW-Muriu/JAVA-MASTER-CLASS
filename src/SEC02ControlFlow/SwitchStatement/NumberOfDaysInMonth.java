package SEC02ControlFlow.SwitchStatement;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        getDaysInMonth(2, 2000);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year > 9999){
            System.out.println("first " + -1);
            return -1;
        } else {
            switch (month){
                case 1,3,5,7, 8, 10, 12 -> {
                    System.out.println(31);
                    return 31;
                }
                case 2 -> {
                    System.out.println(isLeapYear(year)? 29: 28);
                    return isLeapYear(year)? 29: 28;
                }
                case 4,6,11,9 -> {
                    System.out.println(30);
                    return 30;
                }
                default -> {
                    System.out.println(-1);
                    return -1;
                }
            }
        }

    }




}
