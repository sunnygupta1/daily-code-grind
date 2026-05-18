package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample{
	
	public static void main(String args[]) {
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		ThreadTwo t = new ThreadTwo();
		
		service.submit(t);
//		service.submit(new ThreadTwo());
//		service.submit(new ThreadTwo());
//		service.submit(new ThreadTwo());
		
		service.shutdown();
		
		
		
	}

}
