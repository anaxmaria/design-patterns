package Seminar5.ro.ase.cts.programSimpleFactory;

import Seminar5.ro.ase.cts.claseSimpleFactory.FactoryPersonal;
import Seminar5.ro.ase.cts.claseSimpleFactory.PersonalSpital;
import Seminar5.ro.ase.cts.claseSimpleFactory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();

        //cu ajutorul fabricii creem doi angajati
        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "Radu");
        PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Raluca");

        System.out.println(asistent);
        System.out.println(medic);
    }
}
