import SimpleFactory.FactorySupa;
import SimpleFactory.Supa;
import SimpleFactory.TipSupa;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa = FactorySupa.getInstanta();
        try{
            Supa supa1 = factorySupa.getSupa(TipSupa.LEGUME, "Supa1");
            Supa supa2 = factorySupa.getSupa(TipSupa.CIUPERCI,"supa2");
            Supa supa3 = factorySupa.getSupaVita(TipSupa.VITA, "supa3", 200.0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}