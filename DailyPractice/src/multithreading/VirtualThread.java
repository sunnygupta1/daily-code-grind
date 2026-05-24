package multithreading;

public class VirtualThread {

    public static void main(String[] args)
            throws InterruptedException {

    	
    	//its feature of java 21
        Thread.startVirtualThread(() -> {

            System.out.println("Virtual Thread Running");

            System.out.println(Thread.currentThread());
        });

        Thread.sleep(1000);
    }
}