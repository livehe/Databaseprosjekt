package dbproj;

import java.sql.*;

public class FilmselskapFlestFilmerISjanger extends DBConn {
	
	public void printFilmselskapFlestFilmerISjanger() {
		try {
			Statement stmt = conn.createStatement();
			String query = "select Sjangernavn from Sjanger";

			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString("Sjangernavn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	
	}
}