package interfaces;

// Inheritance s�n�flar "implements" ile s�n�fa metodlar eklenir!!
public class SmsLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi: " + message);
	}

}
