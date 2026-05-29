package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceExample {
    public static void main(String[] args) {
        // We hire 3 "full-time waiters" (A Thread Pool of size 3)
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // We have 10 tasks (customers) to process
        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            
            // We SUBMIT the task to the pool. We don't create a thread!
            pool.submit(() -> {
                System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
            });
        }

        // Tell the manager to close the restaurant when the queue is empty
        pool.shutdown();
    }
}