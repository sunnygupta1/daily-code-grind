package completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
	
	public static void main(String[] args) {

        CompletableFuture<Void> future =
                CompletableFuture.runAsync(() -> {

                    System.out.println("Task running in background");

                });

        System.out.println("Main thread continues");

        future.join();
        
        
        CompletableFuture.runAsync(()->{
        	System.out.println("sending mail");
        });
        System.out.println("main thred 2nd sysout");
    }

}
