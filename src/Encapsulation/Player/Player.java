package Encapsulation.Player;

public class Player {

    private String name;
    private int health;
    private String weapon;


    public void loseHealth(int damage){
        health = health - damage;
        if(health <= 0){
            System.out.println("The player was knocked out of the game!!");
        }
    }

    public void restoreHealth(int extraHealth){
        health += extraHealth;

        if(health > 100){
            System.out.println("The player health was restored");
            health = 100;
        }
    }

    public int healthRemaining(){
        return health;
    }
}
