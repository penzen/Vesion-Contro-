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
    Boss bosses = new Boss();

    public DataBase(Player play) {
        this.player = play; // now the name are gonna show up.
    }

   
    String url = "jdbc:derby:Assisment2; create=true";  //String url= "jdbc:derby: // localhost:1527/ CarDB; create=true"; this is an example
    // use emmbaded database because we are not suppose to use the network one. 

    String username = "Penzen";
    String password = "lama";
    Statement statement = null;
    
     public void connectDataBase() {
        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println(url+"\nConneceted...");
            this.statement = conn.createStatement();
            this.checkExistedTable("Pet");
             this.checkExistedTable("BOSS");
            this.statement.addBatch("CREATE  TABLE Pet  (NAME  VARCHAR(50),  LEVEL  INT,  HEALTH INT,ATTACKNAME1 VARCHAR(50),ATTACKNAME2 VARCHAR(50),ULTIMATEATTACK VARCHAR(50),DAMAGE1 INT,DAMAGE2 INT,DAMAGE3 INT)");
            this.statement.addBatch("INSERT INTO Pet VALUES ('"+player.attach.getName()+"', "+player.attach.getLevel()+", "+player.attach.getHealth()+",'"+player.attach.getAttackname1()+"','"+player.attach.getAttackname2()+"', '"+player.attach.getSpecialattak()+"',"+player.attach.getAttack()+","+player.attach.getAttack2()+","+player.attach.getSpattak()+")");  
            this.statement.addBatch("CREATE  TABLE BOSS (NAME  VARCHAR(50),  LEVEL  INT,  HEALTH INT,ATTACKNAME1 VARCHAR(50),ATTACKNAME2 VARCHAR(50),ULTIMATEATTACK VARCHAR(50),DAMAGE1 INT,DAMAGE2 INT,DAMAGE3 INT)");
            bosses.AlphaWolf(); // the first boss. 
            this.statement.addBatch("INSERT INTO BOSS VALUES ('"+bosses.getName()+"', "+bosses.getLevel()+", "+bosses.getHealth()+",'"+bosses.getAttackname1()+"','"+bosses.getAttackname2()+"', '"+bosses.getSpecialattak()+"',"+bosses.getAttack()+","+bosses.getAttack2()+","+bosses.getSpattak()+")");
             bosses.EVOTREX();; //boss number 2
            this.statement.addBatch("INSERT INTO BOSS VALUES ('"+bosses.getName()+"', "+bosses.getLevel()+", "+bosses.getHealth()+",'"+bosses.getAttackname1()+"','"+bosses.getAttackname2()+"', '"+bosses.getSpecialattak()+"',"+bosses.getAttack()+","+bosses.getAttack2()+","+bosses.getSpattak()+")");
             bosses.TitanaBoa(); //boss number 3;
            this.statement.addBatch("INSERT INTO Boss VALUES ('"+bosses.getName()+"', "+bosses.getLevel()+", "+bosses.getHealth()+",'"+bosses.getAttackname1()+"','"+bosses.getAttackname2()+"', '"+bosses.getSpecialattak()+"',"+bosses.getAttack()+","+bosses.getAttack2()+","+bosses.getSpattak()+")");
            
            this.statement.executeBatch(); //adds the batch at the same time
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createPLayerTable() {
        try {
            this.checkExistedTable("Player");
            this.statement.addBatch("CREATE TABLE Player (Name VARCHAR(20), PetName VARCHAR(20))");
            this.statement.addBatch("INSERT INTO Player VALUES "+"('"+player.name+"','"+player.attach.getName()+"')");
            this.statement.executeBatch();
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
  
    
    public void createPetTable() {
           try {
            this.statement.addBatch("INSERT INTO Pet VALUES ('"+player.attach.getName()+"', "+player.attach.getLevel()+", "+player.attach.getHealth()+",'"+player.attach.getAttackname1()+"','"+player.attach.getAttackname2()+"', '"+player.attach.getSpecialattak()+"',"+player.attach.getAttack()+","+player.attach.getAttack2()+","+player.attach.getSpattak()+")");
            this.statement.executeBatch(); //adds the batch at the same time
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
       
         
    }
    
    

    public ResultSet GetDatabase() {
        ResultSet rs = null;
        try {
            rs = this.statement.executeQuery("NAME,LEVEL,HEALTH,ATTACKNAME1,ATTACKNAME2,ULTIMATEATTACK,DAMAGE1,DAMAGE2,DAMAGE3 FROM Pet");
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public void checkExistedTable(String name) {
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
