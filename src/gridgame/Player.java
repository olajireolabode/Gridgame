/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;


/**
 *
 * @author 2135504
 */
//Note
// we don't need getters and setters for constants because they are already protected and can't be messed with

public class Player extends GameCharacter {
    private String name;
    private int health;
    
    public Player(){ //constructor
        positionX = 4;
        positionY = 1;
        health = 1000;
        strength = 250;
        name = UserInputManager.retrievePlayerName();
    }

    @Override
    public String toString() {
        return "The Player \"" + name + "\" is located at {" + this.getPositionX() + "," + this.getPositionY() + "}";
    }
    
    
 
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = (name.equals("")) ? this.name : name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = (health < 0) ? 0 : health;
    }
    
    public void attack(Monster gc){
        gc.setHealth(
                gc.getHealth() - this.strength
        );
        
    }

    
    
  
    





}
