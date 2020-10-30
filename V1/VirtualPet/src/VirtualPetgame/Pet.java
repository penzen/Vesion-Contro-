/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;

/**
 *
 * @author Penzen lama
 */
public abstract class Pet { 

    /**
     * @param attackname1 the attackname1 to set
     */
    public void setAttackname1(String attackname1) {
        this.attackname1 = attackname1;
    }
   //might have to make the variables private; 
    
    private String animaltype = ""; 
    private String name= ""; 
    private int health= 1; 
    private int block= 1; 
    private int level= 1;    // make this in it's own class, which can be used accross the board., now abstract classes is needed,s
    private String attackname1= ""; 
    private int attack= 0; 
    private String attackname2= ""; 
    private int attack2= 0; 
    private String specialattak= ""; 
    private int spattak= 0; 
    private int expeince= 0;  
    private int stamina = 0; 
    private int maxhealth = 0; // these can be used when the player uses a postion or rest, 
    private int maxstamina = 0; // same; 
    private int maxblock = 0; 
               

    public String getAnimaltype() {
        return animaltype;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the block
     */
    public int getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(int block) {
        this.block = block;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the attackname1
     */
    public String getAttackname1() {
        return attackname1;
    }

    /**
     * @return the attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * @param attack the attack to set
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * @return the attackname2
     */
    public String getAttackname2() {
        return attackname2;
    }

    /**
     * @return the attack2
     */
    public int getAttack2() {
        return attack2;
    }

    /**
     * @param attack2 the attack2 to set
     */
    public void setAttack2(int attack2) {
        this.attack2 = attack2;
    }

    /**
     * @return the specialattak
     */
    public String getSpecialattak() {
        return specialattak;
    }

    /**
     * @return the spattak
     */
    public int getSpattak() {
        return spattak;
    }

    /**
     * @param spattak the spattak to set
     */
    public void setSpattak(int spattak) {
        this.spattak = spattak;
    }

    /**
     * @return the expeince
     */
    public int getExpeince() {
        return expeince;
    }

    /**
     * @param expeince the expeince to set
     */
    public void setExpeince(int expeince) {
        this.expeince = expeince;
    }

    /**
     * @return the stamina
     */
    public int getStamina() {
        return stamina;
    }

    /**
     * @param stamina the stamina to set
     */
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    /**
     * @return the maxhealth
     */
    public int getMaxhealth() {
        return maxhealth;
    }

    /**
     * @param maxhealth the maxhealth to set
     */
    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }

    /**
     * @return the maxstamina
     */
    public int getMaxstamina() {
        return maxstamina;
    }

    /**
     * @param maxstamina the maxstamina to set
     */
    public void setMaxstamina(int maxstamina) {
        this.maxstamina = maxstamina;
    }

    /**
     * @param animaltype the animaltype to set
     */
    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    /**
     * @param attackname2 the attackname2 to set
     */
    public void setAttackname2(String attackname2) {
        this.attackname2 = attackname2;
    }

    /**
     * @param specialattak the specialattak to set
     */
    public void setSpecialattak(String specialattak) {
        this.specialattak = specialattak;
    }

    /**
     * @return the maxblock
     */
    public int getMaxblock() {
        return maxblock;
    }

    /**
     * @param maxblock the maxblock to set
     */
    public void setMaxblock(int maxblock) {
        this.maxblock = maxblock;
    }
    
}
// exceptions needed