package sem2.PR7.Decor;

public class UltraCar implements InfoCar{

    private final InfoCar caro;

    public UltraCar(InfoCar caro) {
        this.caro = caro;
    }

    @Override
    public String nameCar() {
        return this.caro.nameCar() + " + R18";
    }

    @Override
    public int priceCar() {
        return this.caro.priceCar() + 30000;
    }
}
