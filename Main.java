package dbproj;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RollerForSkuespiller test = new RollerForSkuespiller ();
		test.connect();
		test.printRollerForSkuespiller("Elsa");
		
		FilmerForSkuespiller test2 = new FilmerForSkuespiller ();
		test2.connect();
		test2.printFilmerForSkuespiller("Elsa");
		
		FilmselskapFlestFilmerISjanger test3 = new FilmselskapFlestFilmerISjanger();
		test3.connect();
		test3.printFilmselskapFlestFilmerISjanger();
        

		
		System.out.println("Kom meg gjennom main!");

	}

}
