package SEC02ControlFlow.SwitchStatement;

import java.security.PublicKey;

//Aids in testing many conditions.
//Only used when testing different values for the same variable
public class Switch {


    public static void firstExample(int switchValue) {

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 , 4 or 5");
                System.out.println(" Actually, it was a: " + switchValue);
                break;
            case 'a':
                System.out.println("Was actually a character");
                break;
            default:
                System.out.println("Value was neither 1,2,3,4, nor a 5");
                break;
        }
    }


//    Switch has been approved over time, but when your program requires backward compatibility, use the traditional syntax
    public static void enhancedSwitchStatement1(int switchValue){
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3 , 4 or 5");
                System.out.println(" Actually, it was a: " + switchValue);
            }
            case 'a' -> System.out.println("Was actually a character");
            default -> System.out.println("Value was neither 1,2,3,4, nor a 5");
        }
    }

    public static String getQuarter(String month){
        String quarter ="";
        switch (month){
            case "January", "February", "March" -> quarter = month +  " is in the FirstQuarter";
            case "April", "May", "June" -> quarter= month +  " is in the Second Quarter";
            case "July", "August", "September" -> quarter = month +  " is in the Third Quarter";
            case "October", "November", "December" -> quarter= month +  " is in the Fourth Quarter";
            default  -> {
                 quarter = "Enter the correct Month";
            }
        }
        System.out.println(quarter);
        return quarter;
    }


//    Simmilarly, you can return a switch case:

    public static String getQuarter2(String month){
      return  switch (month){
            case "January", "February", "March" ->  month +  " is in the FirstQuarter";
            case "April", "May", "June" -> month +  " is in the Second Quarter";
            case "July", "August", "September" ->  month +  " is in the Third Quarter";
            case "October", "November", "December" ->  month +  " is in the Fourth Quarter";
            default  -> {
                
                yield "Enter the correct month";
            }
        };

    }
}
