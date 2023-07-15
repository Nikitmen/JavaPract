package sem2.PR6.Bulder;

public class Build {
    private Builder builder;

    public Build(int i){
        if(i == 1){
            builder = new Zavod1();
        }
        else builder = new Zavod2();
    }
    public Car cari(){
        return builder.buildCar();
    }
}
