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
public class Levelup  { 
    
    // this is working 
    
  // Using the experince gaguge to add the exp 
  // constructor for the user may be needed.
    
    public Levelup(Pet lv)
    {
       int required = lv.getLevel() * 500;      
       if(lv.getExpeince() >= required) // requires the experince of the user to level up, the experince is added after every fight, in the fight class. 
       {       
              hero(lv); // increases the state of the pets powers. 
            // the state of the enimies goes up. 
             lv.setLevel(lv.getLevel() + 1); // increase the level of the hero;       
             System.out.println(" Your Pet has leveled up!!!!!\n Pet level: "+lv.getLevel());
       }
        // if the experince is in a certain level then the level up will happen.        
    }
 // gave me a null pointrt so, had to change the code and comment it out, the reason I left it here 
    //is because it's just for refrence
//    public void villian(Enemies up)
//    {
//     up.Type1();
//    up.setAttack((int) (up.getAttack() * 1.2));
//    up.setAttack2((int) (up.getAttack2() * 1.2));
//    up.setHealth((int) (up.getMaxhealth() * 1.3)); 
//    up.setLevel(up.getLevel() + 1);
//    
//    up.Type2();
//     up.setAttack((int) (up.getAttack() * 1.2));
//    up.setAttack2((int) (up.getAttack2() * 1.2));
//   up.setHealth((int) (up.getMaxhealth() * 1.3)); 
//    up.setLevel(up.getLevel() + 1);
//    
//    up.Type3();
//     up.setAttack((int) (up.getAttack() * 1.2));
//     up.setAttack2((int) (up.getAttack2() * 1.2));
//     up.setHealth((int) (up.getMaxhealth() * 1.3)); 
//     up.setLevel(up.getLevel() + 1);
//    
//    }
//    
    public void hero(Pet type)
    {
        type.setMaxhealth((int) (type.getMaxhealth() * 1.5)); 
        type.setMaxstamina((int) (type.getMaxstamina() * 1.5));
        type.setAttack((int) (type.getAttack() * 1.5));
        type.setAttack2((int) (type.getAttack2() * 1.5));
        type.setBlock((int) (type.getBlock() * 1.5));
        type.setExpeince(0); //everytime the pet levels up the experince is set to 0;
        type.setSpattak((int) (type.getSpattak() * 1.5));
        type.setHealth(type.getMaxhealth());  // we use this because if we use only health, the damage taken by the attacks will be multiplied, not the full health.
        type.setStamina(type.getMaxstamina()); // same as max health. 
        type.setMaxblock(type.getMaxblock());
        
    }
         

//when leveling up remember to multiply states times 1.5; 
}
