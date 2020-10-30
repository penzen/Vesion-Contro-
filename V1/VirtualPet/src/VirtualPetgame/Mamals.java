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
public class Mamals extends Pet {
  public void Wolf(String n)
  {
    
    this.setName(n);
    this.setAnimaltype("Dog");
    this.setHealth(500); 
    this.setBlock(200);
    this.setExpeince(0); // currently no experince; 
    this.setAttackname1("Bark Bark");
    this.setAttack(40);
    this.setAttackname2(" roff!!!!");
    this.setAttack2(60); 
    this.setSpecialattak("  neck attack ");
    this.setSpattak(130); 
    this.setStamina(1000);
    this.setMaxhealth(this.getHealth());
    this.setMaxstamina(this.getStamina());
    this.setMaxblock(this.getStamina());
  }
  
  public void Lion(String n)
  {
    this.setName(n);
    this.setAnimaltype("Cat");
    this.setHealth(400); 
    this.setBlock(200);
    this.setExpeince(0); // currently no experince; 
    this.setAttackname1("meow");
    this.setAttack(50);
   this.setAttackname2("Scrach");
    this.setAttack2(70); 
     this.setSpecialattak("head bit");
    this.setSpattak(140);  
    this.setStamina(1300); 
    this.setMaxhealth(this.getHealth());
    this.setMaxstamina(this.getStamina());
     this.setMaxblock(this.getStamina());
  }
  
  public void Ape(String n)
  {
    this.setName(n);   // print out the stats when the user selets the animals. 
    this.setAnimaltype("Ape");
    this.setHealth(450); 
    this.setBlock(220);
    this.setExpeince(0); // currently no experince; 
    this.setAttackname1("Smash");
    this.setAttack(40);
     this.setAttackname2("Rock throw");
    this.setAttack2(60); 
    this.setSpecialattak("Donkey kong" );
    this.setSpattak(150);  
    this.setStamina(1200); 
    this.setMaxhealth(this.getHealth());
    this.setMaxstamina(this.getStamina());
    this.setMaxblock(this.getStamina());
  }
  
  
  
public Mamals(String name)
{
    super();
    this.setName(name); 
    
}

  @Override
  public String toString()
{
    return "Name: " +getName()+"\n AnimalType: "+this.getAnimaltype()+"\n Attack: "+this.getAttackname1()+"\n Damage: "+this.getAttack()+"\n Attack 2: " +this.getAttackname2()+ "\n Damage: "+this.getAttack2()+"\n Health: "+this.getHealth() +"\n Special attack: "+this.getSpecialattak()+"\n Damage: "+this.getSpattak()+"\n Stamania:"+this.getStamina();
}
  public Mamals()
  {
      
  }
  

  

    
    
}
