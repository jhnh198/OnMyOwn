/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onmyown;

/**
 *
 * @author jhewi_000
 */
public class OnMyOwnGame {
    //game continuation stats
    private int turns;
    private int health;
    
    //game score/wealth stats
    private int score;
    private int money;
    
    //character stats
    private int luck;
    private int wits;
    private int bravery;
    
    public OnMyOwnGame(){ //takes no arguments, builds game
        
        //starting stats
        turns = 90;
        health = 100;
        score = 0;
        money = 20;
        luck = 1;
        wits = 1;
        bravery = 1;
    }

    /**
     * @return the turns
     */
    public int getTurns() {
        return turns;
    }

    /**
     * @param turns the turns to set
     */
    public void setTurns(int turns) {
        this.turns = turns;
    }
    
    //every decision takes one turn
    public void incTurns(){
        this.turns--;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the money
     */
    public int getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(int money) {
        this.money = money;
    }

    /**
     * @return the luck
     */
    public int getLuck() {
        return luck;
    }

    /**
     * @param luck the luck to set
     */
    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void incLuck(){
        this.luck++;
    }
    /**
     * @return the wits
     */
    public int getWits() {
        return wits;
    }

    /**
     * @param wits the wits to set
     */
    public void setWits(int wits) {
        this.wits = wits;
    }

    public void incWits(){
        this.wits++;
    }
    /**
     * @return the bravery
     */
    public int getBravery() {
        return bravery;
    }

    /**
     * @param bravery the bravery to set
     */
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public void incBravery(){
        this.bravery++;
    }
}
