package SEC02ControlFlow.Loops.WhileLoop;

public class EvenNumberChecker {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 20){
            i++;
            if(!isEvenNumber(i)) continue;
            System.out.println(i);

        }


    }


    public static boolean isEvenNumber(int number){
        return (number % 2 == 0)? true : false;
    }

}
