package com.samsicker.OOP.Encapsulation.Player;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;


    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        this.weapon = weapon;
        this.healthPercentage = healthChecker(healthPercentage);
    }

    public EnhancedPlayer(String fullName){
        this(fullName, 100, "Sword");
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <= 0){
            System.out.println("The player was knocked out of the game!!");
        }
    }

    public void restoreHealth(int extraHealth){
        healthPercentage += extraHealth;

        if(healthPercentage > 100){
            System.out.println("The player healthPercentage was restored");
            healthPercentage = 100;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }




    //Constraint Formulae
    private int healthChecker(int health){
        if (health <= 0){
            return 1;
        } else if(health > 100){
            return 100;
        } else {
            return health;
        }
    }
}
