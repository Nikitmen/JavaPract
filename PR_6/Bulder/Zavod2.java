package sem2.PR6.Bulder;

public class Zavod2 extends Builder{
    public Zavod2(){
        car = new Car();
    }

    @Override
    public Car buildCar() {
        car.corp();
        car.wheels();
        Engine eng = new Eng1();
        car.Eng(eng);
        car.wheels();
        eng = new Eng2();
        car.Eng(eng);
        return car;
    }
}
