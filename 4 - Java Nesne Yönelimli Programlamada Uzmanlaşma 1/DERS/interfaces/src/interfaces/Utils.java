package interfaces;

public class Utils {
	// Static olarak tan�mlanan s�n�flar genelde "loglama" gibi s�rekli kullan�lan i�lemlerde tan�mlan�r.
	// Static metodlar "new" kullan�lmadan da SINIF ADIYLA ula��labilir.
	
	public static void runLoggers(Logger[] loggers, String message) {
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
}
