package FactoryMethod;

public class SupaDeCiuperci extends FelMancare{
    public SupaDeCiuperci(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaFelMancare() {
        System.out.println("Supa de ciuperci" + super.getDenumire());
    }
}
