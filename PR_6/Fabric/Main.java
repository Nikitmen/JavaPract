package sem2.PR6.Fabric;

public class Main {
    public static void main(String[] args) {
        Wmark t1 = new Wmark();
        Product t2 = t1.chatozamarka("LADA");
        Product t3 = t1.chatozamarka("RENO");
        t2.Namemark();
        t3.Namemark();
    }
}
