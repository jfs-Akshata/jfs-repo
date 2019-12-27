package multithreading;

import java.awt.Event;

import multithreading.model.EvenThread;
import multithreading.model.OddThread;

public class MultithreadedApplication {
	public static void main(String[] args) throws InterruptedException {
		// creating the threads
		EvenThread evenThread = new EvenThread();
		OddThread oddThread = new OddThread();
		evenThread.start();
		oddThread.start();
		evenThread.join();
		oddThread.join();
		for (int i = 1000; i < 1050; i += 2) {
			System.out.println(i);
		}
	}
}




