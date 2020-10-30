
package VirtualPetgame;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Fight 
{
    int att = 0;
    boolean Case = true;      // I know I could have used the same vaiables, but I'm doing this to avoid mistakes.
    boolean CaseTwo = true;
    Scanner scan = new Scanner (System.in); 
    Random rand = new Random(); 
    Enemies killer;
     Levelup powerup;// used to check the experince and level up the hero and enimies. 
    
    public Fight (Pet Hero) // this is for the normal enimies; 
    {    
        int eniattack = rand.nextInt(2) + 1; 
        int op = rand.nextInt(3) + 1;  // generates random enimies, for the user,the method does it for them.       
        Enemies killer =type(op);//every time type is called it generates a new enimies, because it's in the while loop. 
     
        do{
             
            
           do{ // for the exceptions
             try
      {
          System.out.println("ENimey health: "+killer.getHealth());
          System.out.println("Hero: "+Hero.getHealth());
          System.out.println("Block: "+Hero.getBlock());
          System.out.println("Pick a attack!! \n 1."+Hero.getAttackname1()+" \n 2."+Hero.getAttackname2()+" \n 3.Spicial attack.");
            
             att = scan.nextInt();  // hero choses the attack;     try 
            
            switch(att)
            {
                case 1:
                Case = false;
                break;
                
                case 2:
                Case = false;
                break;
                
                case 3:
                Case = false;
                break;
                
                default:
                Case = true;
                throw new InvalidInput("Invalid input try again");     
            }   // only the inputs should be here. 
      }
      catch(Exception e)
      {
          print("Invalid input, try again");
          scan.nextLine(); // clears the buffer; 
          Case = true;     
      }         
    } while(Case);
       
           System.out.println(attack(Hero,att));
            killer.setHealth(killer.getHealth() - attack(Hero,att)); // hero attack; also the goons don't have any block; 
          
            System.out.println(" The enimie is gonna attack: ");     
           if(Hero.getBlock() > 0)
           {
           Hero.setBlock(Hero.getBlock() - attack(killer,eniattack));      
           }
           else if(Hero.getBlock() < 0)
           {
           Hero.setHealth(Hero.getHealth() - attack(killer,eniattack)); // when there is no more block;          
           }
           
           if(Hero.getHealth() < 0)
           {
               break;
           }
        
        }  while(killer.getHealth() > 0); // the case is for the loop; 
        
         if( Hero.getHealth() > 0)
          {
              Hero.setExpeince(Hero.getExpeince() + killer.getExpeince()); // the experince is added. 
              System.out.println(" You win the battle !!!!");
              Player.killcount++;
              powerup = new Levelup(Hero);     
          }       
          else 
         {
          System.out.println("The enemies  wins the battle, you loss \n");       
         }
          try 
     {
        PrintWriter Pw =new PrintWriter(new FileOutputStream("Note.txt",true));
        
         Pw.printf(" \n The user Health after battle with enimies:"+Hero.getHealth()+ "\n Hero level: "+Hero.getLevel()+" \n Killcount: "+ Player.killcount);     
         Pw.flush();
          Pw.close();
     }
     catch(Exception e)
     {
         System.out.println("Invalid input");
     }
         
    }
    
    public Fight(Pet hero,Boss boss) // this is for the boss battle.
    {
         int eniattack = rand.nextInt(3) + 1 ; // bosses have three attacks. 
         
          // if the boss is put here, the loop will keep going for ever; 
         do{
             
           do{ // for the exceptions
             try
      {
          print("\nHero: "+hero.getHealth());
          print("Block: "+hero.getBlock());
          print("Staminia: "+hero.getStamina());
          System.out.println("Pick a attack!! \n 1."+hero.getAttackname1()+" \n 2."+hero.getAttackname2()+" \n 3.Spicial attack.");
            
             att = scan.nextInt();  // hero choses the attack;     try 
            
            switch(att)
            {
                case 1:
                CaseTwo = false;
                break;
                
                case 2:
                CaseTwo = false;
                break;
                
                case 3:
                CaseTwo = false;
                break;
                
                default:
                CaseTwo = true;
                throw new InvalidInput("Invalid input try again");     
            }   // only the inputs should be here. 
      }
      catch(Exception e)
      {
          print("Invalid input, try again");
          scan.nextLine(); // clears the buffer; 
          Case = true;     
      }         
    } while(CaseTwo); 
                          
           if(boss.getBlock() > 0 )     
           {
           boss.setBlock(boss.getBlock() - attack(hero,att));
           }
           else 
           {
           boss.setHealth(boss.getHealth() - attack(hero,att)); // hero attack;
           }
           
           print("\nBoss Health: " +boss.getHealth());
           print(" Boss Stamina:"+boss.getStamina());
           print(" Boss Block: "+boss.getBlock());
           
           print("\n The Boss is gonna attack: ");     
           if(hero.getBlock() > 0)
           {
           hero.setBlock(hero.getBlock() - attack(boss,eniattack));// enimies attack, if the heros has block, then the hero will be dodge the attack.   
           System.out.println(hero.getBlock());
           }
           else     
           {
           hero.setHealth(hero.getHealth() - attack(boss,eniattack)); // when there is no more block; 
           }
           
           if ( boss.getHealth() < 0)
           {
               break;
           }
           
          } while(hero.getHealth() > 0);
          // add exp after the fight by checking the health.     
          if(  hero.getHealth() > 0) // meaning hero has more health and the hero won.
          {     
              hero.setExpeince(hero.getExpeince() + boss.getExpeince());
              print("\n"+hero.getName()+" wins the battle");
              powerup = new Levelup(hero); // not sure about this beause type has not been specified so cound be any of the monsters. 
              Player.killcount++;// counts the amount of kills; 
              // the statemnt above only works if the pet meets the conditions;
          }
          else 
          {
              print(boss.getName()+" wins the battle, you loss if you want to win go do to exploar mood, and get stronger\n");
              print("\n GAME OVER");
          }
      try 
     {
        PrintWriter Pw =new PrintWriter(new FileOutputStream("Note.txt",true));
        
         Pw.printf(" \n The user Health after boss battle:"+hero.getHealth()+ "\n Hero level: "+hero.getLevel()+" \n Killcount: "+ Player.killcount);     
         Pw.flush();
          Pw.close();
     }
     catch(Exception e)
     {
         System.out.println("Invalid input");
     }
              
    }
   
     public int attack(Pet track,int option) // can be used for pets and ennimes because the come from the same parrent class. 
    {
         // the staminia has to be taken into use for the hero/ enimes to attack, they can only attack if theie staminia is there
         //if there is no stamina the mehtod will return a 0, which means there will be no damage; 
        int at = 0;
        switch(option)
        {
            case 1: 
             if(track.getStamina() > 0)
             {     
             track.setStamina(track.getStamina() - track.getAttack()); // this means the stamina is being consumed. s    
             at =track.getAttack(); 
             break;
             }
             else 
             {
             print("No Stamina, you can't attack");  
             at = 0;   
             }
             break;    
             
            case 2: 
                 if(track.getStamina() > 0)
             {
             track.setStamina(track.getStamina() - track.getAttack2()); // this means the stamina is being consumed. s    
             at =track.getAttack2(); 
             break;
             }
             else    
                 {
                  print("No Stamina, you can't attack");  
                  at = 0;        
                 }  
                 break;
                 
            case 3: 
             if(track.getStamina() > 0)
             {
             track.setStamina(track.getStamina() - track.getSpattak()); // this means the stamina is being consumed. s    
             at =track.getSpattak(); 
             break;
             } 
             else
             {
              print("No Stamina, you can't attack");  
              at = 0;       
             }
             break;
           }
        return at; 
    }
     
     public Enemies type( int op) // this is used to figure out what kind of enimies we might fight. 
       {          
       Enemies monster = new Enemies();
       switch(op)
       {
           case 1: 
               monster.Type1();
               print(" A new enimie encountered: "+monster.getAnimaltype());        
               break;
           case 2:
               monster.Type2();
               print(" A new enimie encountered: "+monster.getAnimaltype());   
               break;
           case 3:
               monster.Type3();
                print(" A new enimie encountered: "+monster.getAnimaltype());   
               break;                    
       }
       return monster; // it will be converted into the type of monster; 
       }
       
 
     
     public void print(String m)
     {
         System.out.println(m);
     }
     
     
   
    
}


/**
 *
 * @author Penzen lama
 */

