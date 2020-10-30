/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;


import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Penzen lama
 */
public class World { // this should be the main; 

    public static void main(String[] args) throws SQLException {
        
     
        
        Scanner scan = new Scanner(System.in);
        int input = 0;

        Picker pick = new Picker();
        Pet hero = new Pet() {
        };
        explore sidequest;
        Storymain storyline;

        System.out.println("Hi Hero, welcome to the Virual pet game");
        System.out.println(" What is your name hero");
       String owner = scan.nextLine();
        System.out.println("Hi " + owner + " now chose a pet!!");
        hero = pick.Type();
        Player player = new Player(owner, hero); // player connects with the pet;
        
        DataBase updating = new DataBase(player);
          updating.ConnectDataBase();        
          updating.createAnimalTable();
       //   updating.AnimalUpdate();
          //if two tables are run at the same time it will not work 
            
       
        do {
            System.out.println("Welcome to the Main menu");
            System.out.println("press 1 for main Stroy");    // maybe in the main adventure use diffrent steps and dirrection to get to the boss.
            System.out.println("Press 2 to  explore world");// move around get into fights and get xp. 
            System.out.println("Press 3 to rest");// gets the health back;  
            System.out.println("press 10 2 times to quit");
            try {
                input = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine(); // clear the buffer. 
            }
            switch (input) {
                case 1:
                    storyline = new Storymain(hero);
                    scan.nextInt();// clear buffer;
                    break;

                case 2:
                    sidequest = new explore(hero);
                    scan.nextInt();// clear buffer;
                    break;

                case 3:
                    hero.setHealth(hero.getMaxhealth());
                    hero.setStamina(hero.getMaxstamina());
                    hero.setBlock(hero.getMaxblock());
                    System.out.println("You are well rested, time to go now !!");
                    scan.nextInt();// clear buffer;
                    break;

                case 10:
                    scan.nextInt();// clear buffer;
                    break;

                default:
                    System.out.println("Not a valid input try again");

            }

        } while (input != 10);

       
        }
        
//while() put the rest of the game in while loop, this way, when the player exits the story they will go to the main menu with their states;
        // menu, this can be used with the death of the charecter, so when the charecter dies, the quit is called to exit the game; 
    }


