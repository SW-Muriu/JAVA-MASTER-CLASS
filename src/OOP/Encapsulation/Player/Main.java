package OOP.Encapsulation.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
//        player.setH = 20;
//        player.weapon = "Sword";
//        player.name = "Tim";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());


        player.loseHealth(11);
        System.out.println("Remaining Health = " + player.healthRemaining());


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Kira", 200, "Sword");
        System.out.println("Initial Health is: " + enhancedPlayer.healthRemaining());



    }
}
