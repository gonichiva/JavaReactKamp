package interfaces;

// Burada sadece m��teriyi ilgilendiren metodlar bulunmal�d�r.

public class CustomerManager {
	
	//private Logger logger;
	
	/*public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	 */
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	//loosly - tightly coupled (Gev�ek ve Kat� Ba�lanma)
	
	public void add(Customer customer) {
		System.out.println("M��teri Eklendi " + customer.getFirstName());
		
		// #4 - Static metot olarak multi logger fonskiyon
		Utils.runLoggers(loggers, customer.getFirstName());
		
		// #3 - Loggerlar� sonradan de�i�tirilebilen ve birden fazla logger atanabilen kullan�m
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		// #2 - Logger� sonradan de�i�tirilebilen ancak tek logger ile s�n�rl� olan kullan�m
		//this.logger.log(customer.getFirstName());
		
		// #1 - T�m kodlarda ayr� ayr� olu�turulmas� gereken k�t� kullan�m
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veri taban�na logland�");*/
	} 
	
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi " + customer.getFirstName());
		
		// #4
		Utils.runLoggers(loggers, customer.getLastName());
		
		// #3
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		// #2
		//this.logger.log(customer.getFirstName());
		
		// #1
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veri taban�na logland�");*/
	}
	

}
