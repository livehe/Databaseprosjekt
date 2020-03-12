package dbproj;

import java.sql.PreparedStatement;

public class Anmeldelse extends DBConn{
	
	public void leggTilAnmeldelseAvEpisode( ) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Regissør Anmeldelse ( (?), (?))"); 
            stmt.setInt(1, PID);
            stmt.setInt(2, FilmID);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Anmeldelse");
        }
	}

}
