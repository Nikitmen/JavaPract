package sem2.PR8.Shablon_Method;

public abstract class InfoCar {
    public final void infocar(){
        model();
        price();
    }
    protected abstract void model();
    protected abstract void price();
}
