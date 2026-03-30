package SimpleFactory;

public class SupaDeVita extends Supa{

    private double gramaj;

    public SupaDeVita(String denumire, double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaSupa() {
        System.out.println("Supa de vita" + super.getDenumire() + " " + this.gramaj);
    }

}
