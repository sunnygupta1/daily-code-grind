package future;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 1. Create a Callable (The chef making the pizza)
        Callable<Integer> complexTask = () -> {
            System.out.println("Worker Thread: Calculating...");
            Thread.sleep(3000); // Simulate task taking 3 seconds
            return 42; // Returns a value!
        };

        // 2. Submit task and instantly get a Future (The token receipt)
        System.out.println("Main Thread: Submitting task...");
        Future<Integer> futureResult = pool.submit(complexTask);
        
        // 3. Main thread is NOT blocked! It can do other things.
        System.out.println("Main Thread: Doing other work while waiting...");
        
        // 4. Redeem the token to get the result
        // WARNING: .get() is a BLOCKING call. If the result isn't ready yet, 
        // the main thread will freeze here and wait.
        Integer finalAnswer = futureResult.get(); 
        
        System.out.println("Main Thread: The answer is " + finalAnswer);

        pool.shutdown();
    }
}
