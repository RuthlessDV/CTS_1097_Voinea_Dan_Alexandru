package FactoryMethod;

public class SupaDeVita extends FelMancare{

    Double gramaj;
    public SupaDeVita(String denumire,Double gramaj) {
        super(denumire);
        this.gramaj = gramaj;
    }

    @Override
    public void afiseazaFelMancare() {
        System.out.println("Supa de ciuperci" + super.getDenumire() + " " + this.gramaj);
    }
}
