package threadLesson;

public class Multithreading  {

    private  Object monitor = new Object();
    private volatile char currentChar = 'A';

    public synchronized void printA() {
        //synchronized (monitor) {
            // try {
            for (int i = 0; i <= 4; i++) {
        //        synchronized (monitor) {
                while (currentChar != 'A') {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.print("A");
                currentChar = 'B';
                notifyAll();
            }
        //}
        //}
    }

    public synchronized void printB() {
       //     synchronized (monitor) {
                for (int i = 0; i <= 4; i++) {
        //            synchronized (monitor) {
                        while (currentChar != 'B') {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                            }
                        }
                        System.out.print("B");
                        currentChar = 'C';
                        notifyAll();
                    }
    //            }
        //}
    }

    public synchronized void printC() {
      //  synchronized (monitor) {
                for (int i = 0; i <= 4; i++) {
//                    synchronized (monitor) {
                        while (currentChar != 'C') {
                            try {
                                wait();
                            } catch (InterruptedException e) {
                            }
                        }
                        System.out.print("C");
                        currentChar = 'A';
                        notifyAll();
                    }
          //      }
        //}
    }

    public static void main(String[] args) {
        Multithreading waitNotify = new Multithreading();
        Thread threadA = new Thread(waitNotify::printA);
        Thread threadB = new Thread(waitNotify::printB);
        Thread threadC = new Thread(waitNotify::printC);
        //for (int i = 0; i <= 4; i++) {
            threadA.start();
            threadB.start();
            threadC.start();
        //}


    }


}
