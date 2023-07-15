package sem2.PR6.AbsFabric;

public class main {
    public static void main(String[] args) {
        String val = "USD";
        String mark = "Lada";
        if (val.equals("Ru")){
            RuPriceCar t1 = new RuPriceCar();
            if (mark.equals("Lada")){
                Lada lada = t1.getLada();
                System.out.println(lada.getPriceLada());
            }
        }
        else{
            USDPriceCar t2 = new USDPriceCar();
            if (mark.equals("Lada")){
                Lada lada = t2.getLada();
                System.out.println(lada.getPriceLada());
            }
        }
    }
}
