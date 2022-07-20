package mysql;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        var db = Dbconn.instance();
        try {
			db.connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot Connect to database");
		}
        System.out.println("Connected");
        UserDao userDao = new UserDaoImpl();
        userDao.save(new User("Hitesh"));
        userDao.save(new User("Divya"));
        
        try {
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot Close");
		}
    }
}
