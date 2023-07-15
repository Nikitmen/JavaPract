package sem2.PR6.Prototip;

public class COPO implements Proto {
    public enum Type{
        ONE, TWO
    }
    @Override
    public COPO copy(){
        COPO t1 = new COPO();
        return t1;
    }
    public void setType(Type type){
    }
}
