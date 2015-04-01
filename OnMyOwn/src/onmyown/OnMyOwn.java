/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onmyown;

import java.util.Scanner;

/**
 *
 * @author jhewi_000
 */
public class OnMyOwn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //game start, construct game stats
        OnMyOwnGame o1 = new OnMyOwnGame();
        Scanner sc = new Scanner(System.in);
        int playerChoice = 0; 
        
        displayStart();
        //end game when turns are over or zero health
        while (o1.getTurns() > 0 && o1.getHealth() > 0){
            o1.incTurns(); //turns--
            displayChoices();
            playerChoice = sc.nextInt();
            
        }
    }
    
    public static void displayStart(){
        System.out.println("On My Own, a game by John Hewitt ");
        System.out.println("Dedicated to Jonathan");
        System.out.println();
        System.out.println("Your roommates moved out because you don't pay the bills on time. ");
        System.out.println("They were sick of you playing video games on the couch and spending money on");
        System.out.println("a new tv, rather than the cable internet or the electricity to power the fun.");
        System.out.println("Eventually, people get tired of taking care of your responsibilities.");
        System.out.println("You are on your own. After a few hours, the tv and all the lights shut off. \n");
    }
    
    public static void displayChoices(){
        System.out.println("What do you do? \n");
        System.out.println("1: Eat");
        System.out.println("2: Go to work");
        System.out.println("3: Go dumpster diving");
        System.out.println("4: Check status");
        System.out.println("5: Pay bills");
        System.out.println("");
        System.out.println("Your choice: ");
    }
}
