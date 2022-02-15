package threadLesson.task_2;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
	private static int CARS_COUNT;


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

	public Car(Race race, int speed) {
		this.race = race;
		this.speed = speed;
		CARS_COUNT++;
		this.name = "Участник #" + CARS_COUNT;
	}

	@Override
	public void run() {
		CyclicBarrier cbr = new CyclicBarrier(CARS_COUNT);
		try {
			System.out.println(this.name + " готовится");
			Thread.sleep(500 + (int) (Math.random() * 800));
			System.out.println(this.name + " готов");
			cbr.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < race.getStages().size(); i++) {
			race.getStages().get(i).go(this);
		}
	}

	public static void main(String[] args) {
		new Car(new Race(), 100).run();
	}
}
