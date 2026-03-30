package factory;

public class FactoryBrancardier extends FactoryMethodPersonal {

    @Override
    public PersonalSpital createPersonal() {
        return new Brancardier();
    }

    // Simple Factory
    public PersonalSpital crearePersonal(TipPersonalSpital tipPersonalSpital) {
        switch (tipPersonalSpital) {
            case Brancardier:
                return new Brancardier();
            case Medic:
                return new Medic();
            case Asistent:
                return new Asistent();
            default:
                throw new IllegalArgumentException("Tip invalid: " + tipPersonalSpital);
        }
    }
}