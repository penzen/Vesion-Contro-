/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;

import VirtualPetgame.Pet;

/**
 *
 * @author Penzen lama
 */
public class ColdBlood extends Pet {
    
        
        //the block part is basically their armore;
  public void snake(String n)
  {
    
    this.setName(n);
    this.setAnimaltype("Snake");
    this.setHealth(500); 
    this.setBlock(200);
    this.setExpeince(0); // currently no experince; 
    this.setAttackname1("Venom");
    this.setAttack(30);
    this.setAttackname2(" Srangle"); 
    this.setAttack2(40); 
    this.setSpecialattak("Kill shot");  
    this.setSpattak(160); 
    this.setStamina(1500);
    this.setMaxhealth(this.getHealth());
    this.setMaxstamina(this.getStamina());
     this.setMaxblock(this.getStamina());
    
  }
  
  public void Trex(String n)
  {
    this.setName(n);
    this.setAnimaltype("Dino");
    this.setHealth(450); 
    this.setBlock(300);
    this.setExpeince(0); // currently no experince; 
    this.setAnimaltype("Tail slash");
    this.setAttack(50);
    this.setAttackname1(" Head butt");
    this.setAttack2(70); 
    this.setSpecialattak("Huge bite");
    this.setSpattak(140);  
    this.setStamina(1500) ; 
    this.setMaxhealth(this.getHealth());
    this.setMaxstamina(this.getStamina());
     this.setMaxblock(this.getStamina());
  }
  
  public void KillerCorc(String n)
  {
    this.setName(n);   // print out the stats when the user selets the animals. 
    this.setAnimaltype("Hybrid croc man");
    this.setHealth(500); 
    this.setBlock(200);  
    this.setExpeince(0); // currently no experince; 
    this.setAttackname1("Grande punch");
    this.setAttack(50);
    this.setAttackname2("back breaker ");
    this.setAttack2(80); 
    this.setAttackname2("Jaw snap");
    this.setSpattak(120);  
    this.setStamina(1600); 
    this.setMaxhealth(this.getHealth());
    this.setMaxstamina(this.getStamina());
     this.setMaxblock(this.getStamina());
  }
  
  public ColdBlood(String name)
{
    super();
    this.setName(name); 
    
}
  public ColdBlood()
  {
      
  }
  
  @Override
   public String toString()
{
    return "Name: " +getName()+"\n AnimalType: "+this.getAnimaltype()+"\n Attack: "+this.getAttackname1()+"\n Damage: "+this.getAttack()+"\n Attack 2: " +this.getAttackname2()+ "\n Damage: "+this.getAttack2()+"\n Health: "+this.getHealth() +"\n Special attack: "+this.getSpecialattak()+"\n Damage: "+this.getSpattak()+"\n Stamania:"+this.getStamina();
}
  
    
}

