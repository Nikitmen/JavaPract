package sem2.PR3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class Main {
    static  Map<Integer,String> map = new HashMap<>();
    static volatile int buf = 0;
    private static final Semaphore semaphore = new Semaphore(1);
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        list.add("Первый 1");
        list.add("Второй 2");
        list.add("Третий 3");
        map.put(1, "RES 1");
        map.put(2, "RES 2");
        map.put(3, "RES 3");

        Thread one = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println(list.get(0));
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread two = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println(list.get(1));
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread three = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println(list.get(2));
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread m1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                increment(1);
            }
            buf = 0;
        });
        Thread m2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                increment(2);
            }
            buf = 0;
        });
        Thread m3 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                increment(3);
            }
            buf = 0;
        });
        one.start();
        two.start();
        three.start();
        m1.start();
        m2.start();
        m3.start();
    }
    synchronized static void increment(int number) {
        buf++;
        System.out.println("Thread m" + number + " : " + map.get(buf));
    }

}

