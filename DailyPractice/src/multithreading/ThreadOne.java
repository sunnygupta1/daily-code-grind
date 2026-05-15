package multithreading;

class ThreadOne extends Thread {
    public void run() {
    	for(int i=0; i<=2; i++) {
        System.out.println("Thread one by extending Thread class");
//        try {
//        	//it will wait for 5 sec
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//		}
    	}
    }
}


