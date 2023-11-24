/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.mangement.system.database;
/**
 *
 * @author HUAWEI
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class connector {
    public static Connection  getconnect(){
    try
    {
    //Class.forName("com.mysql.jdbc.driver"); 
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
    return con;
    }
    catch(Exception e){
      System.out.println(e);
      return null;
    }
    }
   
}
