/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;
import java.util.Scanner;

/**
 *
 * @author 2135504
 */
public class UserInputManager {
    
    public static String retrievePlayerMovement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player movement (up/down/left/right): ");
        String dir = sc.next();
        
        return dir;
    }
    
    public static boolean retrievePlayerAttack(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to attack(True/False): ");
        boolean isPlayerAttacking= sc.nextBoolean();
        
        return isPlayerAttacking;
    }
    
    public static String retrievePlayerName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your hero's name: ");
        String name = sc.nextLine();
        
         return name;   
    }







}