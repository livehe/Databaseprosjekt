import java.util.*; 

public class Film {
	int filmid;
	String tittel;
	int lengde;
	int utgivelsesaar;
	Date langseringsdato;
	String beskrivelse;
	String lagetfor;
	boolean video;
	
	public Film(int filmid, String tittel, int lengde, int utgivelsesaar, Date langseringsdato, String beskrivelse,
			String lagetfor, boolean video) {
		super();
		this.filmid = filmid;
		this.tittel = tittel;
		this.lengde = lengde;
		this.utgivelsesaar = utgivelsesaar;
		this.langseringsdato = langseringsdato;
		this.beskrivelse = beskrivelse;
		this.lagetfor = lagetfor;
		this.video = video;
	}
	
}
