/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;
import java.util.Random;

/**
 *
 * @author 2135504
 */
//Note
// static = class property, no static = object property 
// ronald's rules, 1. use private for obj property, 2. write getters and setters for every property 
// 3. use "this", 4.Always write constructors, 

public class Monster extends Opponent {
     private String name;
     private int health;

    
    public Monster(){
        Random rd = new Random();
       
        this.positionX = rd.nextInt(8)+1;
        this.positionY = rd.nextInt(8)+1; // constructor
        this.health = 1000;
        this.strength = 150;
        
        System.out.println("positionX: " + this.positionX + "\npositionY: " + this.positionY);
        
    }
    public Monster(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;   
        this.health = 1000;
        this.strength = 150;
    }
    
    @Override
    public String toString() {
        return "This Monster is located at {" + this.getPositionX() + "," + this.getPositionY() + "}";
    }
    
    
   
    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = (health < 0) ? 0 : health;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = (name.equals("")) ? this.name : name;
    }
    
    
    
    public void attack(Player gc){
        gc.setHealth(
                gc.getHealth() - this.strength
        );
      
}
}
