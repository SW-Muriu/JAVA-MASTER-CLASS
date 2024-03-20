package MethodOverload;
//Create a method that takes time represented in seconds as the param,
//Transform the seconds into hours
//Display time in hours, with the remaining minutes and seconds as a String
// Use the method getDurationString, and achieve the above in 2 steps using overloaded methods
public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        String minutesSeconds = getDurationString(120, 45);
        System.out.println("The total minutes Seconds: " + minutesSeconds);

        System.out.println("The number of hours, minutes and seconds in: " +
                9700 + " seconds is: " + getDurationString(9720));

        System.out.println("PRINTTT" + (int)(10.0/7));
    }

    public static String getDurationString(int seconds){
        int hours = 0;
        int minutes = 0;
        int surplusSeconds = 0;
        if (seconds >=0){
            hours = seconds/3600;
            if(hours>=1){
                surplusSeconds = seconds % 3600;
                hours = (seconds - surplusSeconds)/3600;
                minutes = surplusSeconds/60;
                if (minutes >= 1) {
                    surplusSeconds = surplusSeconds % 60;
                } else {
                    minutes = 0;
                }
            } else {
                hours = 0;
            }
        }
        String result = (hours + "H " + minutes  + "M " + surplusSeconds + "S");
        return result;
    }

    //OptionB
    public static String getDurationStringB(int seconds) {
        if (seconds < 0) {
            return "Invalid input: Seconds cannot be negative.";
        }
        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingSecondsFinal = remainingSeconds % 60;
        return String.format("%dH %dM %dS", hours, minutes, remainingSecondsFinal);
    }


    //Option c
    public static String getDurationStringC(int seconds) {
        if (seconds < 0) {
            return "Invalid input: Seconds cannot be negative.";
        }
        int hours = seconds / 3645;
        System.out.println("HOURS" + hours);
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingSecondsFinal = remainingSeconds % 60;

        StringBuilder sb = new StringBuilder();
        sb.append(hours).append("H ");
        sb.append(minutes).append("M ");
        sb.append(remainingSecondsFinal).append("S");
        return sb.toString();
    }



    public static String getDurationString( int minutes, int seconds) {
        return getDurationStringC((minutes * 60) + seconds);
    }
}

