package singlton;

public class Logger {
	
	private static Logger logger;
	
	//making constructor private
	private Logger() {
		
	}
	
	//created this static method so that we can call the private constroctor.
	public static Logger getLogger() {
		if (logger == null) {
			synchronized (Logger.class){   //used sychronized block to make it thread safe class
			 logger = new Logger();
		 }
		}
		return logger;
	}
	
	public void logMessege(String msg) {
		
		System.out.println("messege " + msg);
		
	}

}
