package MethodOverload;

public class Main {
    public static void main(String[] args) {

        int newScore = calculateScore("Time", 500);
        System.out.println("New score is: " + newScore);

        calculateScore(75);
        calculateScore();


        //Using default values
        System.out.println("New score is: " + calculateScore("Sam", 786));
        System.out.println("New score is: " + calculateScore(10));


    }

    //Different methods and uniquely identified by parameter type. NOT return type, number of params, or param name
//    the unique identifier is called the method signature

    //Use overloaded methods to define default values for params.

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");

        return score * 1000;
    }

    public static int  calculateScore(int score){
        calculateScore("Anonymous", score);
        System.out.println("Unnamed Player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player, no player score");

        return 0;
    }




}
