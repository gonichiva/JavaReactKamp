
public class Lists {

	public static void main(String[] args) {
		
		// List
		String[] krediler = 
			{
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"MSB Kredisi",
				"K�lt�r Bakanl��� Kredisi"
			};
		
		// For-each Loop
		for(String kredi:krediler){
			
			System.out.println(kredi);

		}
		
		System.out.println("----------------------");
		
		// For Loop
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
