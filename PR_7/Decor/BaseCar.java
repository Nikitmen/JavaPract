package sem2.PR7.Decor;

public class BaseCar implements InfoCar{
    @Override
    public String nameCar() {
        return "BaseCar_koko";
    }

    @Override
    public int priceCar() {
        return 20000;
    }
}
