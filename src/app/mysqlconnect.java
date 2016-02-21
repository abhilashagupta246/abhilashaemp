/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Ashraf Hameed
 */

import java.sql.*;
import javax.swing.*;

public class mysqlconnect {
    
    public static Connection ConnectDb(String url,String databaseusernameDecrypt,String databasepasswordDecrypt){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, databaseusernameDecrypt, databasepasswordDecrypt);
            
            return con;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Connection is not done");
            return null;
        }
    }      

     public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gdfra_smart_learning?useUnicode=yes&characterEncoding=UTF-8", "root", "");
            return con;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } 
     
    }
    
    


