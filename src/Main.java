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
	        System.out.println("4: Sette inn en ny film med regissør, manusforfattere, skuespillere og det som hører med.");
	        System.out.println("5: Sette inn ny anmeldelse av en episode av en serie.");
	        
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
	                break;
	        }
		
		}
		myObj.close();

	}
}
