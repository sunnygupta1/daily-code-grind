package singlton;

public class Logger {
	
	private static Logger logger;
	
	//making constructor private
	private Logger() {
		
	}
	
	//created this static method so that we can call the proivate constroctor.
	public static Logger getLogger() {
		if (logger == null) {
		 logger = new Logger();
		}
		return logger;
	}
	
	public void logMessege(String msg) {
		
		System.out.println("messege " + msg);
		
	}

}
