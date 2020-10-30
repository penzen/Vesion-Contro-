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
public class bossbattles extends Thread {
    
    public bossbattles()
    {
                
    }

    Boss bossess = new Boss();
    Pet player;
    Fight bs;

    public bossbattles(Pet animal, int number) {
        this.player = animal;
        BossFights(number);
    }

    public synchronized void BossFights(int number) // used for boss one, two and three. 
    {
        this.notifyAll(); 
        
        int count = 0;
        switch (number) {
            case 1:
                count = 3;
                bossess.AlphaWolf();
                break;

            case 2:
                count = 5;
                bossess.EVOTREX();
                break;

            case 3:
                count = 7;
                bossess.TitanaBoa();
                break;
        }
        print("Boss level: " + number + " \n Enimies approcing get ready! ");
        print("For this boss battle, you will be fighting " + count + " enimes before figthing the boss.");
        for (int x = 0; x < count; ++x) // the count is for the amount of enimies. 
        {

            print("Enemie: " + x);

            bs = new Fight(player);  // try and catch for the figters. 
            if (count == 6 && x == 3) {
                print("You get health,stamina and block armor the first three fight.");
                player.setHealth(player.getMaxhealth());
                player.setStamina(player.getMaxstamina());
                player.setBlock(player.getMaxblock());
                //block; 

            } else if (count > 5 && x == 5) {
                print("You get health,stamina and block armor the first three fight.");
                print("You will not recive anymore health till alll the enimies are defeted, so be careful");
                player.setHealth(player.getMaxhealth());
                player.setStamina(player.getMaxstamina());
                player.setBlock(player.getMaxblock());
            }
        }
        print(" Good job on beating the enimies, now you get health,stamina and block armor");
        player.setHealth(player.getMaxhealth()); // refills the player's health. 
        player.setStamina(player.getMaxstamina()); // sets the staminia to full; 
        player.setBlock(player.getMaxblock());

        print("You have entered the boss stage, your boss for this stage is: " + bossess.getName());
        bs = new Fight(player, bossess);

    }

    public void print(String s) {
        System.out.println(s);
    }

}
