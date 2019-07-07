package testlambada;


@FunctionalInterface
interface Cab{
	void bookCab();
	
}



/*
class Uberx implements Cab{
	public void bookCab() {
		System.out.println("Grab is arriving");
	}
}

*/
public class lambada {
	
	
	
	public static void main(String[] args) {
		//Cab cab = new Uberx();
		//cab.bookCab();
		Cab cab = new Cab() {
			
			@Override
			public void bookCab() {
				System.out.println("Grab is arriving");
				
			}
		};
//	cab.bookCab();
	Cab cab1 = () -> { 
		System.out.println("Grab is arriving");
	};
	cab1.bookCab();
	}
	
	
	
};


