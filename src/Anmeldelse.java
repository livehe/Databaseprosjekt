package dbproj;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Anmeldelse extends DBConn{
	
	public void leggTilAnmeldelseAvEpisode(int AnmID, String Tekst, int Rating, String Brukernavn, int FilmID) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("insert into Anmeldelse values ( (?), (?), (?), (?), (?));"); 
            stmt.setInt(1, AnmID);
            stmt.setString(2, Tekst);
            stmt.setInt(3, Rating);
            stmt.setString(4, Brukernavn);
            stmt.setInt(5, FilmID);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Anmeldelse");
        }
	}
	
	public void leggTilBruker(String Brukernavn) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("insert into Bruker values ((?));"); 
            stmt.setString(1, Brukernavn);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Bruker");
        }
	}
	public void leggTilAnmeldelse(int AnmID, String Tekst, int Rating, String Brukernavn, int FilmID) {
        try {
			PreparedStatement stmt = conn.prepareStatement("select Brukernavn from Bruker where Brukernavn = (?);");
            stmt.setString(1, Brukernavn);
            ResultSet rs = stmt.executeQuery();
            if(!rs.next()) {
            	leggTilBruker(Brukernavn);
            }
        	leggTilAnmeldelseAvEpisode(AnmID, Tekst, Rating, Brukernavn, FilmID);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

