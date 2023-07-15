package sem2.PR6.AbsFabric;

public class USDPriceCar implements NameMark{
    @Override
    public Lada getLada() {
        return new USDLada();
    }
    @Override
    public Reno getReno() {
        return new USDReno();
    }

    @Override
    public Kia getKia() {
        return new USDKia();
    }
}
