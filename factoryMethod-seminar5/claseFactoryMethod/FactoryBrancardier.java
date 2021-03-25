package Seminar5.ro.ase.cts.claseFactoryMethod;

public class FactoryBrancardier implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
