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
public abstract class GameCharacter implements IGameCharacter{
    //protected  used so that the kids can use have properties of GameCharacter
    
    protected int strength;
    protected int positionX;
    protected int positionY;
//    protected int health;

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = (positionX > 8 || positionX <= 0) ? this.positionX : positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = (positionY > 8 || positionY <= 0) ? this.positionY : positionY;
    }
    
    //@Override
    public String move(){
        String dir = UserInputManager.retrievePlayerMovement();
        /*positionY = (dir.equalsIgnoreCase("up")) ? positionY + 1 : positionY;
        positionY = (dir.equalsIgnoreCase("down")) ? positionY - 1 : positionY;
        positionX = (dir.equalsIgnoreCase("left")) ? positionX - 1 : positionX;
        positionX = (dir.equalsIgnoreCase("right")) ? positionX + 1 : positionX;
        */
        if (dir.equalsIgnoreCase("up")){
            this.positionY=this.positionY+1;
        }
        else if(dir.equalsIgnoreCase("down")){
            this.positionY=this.positionY-1;
        }
        else if(dir.equalsIgnoreCase("right")){
            this.positionX=this.positionX+1;
        }
        else if (dir.equalsIgnoreCase("left")){
            this.positionX=this.positionX-1;
        }
        
        System.out.println("positionX: " + positionX + "\npositionY: " + positionY);
        
        return dir;
    }
    
    //@Override //let's java know this is a overridden method
    public void attack(GameCharacter gc){
         
    }
    
}



// return helps us exit the function
// break helps leave the loop(code block) not the function
// continue