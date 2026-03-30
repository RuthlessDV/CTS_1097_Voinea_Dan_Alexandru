package FactoryMethod;

public class SupaDeLegume extends FelMancare{
    public SupaDeLegume(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaFelMancare() {
        System.out.println("Supa de legume" + super.getDenumire());
    }
}
