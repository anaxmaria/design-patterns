package Seminar5.ro.ase.cts.claseSimpleFactory;

public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal tip, String nume){
        switch (tip){
            case Brancardier:
                return new Brancardier(nume);
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            default:
                throw new IllegalArgumentException();
        }
    }
}
