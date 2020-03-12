package dbproj;

import java.sql.*;

public class FilmselskapFlestFilmerISjanger extends DBConn {
	
	public void printFilmselskapFlestFilmerISjanger() {
		try {
			Statement stmt = conn.createStatement();
			String query = "select Sjangernavn, UtgiverID, MAX(AntFilmerPrSjangerPrUtgiver) as AntFilmerPrSjangerPrUtgiverMAX"
					+ " from ( select Sjangernavn, UtgiverID, COUNT(Sjangernavn) as AntFilmerPrSjangerPrUtgiver"
					+ " from (Utgitt as U natural join FilmSjanger as SF) natural join Sjanger as S"
					+ " group by Sjangernavn, UtgiverID ) as Megajoin"
					+ " group by Sjangernavn";			
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("I sjangeren " + rs.getString("Sjangernavn") + " er det filmselskapet med id "+ rs.getString("UtgiverID")+ " som har flest filmer med "+rs.getString("AntFilmerPrSjangerPrUtgiverMAX") + " filmer.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}	
	}
}