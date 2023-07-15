package sem2.PR6.Bulder;

public class Zavod1 extends Builder{
    public Zavod1(){
        car = new Car();
    }

    @Override
    public Car buildCar() {
        car.corp();
        car.wheels();
        Engine eng = new Eng1();
        car.Eng(eng);
        return car;
    }
}
