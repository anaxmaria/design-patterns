package Seminar5.ro.ase.cts.claseFactoryMethod;

public class FactoryInfirmier implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}
