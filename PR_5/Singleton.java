package sem2.PR5;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
        System.out.println("Только один обьект! через ленивую реализацию");
    }

    //    public static synchronized  Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//            return singleton;
//        }
//        System.out.println("Только один обьект! Больше нельзя");
//        return singleton;
//    }
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
