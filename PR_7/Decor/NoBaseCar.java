package sem2.PR7.Decor;

public class NoBaseCar implements InfoCar {
    private final InfoCar car;

    public NoBaseCar(InfoCar car){
        this.car = car;
    }

    @Override
    public String nameCar() {
        return this.car.nameCar() + " + SportPacket";
    }
    @Override
    public int priceCar() {
        return this.car.priceCar() + 10000;
    }
}
