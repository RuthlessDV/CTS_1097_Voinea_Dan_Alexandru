import singleton.BazaDeDateLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BazaDeDateLazy instanta = BazaDeDateLazy.getInstanta("Baza1",3);
        System.out.println(instanta);

        BazaDeDateLazy instanta1 = BazaDeDateLazy.getInstanta("Baza2",4);
        System.out.println(instanta1);
        if(instanta==instanta1)
        {
            System.out.println(instanta);
        }

        FactoryBrancardier factory = new FactoryBrancardier();

        PersonalSpital p1 = factory.crearePersonal(TipPersonalSpital.Medic);
        PersonalSpital p2 = factory.crearePersonal(TipPersonalSpital.Asistent);

        System.out.println(p1); // Medic
        System.out.println(p2); // Asistent

        FactoryMethodPersonal factory1 = new FactoryBrancardier();
        FactoryMethodPersonal factory2 = new FactoryMedic();
        FactoryMethodPersonal factory3 = new FactoryAsistent();

        PersonalSpital p1 = factory1.createPersonal();
        PersonalSpital p2 = factory2.createPersonal();
        PersonalSpital p3 = factory3.createPersonal();

        System.out.println(p1); // Brancardier
        System.out.println(p2); // Medic
        System.out.println(p3); // Asistent


    }
}