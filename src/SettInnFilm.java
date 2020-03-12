package dbproj;

import java.sql.*;

public class SettInnFilm extends DBConn {
	
	public void leggTilFilm(int FilmID, String Tittel, int Lengde, int Utgivelses�r, int Lanseringsdato, String Beskrivelse, String LagetFor, int Video) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Film VALUES ((?), (?), (?), (?), (?), (?), (?), (?))"); 
            stmt.setInt(1, FilmID);
            stmt.setString(2, Tittel);
            stmt.setInt(3, Lengde);
            stmt.setInt(4, Utgivelses�r);
            stmt.setInt(5, Lanseringsdato);
            stmt.setString(6, Beskrivelse);
            stmt.setString(7, LagetFor);
            stmt.setInt(8, Video);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Film");
        }
		
	}
	
	public void leggTilPerson(int PID, String Navn, int F�dsels�r, String Land) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Person VALUES ( (?), (?), (?), (?))"); 
            stmt.setInt(1, PID);
            stmt.setString(2, Navn);
            stmt.setInt(3, F�dsels�r);
            stmt.setString(4, Land);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Person");
        }
		
	}
	
	public void leggTilSkuespiller(int PID, int FilmID, String Rolle) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Skuespiller VALUES ( (?), (?), (?));"); 
            stmt.setInt(1, PID);
            stmt.setInt(2, FilmID);
            stmt.setString(3, Rolle);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Skuespiller");
        }
	}
	public void leggTilManusforfatter(int PID, int FilmID) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Manusforfatter VALUES ( (?), (?));"); 
            stmt.setInt(1, PID);
            stmt.setInt(2, FilmID);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Manusforfatter");
        }
	}
	public void leggTilRegiss�r(int PID, int FilmID) {
        try { 
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Regiss�r VALUES ( (?), (?));"); 
            stmt.setInt(1, PID);
            stmt.setInt(2, FilmID);
            stmt.execute();
        } catch (Exception e) { 
            System.out.println("db error during prepare of insert into Regiss�r");
        }
	}
	

}
