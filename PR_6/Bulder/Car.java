package sem2.PR6.Bulder;

public class Car {
    public  void corp(){
        System.out.println("Корпус");
    }
    public void wheels(){
        System.out.println("Колеса");
    }
    public  void Eng(Engine engine){
        System.out.println("Двигатель №" + engine.getTypeeng());
    }
}
