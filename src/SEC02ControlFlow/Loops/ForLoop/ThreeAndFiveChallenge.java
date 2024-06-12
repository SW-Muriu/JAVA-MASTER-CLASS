package SEC02ControlFlow.Loops.ForLoop;

public class ThreeAndFiveChallenge {
    public static void main(String[] args) {
        int multipleCounter = 0;
        int multipleSum = 0;
        for(int i= 98; i <= 378; i++){
            if (i % 3 == 0 && i % 5 ==0){
                multipleCounter ++;
                if(multipleCounter > 5){
                    break;
                }
                multipleSum = multipleSum + i;
                System.out.println("This number is divisible by both 3 and 5: " + i);
            }
        }
        System.out.println("The Total sum of all the number is: " + multipleSum);
    }
}
