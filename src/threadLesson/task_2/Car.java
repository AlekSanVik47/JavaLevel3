package threadLesson.task_2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
	private static int CARS_COUNT;
	private CyclicBarrier cbr;
	private CountDownLatch cdl;

	static {
		CARS_COUNT = 0;
	}

	private Race race;
	private int speed;
	private String name;

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public Car(Race race, int speed, CountDownLatch cdl, CyclicBarrier cbr) {
		this.race = race;
		this.speed = speed;
		CARS_COUNT++;
		this.name = "Участник #" + CARS_COUNT;
		this.cdl = cdl;
		this.cbr = cbr;
	}

	@Override
	public void run() {
		try {
			System.out.println(this.name + " готовится");
			Thread.sleep(500 + (int) (Math.random() * 800));
			System.out.println(this.name + " готов");
			cbr.await();
			System.out.println(this.name + " ждет сигнала старта");
			cbr.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < race.getStages().size(); i++) {
			race.getStages().get(i).go(this);
		}
		if (!race.isWinnerExist().getAndSet(true)){
			System.out.println(this.name  + " Победитель!");
		}
		cdl.countDown();
	}

}
