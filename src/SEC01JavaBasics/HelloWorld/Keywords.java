package SEC01JavaBasics.HelloWorld;

public class Keywords {
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highscore =   calculateScore( gameOver, score,  levelCompleted, bonus);
        System.out.println("The high score is: " + highscore);

       gameOver = true;
       score = 10000;
       levelCompleted = 8;
       bonus = 200;
       System.out.println("The second high score is " + calculateScore(gameOver, score, levelCompleted, bonus));

    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }

}
