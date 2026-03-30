package factory;

public class FactoryAsistent extends FactoryMethodPersonal {
    @Override
    public PersonalSpital createPersonal() {
        return new Asistent();
    }
}