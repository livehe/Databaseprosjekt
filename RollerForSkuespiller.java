package dbproj;

import java.sql.*;

public class RollerForSkuespiller extends DBConn {
	
    
	public void printRollerForSkuespiller(String Navn) {
		
		try {
			
			PreparedStatement stmt = conn.prepareStatement("select PID from person where Navn = (?)");
			stmt.setString(1, Navn);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(Navn + " med PID " + rs.getString("PID") + " har hatt rollene:");
				PreparedStatement rolleStmt = conn.prepareStatement("select rolle from skuespiller where PID = (?)");
				rolleStmt.setInt(1, rs.getInt("PID"));
				ResultSet rs2 = rolleStmt.executeQuery();
				while (rs2.next()) {
					System.out.println(rs2.getString("Rolle"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
