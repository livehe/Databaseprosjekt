package databaseprosjekt;

import java.sql.*;
import java.util.*;

public abstract class DBConn {

    protected Connection conn;

    public DBConn () {
    }

    public void connect() {
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 8.0.	    
            // Properties for user and password.
            Properties p = new Properties();
            p.put("user", "root");
            p.put("password", "**********");           
	    //  conn = DriverManager.getConnection("jdbc:mysql://mysql.ansatt.ntnu.no/sveinbra_ektdb?autoReconnect=true&useSSL=false",p);
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbprosjekt?autoReconnect=true&useSSL=false",p);
        } catch (Exception e)
    	{
            throw new RuntimeException("Unable to connect", e);
    	}
    }

    public void addSomething(Scanner scanner) {} // istedenfor addMedium()
    
    public static void main(String[] args) {
		DBConn c = new DBConn();
		c.connect();
	}

}
