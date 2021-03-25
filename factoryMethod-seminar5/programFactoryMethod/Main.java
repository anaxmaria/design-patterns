package Seminar5.ro.ase.cts.programFactoryMethod;

import Seminar5.ro.ase.cts.claseFactoryMethod.*;

public class Main {

    public static void afisareInformatiiPersonalSpital(IFactory factory, String nume){
        //this is the client

        PersonalSpital personalSpital = factory.getPersonal(nume);

        System.out.println(personalSpital.toString());
    }

    public static void main(String[] args) {
        afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea");
        afisareInformatiiPersonalSpital(new FactoryBrancardier(), "Ioana");
        afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Maricica");
    }
}
