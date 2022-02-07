package threadLesson;

public class Multithreading {

    private final Object monitor = new Object();
    private volatile char currentChar = 'A';

    public void printA() {
        synchronized (monitor) {
            try {
                for (int i = 0; i <= 4; i++) {

                    while (currentChar != 'A') {
                        monitor.wait();
                    }
                    System.out.print("A");
                    currentChar = 'B';
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (monitor) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (currentChar != 'B') {
                        monitor.wait();
                    }
                    System.out.print("B");
                    currentChar = 'C';
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printC() {
        synchronized (monitor) {
            try {
                for (int i = 0; i <= 4; i++) {
                    while (currentChar != 'C') {
                        monitor.wait();
                    }
                    System.out.print("C");
                    currentChar = 'A';
                    monitor.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Multithreading waitNotify = new Multithreading();
        Thread threadA = new Thread(waitNotify::printA);
        Thread threadB = new Thread(waitNotify::printB);
        Thread threadC = new Thread(waitNotify::printC);
        threadA.start();
        threadB.start();
        threadC.start();


    }
}
