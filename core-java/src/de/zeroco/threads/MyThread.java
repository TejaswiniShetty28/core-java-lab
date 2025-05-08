package de.zeroco.threads;

public class MyThread implements Runnable {
	@Override
	public void run() {
		sum();
	}
	
//	public int sum() {
//	    int result = 0; 
//	    for (int i = 0; i <= 5; i++) {
//	        result += i; 
//	    }
//	    return result;
//	}
	
	public int sum() {
		int result = 0;
		try {
			for (int i = 0; i <= 5; i++) {
				result += i;
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main() {
		MyThread threadOne = new MyThread();
		MyThread threadTwo = new MyThread();
		threadOne.run();
		threadTwo.run();
	}
}
