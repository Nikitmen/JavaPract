package sem2.PR8.Strategia;

public class Main {
    public static void main(String[] args) {
//        CasCar t1 = new CasCar();
        AnyCar t1 = new AnyCar();
        t1.setT1(new Electro());
        t1.fill();
    }
}
