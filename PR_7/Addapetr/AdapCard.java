package sem2.PR7.Addapetr;

public class AdapCard implements  USB{
    private final Card card;

    public AdapCard(Card card){
        this.card = card;
    }
    @Override
    public void runProcess() {
        card.check(1);
        card.runCop();
        card.check(0);
    }
}
