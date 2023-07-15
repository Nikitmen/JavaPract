package sem2.PR6.AbsFabric;

public class RuPriceCar implements NameMark {

    @Override
    public Lada getLada() {
        return new RuLada();
    }

    @Override
    public Reno getReno() {
        return new RuReno();
    }

    @Override
    public Kia getKia() {
        return new RuKia();
    }
}
