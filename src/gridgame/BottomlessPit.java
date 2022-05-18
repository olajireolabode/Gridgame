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
public class BottomlessPit extends Opponent{
    private int health;
    
    
    public BottomlessPit (){
        this.strength = Integer.MAX_VALUE; // format for writting constants
        this.health = Integer.MAX_VALUE;
        
    }
    
    public void attack(Player gc){
        gc.setHealth(
                gc.getHealth() - this.strength
        );
    }
    
    
}
