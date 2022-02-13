package threadLesson.examle;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimplestLockApp {
	public static void main(String[] args) {
		final Lock lock = new ReentrantLock();
		new Thread(() -> {
			try {
				lock.lock();
				// Критическая секция
			} finally {
				lock.unlock();
			}
		}).start();
	}

}
