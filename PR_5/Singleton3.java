package sem2.PR5;

public class Singleton3 {
    private Singleton3(){
        System.out.println("Только один обьект! через внутрений класс");
    }
    private static class K1{
        public static  final  Singleton3 zxc = new Singleton3();
    }
    public static Singleton3 getInstance(){
        return K1.zxc;
    }
}
