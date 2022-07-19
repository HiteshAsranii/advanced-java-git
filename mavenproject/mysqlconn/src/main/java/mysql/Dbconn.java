package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {
 private static Dbconn db= new Dbconn();
 private static final String URL ="jdbc:mysql://localhost:3306/people";
 private Connection conn;
 public static Dbconn instance() {
	 return db;
	 //Instance method are methods which require an object of its class to be created before it can be called. To invoke a instance method, we have to create an Object of the class in which the method is defined.
 }
 private Dbconn() {
	 
 }
 public void connect() throws SQLException {
	 conn = DriverManager.getConnection(URL, "hites","");
 }
 public void close() throws SQLException {
	 conn.close();
 }
}
