
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Database {
   public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
  
  Connection connection =  null;
  
  // Store the database URL in a string
  String url = "jdbc:mysql://localhost:3306/"; 
  Class.forName("com.mysql.jdbc.Driver").newInstance();
  
  // set the url, username and password for the databse 
  connection = DriverManager.getConnection(url,"root","");   
  return connection;
  
 }
}
