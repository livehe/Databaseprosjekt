package dbproj;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmerForSkuespiller extends DBConn {
	
	public void printFilmerForSkuespiller(String Navn) {
		try {		
			PreparedStatement stmt = conn.prepareStatement("select PID from person where Navn = (?);");
			stmt.setString(1, Navn);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(Navn + " med PID " + rs.getString("PID") + " har vært med i filmene:");
				PreparedStatement rolleStmt = conn.prepareStatement("select Tittel from skuespiller natural join film where PID = (?)");
				rolleStmt.setInt(1, rs.getInt("PID"));
				ResultSet rs2 = rolleStmt.executeQuery();
				while (rs2.next()) {
					System.out.println(rs2.getString("Tittel"));
				}
		        System.out.println("");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
