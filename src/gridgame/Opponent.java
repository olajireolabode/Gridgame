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
public abstract class Opponent extends GameCharacter{
    
    public String move(){
        
        System.out.println("positionX: " + positionX + "\npositionY: " + positionY);
        return "";
    }
}
