package sem2.PR7.Decor;

public class Main {
    public static void main(String[] args) {
        InfoCar t1 = new BaseCar();
        System.out.println(t1.nameCar() + "\n" + t1.priceCar());

        InfoCar t2 = new NoBaseCar(t1);
        System.out.println(t2.nameCar() + "\n" + t2.priceCar());

        InfoCar t3 = new UltraCar(t2);
        System.out.println(t3.nameCar() + "\n" + t3.priceCar());
    }
}
