package multithreading;											
public class Main {
    public static void main(String[] args) throws InterruptedException {
    	
    	//here we just created object of Thread one class and called start method
        ThreadOne t1 = new ThreadOne();
        t1.start();	
        System.out.println(t1.getState());
        
        //here we need to first create obj of threadTwo class and the need to create obj of java inbuilt thread class. then pass the t2 obj in constructor.
        ThreadTwo t2 = new ThreadTwo();
        Thread t= new Thread(t2);
        
        t.start();
        
        //this join will make main thred wait till both thread are completed
        t.join();
        t1.join();
        System.out.println("main thread");
        
    }
}