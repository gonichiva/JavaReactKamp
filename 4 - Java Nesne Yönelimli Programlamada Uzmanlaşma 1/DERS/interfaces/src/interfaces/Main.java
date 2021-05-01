package interfaces;

public class Main {

	public static void main(String[] args) {
		//CustomerManager customerManager = new CustomerManager(new SmsLogger());
		
		// Multi Logger
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		CustomerManager customerManager2 = new CustomerManager(loggers);
		
		
		Customer engin = new Customer(1, "Engin", "Demiro�");
		Customer ibrahim = new Customer(2, "�brahim Can", "Erdo�an");
		
		//customerManager.add(engin);
		customerManager2.add(ibrahim);
	}

}
