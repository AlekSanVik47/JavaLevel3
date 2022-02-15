package threadLesson.task_2;

import threadLesson.examle.CyclicBarrierApp;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class MainRaces {
	public static final int CARS_COUNT = 4;

	public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
		Race race = new Race(new Road(60), new Tunnel(), new Road(40));
		Car[] cars = new Car[CARS_COUNT];
		CyclicBarrier cyclicBarrier = new CyclicBarrier(CARS_COUNT);
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
		}
		for (int i = 0; i < cars.length; i++) {
			new Thread(cars[i]).start();
		}
		cyclicBarrier.await();
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");


	}
}

