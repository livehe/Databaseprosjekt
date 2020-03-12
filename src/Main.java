package dbproj;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String hvem;
		
		int i = -1;
		while (i != 0) {
	        System.out.println("");
	        System.out.println("--- MAIN MENU --- ");
	        System.out.println("1: Finn navnet på alle rollene en gitt skuespiller har.");
	        System.out.println("2: Finne hvilke filmer en gitt skuespiller opptrer i.");
	        System.out.println("3: Finne hvilke filmselskap som lager flest filmer inne hver sjanger (grøssere, familie, o.l.).");
	        System.out.println("4: Sette inn en ny film.");
	        System.out.println("5: Legge til person.");
	        System.out.println("6: Legge til skuespiller i film.");
	        System.out.println("7: Legge til manusforfatter i film.");
	        System.out.println("8: Legge til regissør av film.");
	        System.out.println("9: Sette inn ny anmeldelse av en episode av en serie.");
	        
	        System.out.println("Hva vil du gjøre? Skriv inn tall her:  ");

	        i = myObj.nextInt();  // Read user input
	        myObj.nextLine();
	        System.out.println("");

	        		
	        switch (i) {
	            case 1:
	    	        System.out.println("Hva er navnet på skuespilleren? ");
	    	        hvem = myObj.nextLine();  // Read user input
	    	        System.out.println("Du har valgt " + hvem);  // Output user input
	        		RollerForSkuespiller test = new RollerForSkuespiller ();
	        		test.connect();
	        		test.printRollerForSkuespiller(hvem);
	        		break;
	            case 2:
	    	        System.out.println("Hva er navnet på skuespilleren? ");
	    	        hvem = myObj.nextLine();  // Read user input
	    	        System.out.println("Du har valgt " + hvem);  // Output user input
	        		FilmerForSkuespiller test2 = new FilmerForSkuespiller ();
	        		test2.connect();
	        		test2.printFilmerForSkuespiller(hvem);
	        		break;
	            case 3:
	        		FilmselskapFlestFilmerISjanger test3 = new FilmselskapFlestFilmerISjanger();
	        		test3.connect();
	        		test3.printFilmselskapFlestFilmerISjanger();
	    	        myObj.nextLine();
	                break;
	            case 4:
	            	SettInnFilm test4 = new SettInnFilm();
	            	test4.connect();
	            	
	            	System.out.println("Hva er id for filmen din? ");
	            	int FilmID = myObj.nextInt();
	    	        myObj.nextLine();
	    	        
	    	        System.out.println("Hva heter filmen din? ");
	    	        String Tittel = myObj.nextLine();
	    	        
	    	        System.out.println("Hvor lenge varer den?");
	            	int Lengde = myObj.nextInt();
	    	        
	    	        System.out.println("Når ble den utgitt? ");
	            	int Utgivelsesår = myObj.nextInt();
	            	
	    	        System.out.println("Når ble den lansert? ");
	            	int Lanseringsdato = myObj.nextInt();
	    	        myObj.nextLine();

	    	        System.out.println("Hvordan vil du beskrive den? ");
	    	        String Beskrivelse = myObj.nextLine();
	    	        
	    	        System.out.println("Hva er den laget for? ");
	    	        String LagetFor = myObj.nextLine();
	            	
	    	        System.out.println("Er den laget for video? (0 for nei, 1 for ja) ");
	            	int Video = myObj.nextInt();

	    	        test4.leggTilFilm(FilmID, Tittel, Lengde, Utgivelsesår, Lanseringsdato, Beskrivelse, LagetFor, Video);	 
	    	        break;
	    	        
	            case 5:
	            	SettInnFilm test5 = new SettInnFilm();
	            	test5.connect();
	    	        System.out.println("Hva er PID til personen? ");
	            	int PID = myObj.nextInt();
	    	        myObj.nextLine();
	            	
	    	        System.out.println("Hva heter personen? ");
	            	String Navn = myObj.nextLine();

	    	        System.out.println("Hva er fødselsåret til personen? ");
	            	int Fødselsår = myObj.nextInt();
	    	        myObj.nextLine();
	    	        
	    	        System.out.println("Hvilket land kommer personen fra? ");
	            	String Land = myObj.nextLine();
	            	
    	        	test5.leggTilPerson(PID, Navn, Fødselsår, Land);
    	        	break;
	            	
	            case 6:
	            	SettInnFilm test6 = new SettInnFilm();
	            	test6.connect();
	            	
	    	        System.out.println("Hva er PID til skuespilleren? ");
	            	int skuespillerPID = myObj.nextInt();
	    	        
	    	        System.out.println("Hva er filmID til skuespilleren? ");
	            	int skuespillerFilmID = myObj.nextInt();
	    	        myObj.nextLine();
	            	
	            	System.out.println("Hvilken rolle hadde skuespilleren? ");
	            	String Rolle = myObj.nextLine();

		    	    test6.leggTilSkuespiller(skuespillerPID, skuespillerFilmID, Rolle);
		    	    break;
	            case 7:
	            	SettInnFilm test7 = new SettInnFilm();
	            	test7.connect();
	            	
	    	        System.out.println("Hva er PID til manusforfatteren? ");
	            	int manusforfatterPID = myObj.nextInt();
	    	        
	    	        System.out.println("Hva er filmID til manusforfatteren? ");
	            	int manusforfatterFilmID = myObj.nextInt();
	    	        myObj.nextLine();

		    	    test7.leggTilManusforfatter(manusforfatterPID, manusforfatterFilmID);
	                break;
	            case 8:
	            	SettInnFilm test8 = new SettInnFilm();
	            	test8.connect();
	            	
	    	        System.out.println("Hva er PID til regissøren? ");
	            	int regissørPID = myObj.nextInt();
	    	        
	    	        System.out.println("Hva er filmID til regissøren? ");
	            	int regissørFilmID = myObj.nextInt();
	    	        myObj.nextLine();

		    	    test8.leggTilRegissør(regissørPID, regissørFilmID);
	            	break;
	            case 9:
	            	Anmeldelse test9 = new Anmeldelse();
	            	test9.connect();
	            	
	            	System.out.println("Hva er AnmID for din anmeldelse? ");
	            	int AnmID = myObj.nextInt();
	    	        myObj.nextLine();

	            	System.out.println("Hva vil du din anmeldelse skal si? ");
	            	String Tekst = myObj.nextLine();
	            	
	            	System.out.println("Hva vil du rate episoden? ");
	            	int Rating = myObj.nextInt();
	    	        myObj.nextLine();	
	    	        
	            	System.out.println("Hva er ditt brukernavn? ");
	            	String Brukernavn = myObj.nextLine();
	            	
	    	        System.out.println("Hva er filmID til episoden? ");
	            	int anmeldelseFilmID = myObj.nextInt();
	    	        myObj.nextLine();
	            	
	    	        test9.leggTilAnmeldelse(AnmID, Tekst, Rating, Brukernavn, anmeldelseFilmID);	            	
	                break;
	        }
		
		}
		myObj.close();

	}
}
