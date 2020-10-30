/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualPetgame;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Penzen lama
 */
public class DataBase {

    Connection conn = null;
    Player player;

    public DataBase(Player play) {
        this.player = play; // now the name are gonna show up.
        // the above line of code actually does everything,so the rest will not be nessesary.
//        this.player.name = play.name;  
//        this.player.attach.setName(play.attach.getName());  // sets the name of the pet. 
        // updating the  table with the pets health, level and attacks damage, 

    }

    //use the objects of the animals and the player, for the informatiuon, so it should be addedn aftern the 
    //user has initated thier name and the pets name this way, also use the constructor so that 
    // the information is updated.
    String url = "jdbc:derby:Assisment2; create=true";  //String url= "jdbc:derby: // localhost:1527/ CarDB; create=true"; this is an example
    // use emmbaded database because we are not suppose to use the network one. 

    String username = "Penzen";
    String password = "lama";
    Statement statement = null;

    public void ConnectDataBase() {
        try {
           
            this.conn = DriverManager.getConnection(this.url, this.username, this.password); // it gets connected because that is the username and the password
            System.out.println("\n"+url+" Conneceted... \n");
             this.statement = conn.createStatement();   
           //  this.checkExistedTable("PLAYER");          
            this.statement.addBatch("CREATE  TABLE PLAYER ( Name VARCHAR(50),  Killcount INT)");
            this.statement.addBatch("INSERT INTO PLAYER VALUES ( '"+player.name+"', '"+Player.killcount+"'),\n");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createAnimalTable() {
        try {
             this.checkExistedTable("PET"); // checks the database, and constatly updates it with new information 
            this.statement.addBatch("CREATE TABLE PET (NAME VARCHAR(20), LEVEL INT , HEALTH INT, ATTACKNAME1 VARCHAR(20),ATTACKNAME2 VARCHAR(20),ULTIMATEATTACK VARCHAR(20),DAMAGE1 INT,DAMAGE2 INT,DAMAGE3 INT");
  // becare full with the semicollens.
            // this.statement.addBatch("CREATE TABLE PET (CATEGORY VARCHAR(20), DISCOUNT INT)");
            this.statement.addBatch("INSERT INTO PET VALUES ('"+ player.attach.getName()+"', "+ player.attach.getLevel() + ","
                    + "," + player.attach.getHealth() + ",'" + player.attach.getAttackname1() + "','" + player.attach.getAttackname2() + "','" +player.attach.getSpecialattak()
                    + "'," + player.attach.getAttack() + "," + player.attach.getAttack2() + "," + player.attach.getSpattak() + ")\n");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet AnimalUpdate() throws SQLException {
        
       
     // update table here and then return the tabel.
        ResultSet rs = null;
        try {
            rs = this.statement.executeQuery("SELECT NAME, LEVEL, HEALTH,ATTACKNAME1,ATTACKNAME2,ULTIMATEATTACK,DAMAGE1,DAMAGE2,DAMAGE3,FROM PET, PROMOTION WHERE BOOK.CATEGORY=PROMOTION.CATEGORY");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void checkExistedTable(String name) { //can be used to update charecter info 
        try {
            DatabaseMetaData dbmd = this.conn.getMetaData();
            
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, types);
            Statement statement = this.conn.createStatement();
            while (rs.next()) {
                String table_name = rs.getString("TABLE_NAME");
                System.out.println(table_name);
                if (table_name.equalsIgnoreCase(name)) {
                    statement.executeUpdate("Drop table " + name);
                    System.out.println("Table " + name + " has been deleted.");
                    break;
                }
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
