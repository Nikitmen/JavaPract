package sem2.PR5;

public enum Singleton2 {
    INSTANCE;
    private Singleton2() {
        System.out.println("Только один обьект! здесь мы работает с enum");
    }
}
