package multithreading;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<=2; i++) {
		System.out.println("thread two by implementing runnable interface");
		}
	}
	
}
