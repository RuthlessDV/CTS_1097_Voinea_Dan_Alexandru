package SimpleFactory;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaSupa() {
        System.out.println("Supa de ciuperci" + super.getDenumire());
    }
}
