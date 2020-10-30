/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Penzen lama
 */
public class explore  {
     Fight hunt;
    Scanner scan = new Scanner(System.in);
  Random rand = new Random();// use this to randomly generate enimies,within a reilistc rannge; 
  
  public explore(Pet player)
  {

      System.out.println("Welcome to"+player.getName()+" to exploler mood.");
      movement(player);
  }
  
  

  
public void movement(Pet player) // try and catch  // this use to return move
{   
    int move = 0;
    int forward = 0;
    int left = 0;
    int right = 0;
    int back = 0;
  
   do {    
        int popup = rand.nextInt(5) + 1; // for the enimies 
        System.out.println(" Go Forward  1.\n Go Left 2. \n Go Right 3. \n Go back");
        System.out.println(" If you want to rest,please press 5, \n if you want to exploler mood quit please press 10 2 times ");
        System.out.println("Here is a map of the word");
         map();
        
        try
        {
             move = scan.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Invalid input,try again");
            scan.nextLine(); // cleat buffer
        }             
        switch(move)
        {
            case 1:      
                ++forward; 
               System.out.println("You moved forward: "+forward);
                break;
                
            case 2:
                ++left;
                  System.out.println("You moved left: "+left);
                break;
            case 3:
                ++right; 
                System.out.println("You moved right: "+right);
                break;
           case 4:
               if(right > 40) // infinite desert; 
               {
              ++back;
              --forward;
               }
              System.out.println("You moved back: "+back);
              break;
                
            case 5:  //  the hero is resting, so his states go back to normal.
               player.setHealth(player.getMaxhealth());
               player.setBlock(player.getMaxblock());
               player.setStamina(player.getMaxstamina());
               
            case 10: 
                break; 
                
            default: 
              System.out.println("Invalid input, try again");
              break;
             
        }
         
      LRFBmove(forward,left,right,back,popup,player);   // the movement is down     
}while( move != 10);

}

public void map() // the map of the world. 
{
    System.out.println(" 2 forward: Dark Forest");
    System.out.println(" 10 forward, 10 left, 10 right.: Forbidden tree ");
    System.out.println(" 9 forwatd, 6 left, 5 right: No man's land");    
    System.out.println("40 forward, 40 right, 40 left: Infite desert");
    System.out.println("10 back: Fall of the cliff and DIE!!!!");
   
}

public void attacks(int i,Pet player) // for enimies to attack, the enimies popout randomly depending on the random number.
{
     if (i== 3 || i == 1)
        {
            System.out.println("The Enimie ambushes you!!!!");
            hunt = new Fight(player);    
        }    
}

    
       
     public void LRFBmove(int forward,int left,int right, int back,int popup,Pet Player)
        {
             attacks(popup,Player); // suprise attack at anytime; 
         // use health  and  staminia postions to revatalize the player;    
      if(forward >= 2 && forward < 10)
      {
          System.out.println(" You Have entred the dark forest"); 
           attacks(popup,Player); // in the general enviroment, where anytime a enimy can pop out.
          
          if(forward == 5 && left == 2 && right == 4 )
          {
              System.out.println(" You found an expeince chest");
              System.out.println(" You will have to kill the enime to get the box");
              hunt = new Fight(Player); // the fight; 
              Player.setExpeince(Player.getExpeince() + 200);
          }
          else if(forward == 9 && left == 6 && right == 8 )
          {
               System.out.println(" You found an expeince chest");
              System.out.println(" You will have to kill the enime to get the box");  
              for(int x = 0; x > 2; x++)
              {
              hunt = new Fight(Player); //2 fights;                  
              Player.setExpeince(Player.getExpeince() + 500); 
          }         
      }        
    } 
      else if(forward >= 10 && right < 20  )
      {
          System.out.println(" You Have entred the Forbiden forest"); 
          attacks(popup,Player); 
           if(forward == 17 && left == 17 && right == 17 )
          {
              System.out.println("FATAL FALL, you fell into a pit of lava");
              System.out.println("GAME OVER");
           
          }
          else if(forward == 17 && left == 19 && right == 18 )
          {
               System.out.println(" You found an expeince chest");
              
              System.out.println(" You will have to kill the enime to get the box");
              for(int x = 0; x > 4; x++)
              {
              hunt = new Fight(Player); //2 fights;    // try and catch for the fighters.               
              Player.setExpeince(Player.getExpeince() + 1000); //maybe use enimies state,so it's fare;        
              }
          }
    }
         else if(forward >= 20 && forward < 30 ) 
           {
               System.out.println(" Welcome to No man's Land");
                attacks(popup,Player); 
                
                  if(forward == 24 && left == 27 && right == 23 )
          {
              System.out.println("FATAL FALL, you fell into a pit of lava");
              System.out.println("GAME OVER");
          
          }
          else if(forward == 29&& left == 29 && right == 29 )
          {
               System.out.println(" You found an expeince chest");               
              System.out.println(" You will have to kill the enime to get the box");
              for(int x = 0; x > 4; x++)
              {
              hunt = new Fight(Player); //2 fights;    // try and catch for the fighters.               
              Player.setExpeince(Player.getExpeince() + 1000); //maybe use enimies state,so it's fare;        
              }
          }
                
           }
      
   else if(forward >= 30 )
   {
       System.out.println("Welcome to Inifite desert");
        attacks(popup,Player); 
   } 
            
        }
     
}
