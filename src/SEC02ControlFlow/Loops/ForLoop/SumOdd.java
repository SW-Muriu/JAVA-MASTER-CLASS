package SEC02ControlFlow.Loops.ForLoop;

public class SumOdd {
    public static void main(String[] args) {

        int i = sumOdd(2,7);
    }

    public static boolean isOdd(int number){
        if(!(number > 0)){
            return false;
        } else {
            return number % 2 != 0;
        }
    }

    public static int  sumOdd(int start, int end){
        if (end >= start && start > 0 && end > 0){
            int sumOfOddNumbers = 0;
            for (int i = start; i <= end; i++ ){
                if(start > end && start < 0 || end < 0 ){
                    sumOfOddNumbers = -1;
                    break;
                }
                if(isOdd(i)) sumOfOddNumbers = sumOfOddNumbers + i;
            }
            System.out.println(sumOfOddNumbers);
            return sumOfOddNumbers;
        } else {
            System.out.println(-1);
            return -1;
        }

    }
}
