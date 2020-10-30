/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;


import java.util.ArrayList;

/**
 *
 * @author Penzen lama
 */

// the main bosses do not have stamina; 
public class Boss extends Pet{
    
    public void AlphaWolf()
  {
    
    this.setName("Alpha Wolf");
    this.setAnimaltype("WOLF");
    this.setHealth(1000);
    this.setExpeince(1000); // currently no experince; 
    this.setAttackname1("Hound");
    this.setAttack(50);
    this.setAttackname2("Pit");
    this.setAttack2(70); 
    this.setSpecialattak("final flash");
    this.setSpattak(120); 
    this.setStamina(50000);
    this.setLevel(10);
  }
    
     public void  EVOTREX()
  {
    
     this.setName("Main Trex");
    this.setAttackname1("Dino");
    this.setHealth(2000); 
    this.setExpeince(3000); // currently no experince; 
    this.setAttackname2("Bite");
    this.setAttack(150);
    this.setAttackname1("claw");  
    this.setAttack2(150); 
    this.setSpecialattak("Fatal blow"); 
    this.setSpattak(200); 
    this.setStamina(50000);
    this.setLevel(20);
  }
     
       public void  TitanaBoa()
  {
    
    this.setName("Apex preditor ");
    this.setAnimaltype("COld-blood"); ;
    this.setHealth(4000); 
    this.setExpeince(10000); // currently no experince; 
    this.setAttackname1("Strangle");
    this.setAttack(250);
    this.setAttackname2("tail slash");
    this.setAttack2(250); 
    this.setSpecialattak("Fatal bite");
    this.setSpattak(500); 
    this.setStamina(50000);
    this.setLevel(30); 
    
  }
       
        public String toString()
{
    return "Name: " +getName()+"\n AnimalType: "+this.getAnimaltype()+"\n Attack: "+this.getAttackname1()+" Damage: "+this.getAttack()+"\n Attack 2: " +this.getAttackname2()+ " Damage: "+this.getAttack2()+"\n Health: "+this.getHealth() +"\n Special attack: "+this.getSpecialattak()+"Damage: "+this.getSpattak()+"\n Stamania:"+this.getStamina();
}
        
//        public void coll() collections can be used for boss battles, when in loop 
//        {
//            ArrayList<Pet> ds = new ArrayList();
//            ds.add(1, this.AlphaWolf());
//            ds.add()
//            
//        }
    
    
    
}
