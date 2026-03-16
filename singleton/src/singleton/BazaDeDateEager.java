package singleton;

public class BazaDeDateEager {

    private String denumire;
    private int numarCampuri;

    private BazaDeDateEager( String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    public static final BazaDeDateEager instanta = new BazaDeDateEager("Baza1", 3);

    public static BazaDeDateEager getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateEager{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}
