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
public class Enemies extends Pet{
    
    
    public void Type1()
    {
        this.setAnimaltype("Monger");
        this.setAttack(15);
        this.setAttack2(25);
        this.setHealth(100);
        this.setLevel(0); 
        this.setExpeince(100); 
        this.setStamina(50000);
        this.setMaxhealth(this.getHealth());
        
    }
    
    
    
    public void Type2()
    {
        this.setAnimaltype("Goul"); 
        this.setAttack(20);
        this.setAttack2(35);
        this.setHealth(120);
        this.setLevel(0); 
        this.setExpeince(100);
        this.setStamina(50000);
        this.setMaxhealth(this.getHealth());
        
    }
    
    public void Type3()
    {
         this.setAnimaltype(" Goliath");
         this.setAttack(50);
         this.setAttack2(65);
        this.setHealth(150);
        this.setLevel(0); 
        this.setExpeince(150); 
        this.setStamina(50000);
        this.setMaxhealth(this.getHealth());
         
    }
      // 
    
    
    public String toString()
    {
        
        return"Name:"+this.getAnimaltype();
    }
    
  
    
    
    
}
