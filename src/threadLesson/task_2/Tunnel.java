package threadLesson.task_2;

import java.util.concurrent.Semaphore;

import static threadLesson.task_2.MainRaces.CARS_COUNT;

public class Tunnel extends Stage {
	public Tunnel() {
		this.length = 80;
		this.description = "Тоннель " + length + " метров";
	}
	Semaphore smp = new Semaphore(CARS_COUNT/2);

	@Override
	public void go(Car c) {
		try {
			try {
				System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
				smp.acquire();
				System.out.println(c.getName() + " начал этап: " + description);
				Thread.sleep(length / c.getSpeed() * 1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println(c.getName() + " закончил этап: " + description);
				smp.release();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}