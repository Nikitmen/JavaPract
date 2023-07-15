package sem2.PR4;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService t1 = Executors.newFixedThreadPool(2);
        t1.submit(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it");
        });
        t1.submit(() -> System.out.println("Start"));
        t1.submit(() -> System.out.println("Start2"));
        t1.shutdown();
    }
}
