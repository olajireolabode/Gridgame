/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;

import java.util.ArrayList;

/**
 *
 * @author 2135504
 */
public class Gridgame {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Player hero = new Player();
        Monster roz = new Monster(4,2);
        
        System.out.println(hero);
         
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        // can put children of a similar parent in the same arrayList
        
        for (int i = 0; i < 7; i++) {
            monsters.add(new Monster()); 
        }
        
        for (int i = 0; i < monsters.size(); i++) {
            System.out.println(monsters.get(i));    
        }
        
       
        
        BottomlessPit bp = new BottomlessPit();
        String userResponse;
        
        do{
            userResponse = hero.move();
            if(
                (roz.getPositionX()== hero.getPositionX())
                && roz.getPositionY()== hero.getPositionY()
                
        )do{
            hero.attack(roz);
            roz.attack(hero);
            System.out.println("Player new health= " + hero.getHealth());
            System.out.println("Monster new health= " + roz.getHealth());
        }while(hero.getHealth()>0 && roz.getHealth()>0);
         
            
        }while(!userResponse.equalsIgnoreCase("quit"));
        
   /*
        else if(hero.getPositionX()== 5){
                hero.setHealth(5000);
                System.out.println("Player new health: " + hero.getHealth());
            
            }
        else{
            System.out.println("The area is clear!");
            hero.move();
        }*/
    }
        
        
      
        
       
        
        
        
        
        
        
        
        
        
        
        
            
        
                
                
                
              
                
    }
    

