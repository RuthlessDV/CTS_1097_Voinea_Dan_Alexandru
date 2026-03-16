package factory;

public class FactoryMedic extends FactoryMethodPersonal {
    @Override
    public PersonalSpital createPersonal() {
        return new Medic();
    }
}