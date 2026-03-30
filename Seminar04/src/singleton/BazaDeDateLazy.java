package singleton;

public class BazaDeDateLazy {

    private String denumire;
    private int numarCampuri;

    private BazaDeDateLazy( String denumire, int numarCampuri) {
        this.denumire = denumire;
        this.numarCampuri = numarCampuri;
    }

    public static BazaDeDateLazy instanta = null;

    public static BazaDeDateLazy getInstanta(String denumire, int numarCampuri) {
        if(instanta==null){
          instanta = new BazaDeDateLazy(denumire,numarCampuri);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "singleton.BazaDeDateLazy{" +
                "denumire='" + denumire + '\'' +
                ", numarCampuri=" + numarCampuri +
                '}';
    }
}
