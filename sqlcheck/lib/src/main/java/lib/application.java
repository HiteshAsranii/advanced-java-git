package lib;

import java.sql.DriverManager;
import java.sql.SQLException;

public class application {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  String dbUrl= "jdbc:mysql://localhost:3306/people";
	  DriverManager.getConnection(dbUrl);
	  var conn =DriverManager.getConnection(dbUrl,"hites","");
	  var stmt =conn.createStatement();
	  var sql= "create table if not exists user(id integer primary key, name text not null)";
	  stmt.execute(sql);
	  stmt.close();
	  conn.close();
  }
}
