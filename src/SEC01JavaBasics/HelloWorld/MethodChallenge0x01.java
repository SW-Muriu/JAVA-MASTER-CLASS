package SEC01JavaBasics.HelloWorld;

public class MethodChallenge0x01 {

    public static void main(String[] args) {
        String playerName = "Tim";
        displayHighScorePosition(playerName, calculateHighScorePosition(1500));
        displayHighScorePosition("James", calculateHighScorePosition(1000));
        displayHighScorePosition("Peter", calculateHighScorePosition(500));
        displayHighScorePosition("Kevin", calculateHighScorePosition(100));
        displayHighScorePosition("Joseph", calculateHighScorePosition(25));
    }


    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " +  playerPosition + " on the high score list");
    }

    public  static int calculateHighScorePosition (int playerScore) {
        int result = 4;
        if (playerScore >= 1000) {
            result = 1;
        } else if (playerScore>= 500) {
            result = 2;
        } else if (playerScore >= 100) {
            result = 3;
        }
        return result;
    }


}
