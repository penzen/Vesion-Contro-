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
public class Player {
    
    String name;    
    static int killcount = 0; // has to be used accross all classes. 
    Pet attach = new Pet(){};

    
    
    
 public Player(String name,Pet type){
     
     this.attach = type; 
     this.name = name;
 } 
 
}
