package sem2.PR6.Prototip;

public class main {
    public static void main(String[] args) {
        COPO zxc = new COPO();
        COPO zxcclone = zxc.copy();
        zxcclone.setType(COPO.Type.ONE);
    }
}
