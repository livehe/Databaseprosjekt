package dbproj;

import java.sql.PreparedStatement;

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
            PreparedStatement stmt = conn.prepareStatement("insert into Anmeldelse values ((?));"); 
            stmt.setString(1, Brukernavn);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Bruker");
        }
	}
}

