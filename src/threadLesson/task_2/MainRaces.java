package threadLesson.task_2;

import threadLesson.examle.CyclicBarrierApp;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainRaces {
	public static final int CARS_COUNT = 4;

	public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
		CountDownLatch finish = new CountDownLatch(CARS_COUNT);
		CyclicBarrier start = new CyclicBarrier(CARS_COUNT +1);
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
		Race race = new Race(new Road(60), new Tunnel(CARS_COUNT/2), new Road(40));
		Car[] cars = new Car[CARS_COUNT];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(race, 20 + (int) (Math.random() * 10), finish, start);
		}
		for (int i = 0; i < cars.length; i++) {
			new Thread(cars[i]).start();
		}
		start.await();
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
		start.await();
		finish.await();
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");


	}
}

