package singlton;

public class TestSingltonLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger log =  Logger.getLogger();
		
		log.logMessege("this is msg from logger");

	}

}
