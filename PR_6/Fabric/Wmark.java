package sem2.PR6.Fabric;

public class Wmark {

    public Product chatozamarka(String name){
        if (name.equals("LADA")){
            return new Ladamark();
        }
        else{
            return new Renomark();
        }
    }
}
