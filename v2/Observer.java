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
public interface Observer {
    
    public void substcribe();
    //use this method for the level ups, so everytime we level up the user that has subscribed will get a notication 
    //that he has leveled up. 
    //there should be an option in the start that says ig the user wants to substctibe; 
    
    public void update();
 
    // the controller must be the button
}
