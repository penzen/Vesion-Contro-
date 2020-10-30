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
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Storymain { // this class is for the user to fight bossess. 

    public Storymain() {

    }
    bossbattles battle;
    int option = 0;
    Scanner scan = new Scanner(System.in);

    public Storymain(Pet hero) {

        print("Welcome to Story mode: " + hero.getName());
        print("Your now going into the boss battle, there is no turning back util you slay the boss or the boss slays you. \n best of luck");

        battle = new bossbattles(hero, 1);

        if (hero.getHealth() > 0) {
            print("Good job!! you beat the first boss");
            options(hero, 2);

            if (hero.getHealth() > 0) {
                print("Good job!! you beat the second boss");
                options(hero, 3);
            }
        }
    }

    public void options(Pet hero, int boss) {
        int options = 0;
        do {

            print("Pick an option, 1. continiue battle \n 2. rest \n 10. quit");

            try {
                options = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine(); // cleat buffer;
            }

            switch (options) {
                case 1:
                    print("The battle is goning to continue");
                    battle = new bossbattles(hero, boss);
                    break;
                case 2:
                    print("Your hero is well rested");
                    hero.setHealth(hero.getMaxhealth());
                    hero.setStamina(hero.getMaxstamina());
                    hero.setMaxblock(hero.getMaxblock());
                    break;
                case 10:
                    break;

                default:
                    System.out.println("Invalid Input");

            }
        } while (options != 10);

    }

    public void print(String print) {
        System.out.println(print);

    }
}
