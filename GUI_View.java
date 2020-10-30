/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author Penzen lama
 */
public class GUI_View extends JFrame {
    
    
    JTextField Playername = new JTextField(20);// for the name;
    JTextField Petname = new JTextField(20); 
    JButton ply = new JButton("Player-name");
    JButton woof = new JButton("Pet-name");
    
   public GUI_View()
   {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       this.setSize(1000, 1000);
        JPanel panel = new JPanel();
        panel.add(woof);
        panel.add(ply);
        panel.add(Petname);
        panel.add(Playername);
        this.add(panel);
        
     
   } 
   
   
    public String GetName()
    {
       return  Petname.getText(); // this is how to get the name; 
        
    }
    
    
    
}
