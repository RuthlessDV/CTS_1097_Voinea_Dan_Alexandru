package SimpleFactory;

public class FactorySupa {

    private static FactorySupa instanta;

    private FactorySupa(){

    }

    public static FactorySupa getInstanta(){
        if(FactorySupa.instanta == null){
            FactorySupa.instanta = new FactorySupa();
        }
            return FactorySupa.instanta;
    }

    public Supa getSupa(TipSupa tipSupa, String denumire) throws Exception{
        switch (tipSupa){
            case TipSupa.LEGUME -> {
                return new SupaDeLegume(denumire);
            }
            case TipSupa.CIUPERCI -> {
                return new SupaDeCiuperci(denumire);
            }
            default -> {
                throw new Exception("Tip Invalid");
            }
        }
    }

    public Supa getSupaVita(TipSupa tipSupa, String denumire, Double gramaj){
        switch (tipSupa){
            case TipSupa.VITA -> {
                return new SupaDeVita(denumire, gramaj);
            }
            default -> {
                try {
                    return this.getSupa(tipSupa, denumire);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
