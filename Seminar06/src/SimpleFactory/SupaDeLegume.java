package SimpleFactory;

public class SupaDeLegume extends Supa
{
    public SupaDeLegume(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaSupa() {
        System.out.println("Supa de legume" + super.getDenumire());
    }
}
